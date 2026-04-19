package SEG11.IFE_Entertainment.FourConnect;

import SEG11.IFE_Entertainment.GameCore.IMoveStrategy;
import SEG11.IFE_Entertainment.GameCore.IPlayArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Implementiert {@link IMoveStrategy} und stellt zwei Botstrategien für das Vier Gewinnt Spiel bereit:
 * <ul>
 *     <li>{@link EasyBotStrategy} - wählt zufällig eine gültige Spalte</li>
 *     <li>{@link HardBotStrategy} - berechnet den besten Zug per MinMax</li>
 * </ul>
 */
public class FourConnectBotStrategy implements IMoveStrategy {

    /**
     * The Fc game.
     */
    FourConnectGame fcGame;
    /**
     * The Fc rules.
     */
    FourConnectRules fcRules ;
    /**
     * The Fc board.
     */
    FourConnectGameBoard fcBoard ;
    /**
     * The Rand num.
     */
    Random randNum = new Random();
    /**
     * The Player.
     */
    Player player = Player.HUMAN;
    /**
     * The Bot.
     */
    Player bot = Player.BOT;

    @Override
    public void chooseMove(IPlayArea board) {

    }

    /**
     * Bewertung des Spielfeldes
     *
     * @param board the board
     * @param bot   the bot
     * @return the integer
     */
    Integer appraiseBoard(FourConnectGameBoard board, Player bot) {
        int score = 0;
        ArrayList<Position[]> connectsList = allFourConnects(board);

        for (Position[] connects : connectsList) {
            int botOwningCount = 0;
            int playerOwningCount = 0;
            int emptyCount = 0;

            for (Position pos : connects) {
                Player owner = board.getCellOwner(pos.getX(), pos.getY()).getType();
                switch (owner) {
                    case HUMAN:
                        playerOwningCount++;
                        break;
                    case BOT:
                        botOwningCount++;
                        break;
                    case NONE:
                        emptyCount++;
                        break;
                }
            }
            if (playerOwningCount == 0) {
                switch (botOwningCount) {
                    case 4:
                        score += 1000;
                        break;
                    case 3:
                        score += 5;
                        break;
                    case 2:
                        score += 2;
                        break;
                    default:
                        break;
                }
            }
            if (botOwningCount == 0) {
                switch (playerOwningCount) {
                    case 4:
                        score -= 1000;
                        break;
                    case 3:
                        score -= 5;
                        break;
                    case 2:
                        score -= 2;
                        break;
                    default:
                        break;
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
        ArrayList<Position[]> connectsList = new ArrayList<>();
        Integer columCount = board.getColumns();
        Integer rowCount = board.getRows();
        //Horizontal
        for(int y = 0; y < rowCount; y++ ){
            for(int x = 0; x < columCount - 3; x++){
                Position[] temp = {new Position(x,y), new Position(x+1,y), new Position(x+2,y),
                        new Position(x+3,y)};
                connectsList.add(temp);
            }
        }
        //Vertical
        for(int x = 0; x < columCount; x++ ){
            for(int y = 0; y < rowCount - 3; y++){
                Position[] temp = {new Position(x,y), new Position(x,y+1), new Position(x,y+2),
                        new Position(x,y+3)};
                connectsList.add(temp);
            }
        }
        //Diagonal ↗
        for(int x = 0; x < columCount - 3; x++ ){
            for(int y = 0; y < rowCount - 3; y++){
                Position[] temp = {new Position(x,y), new Position(x+1,y+1), new Position(x+2,y+2),
                        new Position(x+3,y+3)};
                connectsList.add(temp);
            }
        }
        //Diagonal ↘
        for(int x = 0; x < columCount-3; x++ ){
            for(int y = 3; y < rowCount; y++){
                Position[] temp = {new Position(x,y), new Position(x+1,y-1), new Position(x+2,y-2),
                        new Position(x+3,y-3)};
                connectsList.add(temp);
            }
        }
        return connectsList;
    }


    /**
     * Der einfache Bot, er wählt zufällig eine Spalte aus
     */
    public class EasyBotStrategy implements IMoveStrategy {
        @Override
        public void chooseMove(IPlayArea board) {
            // Logik für zufälligen Zug
            fcGame.dropDisc(randNum.nextInt(7)+1);
        }
    }

    /**
     * Der schwere Bot, er benutzt den MinMax Algorithmus zum Berechnen seines Zuges
     * aktueller Stand :
     *      5 : 0 für den Bot ...
     *      und 1 Unentschieden
     */
    public class HardBotStrategy implements IMoveStrategy {
        /**
         * die Funktion welche die schwere Strategy startet
         * @param board das aktuelle Spielfeld
         */
        @Override
        public void chooseMove(IPlayArea board) {
            // Logik für Minimax / Profi-Züge
            FourConnectGameBoard boardCopy = new FourConnectGameBoard();
            boardCopy.copy((FourConnectGameBoard) board);
            Integer toPlayCol = findBestTurn(boardCopy,3);
            fcGame.dropDisc(toPlayCol);
        }

        /**
         *
         * @param board
         * @param depth
         * @return
         */
        private Integer findBestTurn(FourConnectGameBoard board, int depth){
            Integer bestScore = Integer.MIN_VALUE;
            Integer bestTurn = -1;
            Integer score;
            List<Position> valideTurns = findValideTurns(board);

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

        private Integer minMax(FourConnectGameBoard board, int depth, boolean isMaximizing){
            Integer value;
            Integer bestValue;
            if(depth == 0 || fcRules.checkWin((IPlayArea) board) || fcRules.isDraw((IPlayArea) board) ) { // || checkWin()
                return appraiseBoard(board, bot);
            }

            List<Position> valideTurns = findValideTurns(board);

            if( isMaximizing){ // maximizer
                bestValue = Integer.MIN_VALUE;
                for(Position turn: valideTurns){
                    playTestTurn(board, turn, bot );
                    value = minMax(board, depth-1, false);
                    undoTestTurn(board, turn);
                    bestValue = max(bestValue, value);
                }
            } else{ // Minimizer
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

        private void undoTestTurn(FourConnectGameBoard board, Position turn) {
            board.setCellValue(turn,new FourConnectPlayer(Player.NONE, null, null));
        }

        private void playTestTurn(FourConnectGameBoard board, Position turn, Player bot) {
           FourConnectPlayer testTurnOwner = new FourConnectPlayer(bot, null, null);
           board.setCellValue(turn,testTurnOwner);
        }

        private List<Position> findValideTurns(FourConnectGameBoard board) {
            Integer columCount = fcBoard.getColumns();
            Integer rowCount = fcBoard.getRows();
            List<Position> possibleTurns = new ArrayList<>();
            for(int x = 0; x <= columCount-1; x++ ){
                for(int y = rowCount - 1; y > -1; y--){
                    if(board.getCellOwner(x,y).getType()!= Player.NONE){
                        if(y == rowCount) continue;
                        else {
                            possibleTurns.add(new Position(x, y-1));
                            break;
                        }
                    }
                }
            }
            return possibleTurns;
        }
    }

}

