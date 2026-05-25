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

import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.GameCore.IGame;
import SEG11.IFE_Entertainment.GameCore.IPlayArea;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;


/**
 * Klasse die für den eigentlichen Spielablauf zuständig ist
 *
 * <p>Implementiert dabei {@link IGame} und seine Funktionen, und stellt
 * zusätzliche Funktionen für alle Phasen des Spielablaufs bereit.
 *
 * @param <FourConnectGameBoard> Der generische Datentyp wurde auf die von uns implementierte
 *                               Version des Interface {@link IPlayArea} konkretisiert
 *
 * @author Lucas Rumann
 */
public class FourConnectGame implements IGame<FourConnectGameBoard> {
  /** Speichern der Singleton Instanz der Klasse */
  private static FourConnectGame INSTANCE;
  /** Aktueller Zustand des Spiels */
  private GameState state;
  /** Liste der Spieler */
  private FourConnectPlayer[] players;
  /** Indexvariable zum Finden des aktuellen Spielers in der Liste {@link #players} */
  private int currentPlayerIndex;
  /** Regelwerk das zur überprüfung der Sieg-Bedingungen genutzt wird */
  private FourConnectRules rules;
  /** Das Spielbrett auf dem das Spiel ausgetragen wird */
  private FourConnectGameBoard gameBoard;
  /**
   * Das aktuelle Branding der Software was für die Farben der Spieler verwendet wird
   */
  private BrandingService currentbranding;
  /** true, wenn ein Bot im Spiel ist. false wenn kein Bot */
  private boolean oneBotPlayer;

  /**
   * Privater Konstruktor für die Klasse FourConnectGame mitsamt der Grundlegenden initialisierung
   * aller wichtigen Variablen
   */
  private FourConnectGame() {
    state = GameState.NotStarted;
    players = new FourConnectPlayer[2];
    currentPlayerIndex = 0;
    rules = new FourConnectRules();
    gameBoard = new FourConnectGameBoard();
  }

