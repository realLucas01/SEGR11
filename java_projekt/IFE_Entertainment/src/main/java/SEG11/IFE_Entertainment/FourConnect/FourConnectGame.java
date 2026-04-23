/*
 * 1.0 2026-04-22 Lucas Rumann
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

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.GameCore.IGame;
import SEG11.IFE_Entertainment.GameCore.IPlayArea;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;

/**
 * Klasse die für den eigentlichen Spieablauf zuständig ist
 * 
 * <p>Implementiert dabei {@link IGame} und seine Funktionen, und stellt
 * zusätzliche Funktionen für alle Phasen des Spielablaufs bereit
 * 
 * @param <FourConnectGameBoard> Der generische Datentyp wurde auf die von uns
 *                               implementierte Version des Interface
 *                               {@link IPlayArea} konkretisiert
 */
public class FourConnectGame implements IGame<FourConnectGameBoard> {
	/**
	 * Aktueller Zustand des Spiels
	 */
	private GameState State;
	/**
	 * Liste der Spieler
	 */
	private FourConnectPlayer[] players;
	/**
	 * Indexvariable zum finden des aktuellen Spielers in der Liste {@link players}
	 */
	private int currentPlayerIndex;
	/**
	 * Regelwerk das zur überprüfung der Sieg-Bedingungen genutzt wird
	 */
	private FourConnectRules Rules;
	/**
	 * Das Spielbrett auf dem das Spiel ausgetragen wird
	 */
	private FourConnectGameBoard gameBoard;
	/**
	 * Das aktuelle Branding der Software was für die Farben der Spieler verwendet
	 * wird
	 */
	private BrandingService currentbranding;

	/**
	 * Konstruktor für die Klasse FourConnectGame mitsammt der Grundlegenden
	 * initialisierung aller wichtigen Variablen
	 */
	public FourConnectGame() {
		State = GameState.NotStarted;
		players = new FourConnectPlayer[2];
		currentPlayerIndex = 0;
		Rules = new FourConnectRules();
		gameBoard = new FourConnectGameBoard();
	}

	/**
	 * Implementierung der Interface Methode getStatus()
	 * 
	 * <p>Wird genutzt um den aktuellen Status des Spiels von außerhalb abzufragen
	 * 
	 * @see IGame
	 * @return Den aktuellen Status des Spiels im Datentyp des ENUM
	 *         {@link GameState}
	 */
	@Override
	public GameState getStatus() {
		return State;
	}

	/**
	 * Implementierung der Interface Methode setStatus()
	 * 
	 * <p>Wird genutzt um den aktuellen Status des Spiels manuell von außerhalb zu
	 * setzen
	 * 
	 * @see IGame
	 * @param state Den gewünschten Status des Spiels im Datentyp des ENUM
	 *              {@link GameState}
	 */
	@Override
	public void setStatus(GameState state) {
		State = state;
	}

	/**
	 * Implementierung der Interface Methode getBoard()
	 * 
	 * <p>Wird genutzt um den aktuellen Zustand des Spielbretts von außerhalb
	 * abzufragen
	 * 
	 * @see IGame
	 * @return Den aktuellen Zustand des Spielbretts im Datentyp
	 *         {@link FourConnectGameBoard}
	 */
	@Override
	public FourConnectGameBoard getBoard() {
		return gameBoard;
	}

	/**
	 * Implementierung der Interface Methode restart()
	 * 
	 * <p>Startet das Spiel mit den aktuellen Spielern bzw. im aktuellen Spielmodus
	 * neu. Wenn Spieler bzw Spielmodus gewechselt werden soll dann muss dafür erst
	 * {@link endGame} und dann {@link initFourConnectGame} aufgerufen werden
	 * 
	 * @see IGame
	 * @return Den aktuellen Zustand des Spielbretts im Datentyp
	 *         {@link FourConnectGameBoard}
	 */
	@Override
	public void restart() {
		endGame();
		initFourConnectGame(players[0].getType(), players[1].getType());
	}

