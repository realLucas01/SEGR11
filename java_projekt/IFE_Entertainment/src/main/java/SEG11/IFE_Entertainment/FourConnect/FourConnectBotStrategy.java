/*
 * 1.0 2026-04-19 Luca Tauscher
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Gervithrall Systems GmbH ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Gervithrall Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */


package SEG11.IFE_Entertainment.FourConnect;
import SEG11.IFE_Entertainment.GameCore.IMoveStrategy;
import SEG11.IFE_Entertainment.GameCore.IPlayArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.*;
import java.security.SecureRandom;

/**
 * Implementiert {@link IMoveStrategy} und stellt zwei Bot strategien für das Vier Gewinnt Spiel bereit:
 * {@link EasyBotStrategy} - wählt zufällig eine gültige Spalte
 * {@link HardBotStrategy} - berechnet den besten Zug per MinMax
 *
 */
public class FourConnectBotStrategy implements IMoveStrategy {

    /**
     * Referenz auf das laufende Spiel wird zum Ausführen echter Züge benötigt
     */
    FourConnectGame fcGame;
    /**
     * Regelwerk, wird für Sieg- und Unentschieden Prüfung genutzt
     */
    FourConnectRules fcRules ;
    /**
     * Zufallsgenerator
     */
    private final Random randNum = new SecureRandom();
    /**
     * Spieler Typ des menschlichen Gegners
     */
    private static final Player player = Player.HUMAN;
    /**
     * Spieler Typ des Bots
     */
    private static final Player bot = Player.BOT;

    // Bewertungsgewichte

    /** Punktwert für einen vollständigen Vier-Gewinnt-Zug des Bots */
    private static final int SCORE_BOT_FOUR  =  1000;

    /** Punktwert für drei eigene Scheiben in einem freien Fenster */
    private static final int SCORE_BOT_THREE =     5;

    /** Punktwert für zwei eigene Scheiben in einem freien Fenster */
    private static final int SCORE_BOT_TWO   =     2;

    /** Punktabzug für vier Gegner-Scheiben */
    private static final int SCORE_OPP_FOUR  = -1000;

    /** Punktabzug für drei Gegner-Scheiben in einem freien Fenster */
    private static final int SCORE_OPP_THREE =    -5;

    /** Punktabzug für zwei Gegner-Scheiben in einem freien Fenster */
    private static final int SCORE_OPP_TWO   =    -2;

    /** Suchtiefe des MinMax-Algorithmus (höher = stärker, aber langsamer) */
    private static final int MINIMAX_DEPTH   =     4;
    /**
     * Wird vom Spielrahmen aufgerufen, um den Bot einen Zug ausführen zu lassen. Die konkrete Logik liegt in den inneren
     * Klassen {@link EasyBotStrategy} und {@link HardBotStrategy}
     * @param board das aktuelle Spielfeld
     */
    @Override
    public void chooseMove(IPlayArea board) {
        // wird durch die inneren Strategieklassen überschrieben
    }

    /**
     * Standardkonstruktor für die BotStrategy, der Bot wird dann benutzt über:
     * FourConnectBotStrategy botStrategy = new FourConnectBotStrategy(game, rules);
     * IMoveStrategy hardBot = botStrategy.new HardBotStrategy();
     * hardBot.chooseMove(board);
     * @param game die aktuelle Instanz des verwendeten Spiels
     * @param rules die Instanz der regeln
     */
    public FourConnectBotStrategy(FourConnectGame game, FourConnectRules rules){
        this.fcGame = game;
        this.fcRules = rules;
    }

    /**
     * Bewertet den aktuellen Zustand des Spielfelds aus Sicht des Bots.
     * Alle 69 möglichen Vier Felder Fenster werden analysiert. Enthält
     * ein Fenster ausschließlich Bot Scheiben und leere Felder, wird ein
     * positiver Wert addiert. Enthält es ausschließlich Gegner Scheiben,
     * wird ein negativer Wert subtrahiert. Gemischte Fenster fließen nicht
     * in die Bewertung ein, da sie für keinen Spieler mehr gewinnbar sind
     *
     * @param board das zu bewertende Spielfeld
     * @return der Score: positiv: Bot ist im Vorteil, negativ: Gegner im Vorteil
     */
    Integer appraiseBoard(FourConnectGameBoard board) {
        int score = 0;
        final ArrayList<Position[]> connectsList = allFourConnects(board);

        for (Position[] connects : connectsList) {
            int botOwningCount = 0;
            int playerOwningCount = 0;

            //Zähle Bot und Gegner Scheiben im aktuellen Fenster
            for (Position pos : connects) {
                final Player owner = board.getCellOwner(pos.getX(), pos.getY()).getType();
                switch (owner) {
				case HUMAN -> playerOwningCount++;
				case BOT -> botOwningCount++;
				}
            }
            // Bot Fenster: kein Gegner vorhanden -> positiv bewerten
            if (playerOwningCount == 0) {
                switch (botOwningCount) {
				case 4 -> score += SCORE_BOT_FOUR;
				case 3 -> score += SCORE_BOT_THREE;
				case 2 -> score += SCORE_BOT_TWO;
				}
            }
            //Gegner Fenster: kein Bot vorhanden -> negativ bewerten
            if (botOwningCount == 0) {
                switch (playerOwningCount) {
				case 4 -> score += SCORE_OPP_FOUR;
				case 3 -> score += SCORE_OPP_THREE;
				case 2 -> score += SCORE_OPP_TWO;
				}
            }
        }
        return score;
    }