  /**
   * Funktion zum Erstellen bzw. Bekommen der Instanz der Klasse
   *
   * @return Den Pointer auf die einzige Instanz der Klasse
   */
  public static FourConnectGame getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new FourConnectGame();
    }
    return INSTANCE;
  }

  /**
   * Implementierung der Interface Methode getStatus()
   *
   * <p>Wird genutzt, um den aktuellen Status des Spiels von außerhalb abzufragen
   *
   * @return Den aktuellen Status des Spiels im Datentyp des ENUM {@link GameState}
   *
   * @see IGame
   */
  @Override
  public GameState getStatus() {
    return state;
  }

  /**
   * Implementierung der Interface Methode setStatus()
   *
   * <p>Wird genutzt, um den aktuellen Status des Spiels manuell von außerhalb zu
   * setzen
   *
   * @param inputState Den gewünschten Status des Spiels im Datentyp des ENUM {@link GameState}
   *
   * @see IGame
   */
  @Override
  public void setStatus(GameState inputState) {
    state = inputState;
  }

  /**
   * Implementierung der Interface Methode getBoard()
   *
   * <p>Wird genutzt, um den aktuellen Zustand des Spielbretts von außerhalb
   * abzufragen
   *
   * @return Den aktuellen Zustand des Spielbretts im Datentyp {@link FourConnectGameBoard}
   *
   * @see IGame
   */
  @Override
  public FourConnectGameBoard getBoard() {
    return gameBoard;
  }

  /**
   * Gibt die Position des aktuellen Spielers im players Array zurück
   *
   * @return 0 für "Spieler 1" und 1 für "Spieler 2"
   */
  public Integer getCurrentPlayerIndex() {
    return currentPlayerIndex;
  }

  /**
   * Gibt alle aktuellen Spieler als Array zurück
   *
   * @return Das Array der aktuellen Spieler im Datentyp FourConnectPlayer
   */
  public FourConnectPlayer[] getPlayers() {
    return players;
  }

  /**
   * Implementierung der Interfacemethode restart()
   *
   * <p>Startet das Spiel mit den aktuellen Spielern bzw. im aktuellen Spielmodus
   * neu. Wenn Spieler bzw Spielmodus gewechselt werden soll, dann muss dafür erst {@link #endGame}
   * und dann {@link #initFourConnectGame} aufgerufen werden
   *
   * @see IGame
   */
  @Override
  public void restart() {
    //kopieren der Spieler in ein neues Array da endGame() players null'ed
    FourConnectPlayer[] playerClone = players.clone();
    endGame();
    initFourConnectGame(playerClone[0].getType(), playerClone[1].getType());
  }

  /**
   * Beendet das aktuelle Spiel
   *
   * <p>Beendet das aktuelle Spiel und setzt alle Variablen wieder auf saubere Werte
   */
  public void endGame() {
    state = GameState.NotStarted;
    players[0] = null;
    players[1] = null;
    currentPlayerIndex = 0;
    gameBoard.clear();
  }

  /**
   * Die eigentliche Ausführung des Spielzuges bei dem die neue Scheibe in der jeweiligen Spalte
   * "fallen gelassen" wird
   *
   * @param column Spalte in der die Scheibe fallen gelassen werden soll
   *
   * @return den Spielstatus, nach dem Ausführen des Spielzuges
   */
  public GameState dropDisc(Integer column) {

    // Scheibe auf niedrigst möglichen/freien Punkt in der Spalte fallen lassen
    for (int rows = 0; rows < gameBoard.getRows(); rows++) {
      if (gameBoard.getCellOwner(new Position(column, rows)).getType() != Player.NONE) {
        gameBoard.setCellValue(new Position(column, rows - 1), players[currentPlayerIndex]);
        break;
      } else if (rows + 1 == gameBoard.getRows()) {
        gameBoard.setCellValue(new Position(column, rows), players[currentPlayerIndex]);
        break;
      }
    }
    // Überprüfen, ob unentschieden
    if (rules.checkTie(gameBoard)) {
      state = GameState.Tied;
    }
    // Überprüfen, ob gewonnen
    if (rules.checkWin(gameBoard, players[currentPlayerIndex])) {
      state = GameState.Won;
    }
    return state;
  }

  /**
   * Get Funktion um das Mitspielen eines Botes abzufragen
   *
   * @return true, wenn ein Bot mitspielt false, wenn kein Bot mitspielt
   */
  public boolean getOneBotPlayer() {
    return oneBotPlayer;
  }

  /**
   * Beendet den Zug eines Spielers
   *
   * <p>Sie invertiert den Wert von currentPlayerIndex so das nun der andere Spieler
   * über die Liste {@link #players} auffindbar ist
   */
  public void playerTurn() {
    currentPlayerIndex = currentPlayerIndex == 0 ? 1 : 0;

  }

  /**
   * Führt einen Zug des Botes aus
   *
   * @return den Spielzustand nach dem Zug
   */
  public GameState playBotTurn() {
    return players[currentPlayerIndex].getStrategy().chooseMove(gameBoard);
  }

  /**
   * Initialisierung eines neuen Spiels von "Vier Gewinnt".
   *
   * <p>Dabei werden die neuen Spieler, so wie für mögliche Bots, deren Strategie
   * initialisiert
   *
   * @param playerOne Der Typ von Spieler 1 im ENUM {@link Player}
   * @param playerTwo Der Typ von Spieler 2 im ENUM {@link Player}
   *
   * @return Einen Integer wert der aussagt, ob die Operation erfolgreich war, bei einer Rückgabe !=
   * 0 ist ein Fehler aufgetreten
   */
  public Integer initFourConnectGame(Player playerOne, Player playerTwo) {

    // Initialisieren des Index für die Spielerliste
    currentPlayerIndex = 0;

    // Laden des aktuellen Brandings für die Farben
    currentbranding = BrandingService.getInstance();

    // Erstellen einer neuen Instanz von FourConnectBotStrategy um die Strategien
    // für die schwierigkeitsstufen "laden" zu können
    FourConnectBotStrategy botStrategy = new FourConnectBotStrategy(this, rules);

    // Erstellen von Spieler 1 abhängig seines übergebenen Typs
    switch (playerOne) {
      case HUMAN ->
        players[0] = new FourConnectPlayer(playerOne, null, currentbranding.getPrimaryColor());
      case EASYBOT -> {
        players[0] = new FourConnectPlayer(playerOne, botStrategy.new EasyBotStrategy(),
          currentbranding.getPrimaryColor());
        oneBotPlayer = true;
      }
      case HARDBOT -> {
        players[0] = new FourConnectPlayer(playerOne, botStrategy.new HardBotStrategy(),
          currentbranding.getPrimaryColor());
        oneBotPlayer = true;
      }
      default -> {
        return 1;
      }
    }

    // Erstellen von Spieler 2 abhängig seines übergebenen Typs
    switch (playerTwo) {
      case HUMAN ->
        players[1] = new FourConnectPlayer(playerTwo, null, currentbranding.getSecondaryColor());
      case EASYBOT -> {
        players[1] = new FourConnectPlayer(playerTwo, botStrategy.new EasyBotStrategy(),
          currentbranding.getSecondaryColor());
        oneBotPlayer = true;
      }
      case HARDBOT -> {
        players[1] = new FourConnectPlayer(playerTwo, botStrategy.new HardBotStrategy(),
          currentbranding.getSecondaryColor());
        oneBotPlayer = true;
      }
      default -> {
        return 1;
      }
    }

    // Status des Spiels aktualisieren
    state = GameState.Running;
    return 0;
  }
}