	/**
	 * Beendet das aktuelle Spiel
	 * 
	 * <p>Beendet das aktuelle Spiel und setzt alle Variablen wieder auf saubere Werte
	 * 
	 */
	public void endGame() {
		State = GameState.NotStarted;
		players[0] = null;
		players[1] = null;
		currentPlayerIndex = 0;
		gameBoard.clear();
	}

	/**
	 * Die eigentliche Ausführung des Spielzuges bei dem die neue Scheibe in der
	 * jeweiligen Spalte "fallen gelassen" wird
	 * 
	 * @param Column Spalte in der die Scheibe fallen gelassen werden soll
	 * @return
	 */
	public GameState dropDisc(Integer Column) {

		// Scheibe auf niedrigst möglichen/freien Punkt in der Spalte fallen lassen
		for (int rows = 0; rows <= gameBoard.getRows(); rows++) {
			if (gameBoard.getCellOwner(new Position(rows, Column)).getType() != Player.NONE) {
				gameBoard.setCellValue(new Position(rows + 1, Column), players[currentPlayerIndex]);
				break;
			}
		}
		// Überprüfen ob unentschieden
		if (Rules.checkTie(gameBoard)) {
			State = GameState.Tied;
		}
		// Überprüfen ob gewonnen
		if (Rules.checkWin(gameBoard, players[currentPlayerIndex])) {
			State = GameState.Won;
		}
		return State;
	}

	/**
	 * Beendet den Zug eines Spielers
	 * 
	 * <p>Sie invertiert den Wert von currentPlayerIndex so das nun der andere Spieler
	 * über die Liste {@link players} auffindbar ist
	 */
	public void playerTurn() {
		currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;
	}

	/**
	 * Initialisierung eines neuen Spiels von Vier Gewinnt.
	 * 
	 * <p>Dabei werden die neuen Spieler, so wie für mögliche Bots, deren Strategie
	 * inititalisiert
	 * 
	 * @param playerOne Der Typ von Spieler 1 im ENUM {@link Player}
	 * @param playerTwo Der Typ von Spieler 2 im ENUM {@link Player}
	 * @return Einen Integer wert der aussagt ob die Operation erfolgreich war, bei
	 *         einer Rückgabe != 0 ist ein Fehler aufgetreten
	 */
	public Integer initFourConnectGame(Player playerOne, Player playerTwo) {

		// Initialisieren des Index für die Spielerliste
		currentPlayerIndex = 0;

		// Laden des aktuellen Brandings für die Farben
		currentbranding = App.branding;

		// Erstellen einer neuen Instanz von FourConnectBotStrategy um die Strategien
		// für die schwierigkeitsstufen "laden" zu können
		FourConnectBotStrategy botStrategy = new FourConnectBotStrategy(this, Rules);

		// Erstellen von Spieler 1 abhängig seines übergebenen Typs
		switch (playerOne) {
		case Player.HUMAN -> players[0] = new FourConnectPlayer(playerOne, null, currentbranding.getPrimaryColor());
		case Player.EASYBOT -> players[0] = new FourConnectPlayer(playerOne,botStrategy.new EasyBotStrategy(), 
				currentbranding.getPrimaryColor());
		case Player.HARDBOT -> players[0] = new FourConnectPlayer(playerOne,botStrategy.new HardBotStrategy(), 
				currentbranding.getPrimaryColor());
		default -> {
			return 1;
		}
		}

		// Erstellen von Spieler 2 abhängig seines übergebenen Typs
		switch (playerTwo) {
		case Player.HUMAN -> players[1] = new FourConnectPlayer(playerTwo, null, currentbranding.getSecondaryColor());
		case Player.EASYBOT -> players[1] = new FourConnectPlayer(playerTwo,botStrategy.new EasyBotStrategy(), 
				currentbranding.getSecondaryColor());
		case Player.HARDBOT -> players[1] = new FourConnectPlayer(playerTwo,botStrategy.new HardBotStrategy(), 
				currentbranding.getSecondaryColor());
		default -> {
			return 1;
		}
		}

		// Status des Spiels aktuallisieren
		State = GameState.Running;
		return 0;
	}
}