    /**
     * Sucht in einem Standardspielfeld alle 69 Kombinationsmöglichkeiten welche einen Sieg ermöglichen. Diese werden
     * alle in einer Liste gespeichert und zurückgegeben.
     *
     * @param board das Spielfeld
     * @return die ArrayList mit allen Siegeskoordinaten
     */
    ArrayList<Position[]> allFourConnects(FourConnectGameBoard board){
        final ArrayList<Position[]> connectsList = new ArrayList<>();
        final Integer columCount = board.getColumns();
        final Integer rowCount = board.getRows();
        //Horizontal
        for(int y = 0; y < rowCount; y++ ){
            for(int x = 0; x < columCount - 3; x++){
                final Position[] temp = {new Position(x,y), new Position(x+1,y), new Position(x+2,y),
                        new Position(x+3,y)};
                connectsList.add(temp);
            }
        }
        //Vertical
        for(int x = 0; x < columCount; x++ ){
            for(int y = 0; y < rowCount - 3; y++){
                final Position[] temp = {new Position(x,y), new Position(x,y+1), new Position(x,y+2),
                        new Position(x,y+3)};
                connectsList.add(temp);
            }
        }
        //Diagonal ↗
        for(int x = 0; x < columCount - 3; x++ ){
            for(int y = 0; y < rowCount - 3; y++){
                final Position[] temp = {new Position(x,y), new Position(x+1,y+1), new Position(x+2,y+2),
                        new Position(x+3,y+3)};
                connectsList.add(temp);
            }
        }
        //Diagonal ↘
        for(int x = 0; x < columCount-3; x++ ){
            for(int y = 3; y < rowCount; y++){
                final Position[] temp = {new Position(x,y), new Position(x+1,y-1), new Position(x+2,y-2),
                        new Position(x+3,y-3)};
                connectsList.add(temp);
            }
        }
        return connectsList;
    }

    // ------------------------------------------------
    //  INNERE KLASSEN
    // ------------------------------------------------

    /**
     * Der einfache Bot, er wählt zufällig eine Spalte aus
     */
    public class EasyBotStrategy implements IMoveStrategy {
        /**
         * Wählt zufällig eine Spalte aus und wirft dort eine Scheibe ein
         * @param board das aktuelle Spielfeld
         */
        @Override
        public void chooseMove(IPlayArea board) {
            // Logik für zufälligen Zug
            final List<Integer> possibleColumns = new ArrayList<>();
            /* Es überprüft, welche Spalten noch frei sind. Anhand der freien Spalten wird eine zufällig ausgewählt
            * und diese an dropDisc() weitergeleitet  */
            for(int col = 0; col < ((FourConnectGameBoard) board).getColumns(); col++ ){
                if(((FourConnectGameBoard) board).getCellOwner(col,0).getType() == Player.NONE){
                    possibleColumns.add(col);
                }
            }
            final Integer randomIndex = randNum.nextInt(possibleColumns.size());
            fcGame.dropDisc(possibleColumns.get(randomIndex));
        }
    }

    /**
     * Der schwere Bot, er benutzt den MinMax Algorithmus zum Berechnen seines Zuges.
     * Der Algorithmus durchsucht den Spielbaum bis zur Tiefe
     * {@value FourConnectBotStrategy#MINIMAX_DEPTH}, bewertet Blattknoten
     * mit {@link #appraiseBoard} und wählt den Zug mit dem höchsten Score
     * aktueller Stand :
     *      5 : 0 für den Bot ...
     *      und 1 Unentschieden
     */
    public class HardBotStrategy implements IMoveStrategy {


        /**
         * Einstiegspunkt der schweren Strategie. Erstellt eine Kopie des
         * Spielfelds, berechnet darauf den besten Zug und führt ihn aus.
         * @param board das aktuelle Spielfeld
         */
        @Override
        public void chooseMove(IPlayArea board) {
            // Spielfeld kopieren, damit der Originalzustand unverändert bleibt
            final FourConnectGameBoard boardCopy = new FourConnectGameBoard();
            boardCopy.copy((FourConnectGameBoard) board);

            final Integer toPlayCol = findBestTurn(boardCopy, MINIMAX_DEPTH);
            fcGame.dropDisc(toPlayCol);
        }

        /**
         * Bestimmt die optimale Spalte für den Bot auf der obersten Ebene des MinMax-Baums.
         * Jeder valide Zug wird simuliert, per {@link #minMax} bewertet und danach rückgängig gemacht.
         * Der Zug mit dem höchsten Score wird als Spaltenindex zurückgegeben.
         * @param board das (kopierte) Spielfeld
         * @param depth die maximale Suchtiefe, umso größer die Zahl, umso höher die Stärke und Berechnungszeit
         *              3-5 ist ein gutes Maß
         * @return Spaltenindex des besten Zugs
         */
        private Integer findBestTurn(FourConnectGameBoard board, int depth){
            Integer bestScore = Integer.MIN_VALUE;
            Integer bestTurn = -1;
            Integer score;
            final List<Position> valideTurns = findValideTurns(board);

            for(Position turn: valideTurns){
                playTestTurn(board, turn, bot);
                score = minMax(board, depth-1, false);
                undoTestTurn(board, turn);

                if(score > bestScore){
                    bestScore = score;
                    bestTurn = turn.getX();
                }
            }
            return bestTurn;
        }

        /**
         * Rekursiver MinMax-Algorithmus.
         * Wechselt bei jedem Aufruf zwischen dem maximierenden (Bot) und
         *          * dem minimierenden (Gegner) Spieler. Terminiert wenn:
         *          * die maximale Tiefe erreicht ist,
         *          * ein Spieler gewonnen hat, oder
         *          * das Spielfeld voll ist (Unentschieden).
         * @param board das aktuell simulierte Spielfeld
         * @param depth verbleibende Suchtiefe
         * @param isMaximizing {@code true} wenn der Bot am Zug ist,
         *                     {@code false} wenn der Gegner am Zug ist
         * @return heuristischer Score des besten erreichbaren Zustands
         */
        private Integer minMax(FourConnectGameBoard board, int depth, boolean isMaximizing){
            Integer value;
            int bestValue;
            // Abbruchbedingung: Tiefe 0, Sieg oder Unentschieden
            if(depth == 0 || fcRules.checkWin((IPlayArea) board) || fcRules.isDraw((IPlayArea) board) ) {
                return appraiseBoard(board);
            }

            final List<Position> valideTurns = findValideTurns(board);

            if( isMaximizing){
                // Bot am Zug: höchsten erreichbaren Score suchen
                bestValue = Integer.MIN_VALUE;
                for(Position turn: valideTurns){
                    playTestTurn(board, turn, bot );
                    value = minMax(board, depth-1, false);
                    undoTestTurn(board, turn);
                    bestValue = max(bestValue, value);
                }

            } else{
                // Gegner am Zug: niedrigsten erreichbaren Score suchen
                bestValue = Integer.MAX_VALUE;
                for(Position turn: valideTurns){
                    playTestTurn(board, turn, player );
                    value = minMax(board, depth-1, true);
                    undoTestTurn(board,turn);
                    bestValue = min(bestValue,value);
                }
            }
            return bestValue;
        }

        /**
         *  Macht einen Testzug rückgängig, indem die Zielzelle auf
         * {@link Player#NONE} zurückgesetzt wird.
         * @param board  das Spielfeld
         * @param turn die Position, die geleert werden soll
         */
        private void undoTestTurn(FourConnectGameBoard board, Position turn) {
            board.setCellValue(turn,new FourConnectPlayer(Player.NONE, null, null));
        }

        /**
         *  Setzt eine Scheibe des angegebenen Spielers auf die Zielposition
         * @param board das Spielfeld
         * @param turn die Zielposition der Scheibe
         * @param bot der Spieler, dessen Scheibe gesetzt wird
         */
        private void playTestTurn(FourConnectGameBoard board, Position turn, Player bot) {
           final FourConnectPlayer testTurnOwner = new FourConnectPlayer(bot, null, null);
           board.setCellValue(turn,testTurnOwner);
        }

        /**
         * Ermittelt alle validen Züge auf dem aktuellen Spielfeld.
         * In vier Gewinnt ist pro Spalte genau eine Position gültig:
         * die unterste noch freie Zelle (größter y-Wert mit {@link Player#NONE}).
         * Vollständig gefüllte Spalten werden übersprungen.
         * Das Board wird direkt als Parameter verwendet, um die Abhängigkeit vom äußeren Feld
         * {@code fcBoard} zu vermeiden.
         *
         * @param board das zu analysierende Spielfeld
         * @return Liste der validen Zielpositionen
         */
        private List<Position> findValideTurns(FourConnectGameBoard board) {
            final Integer columCount = board.getColumns();
            final Integer rowCount = board.getRows();
            final List<Position> possibleTurns = new ArrayList<>();
            for(int x = 0; x <= columCount-1; x++ ){
                // Von unten (y = rowCount-1) nach oben (y = 0) suchen
                for(int y = rowCount - 1; y > -1; y--){
                    if(board.getCellOwner(x,y).getType() == Player.NONE){
                        // Unterste freie Zelle dieser Spalte gefunden
                        possibleTurns.add(new Position(x, y));
                        break;
                    }
                    // Keine freie zelle, Spalte wird übersprungen
                }
            }
            return possibleTurns;
        }
    }
}

