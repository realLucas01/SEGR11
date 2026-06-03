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

package segeleven.ife.entertainment.fourconnect;

import java.util.ArrayList;
import java.util.List;
import segeleven.ife.entertainment.gamecore.PlayArea;
import segeleven.ife.entertainment.gamecore.RuleSet;

/**
 * Klasse stellt grundlegende Funktionen für das Überprüfen des Regelwerks zur verfügung.
 *
 * <p>Implementiert dabei {@link RuleSet} und seine Funktionen.
 *
 * @param <FourConnectGameBoard> Der generische Datentyp {@link RuleSet#IPlayAreaT} wurde auf die
 *                               von uns implementierte Version des Interface {@link PlayArea}
 *                               konkretisiert
 * @param <FourConnectPlayer>    Der generische Datentyp {@link RuleSet PlayerT} wurde auf die von
 *                               unserem implementierung des Spielers konkretisiert
 *
 * @author Lucas Rumann
 * @see PlayArea
 * @see Player
 */
public class FourConnectRules implements RuleSet<FourConnectGameBoard, FourConnectPlayer> {

  /** Positionen der zuletzt ermittelten Gewinnkombination. */
  private List<Position> winningPositions = new ArrayList<>();

  /**
   * Implementierung der Interface-Methode checkWin().
   *
   * <p>Wird genutzt um zu überprüfen, ob ein Sieg vorliegt.
   *
   * @param board  Aktueller Zustand des Spielbretts
   * @param player Spieler der den aktuellen Zug gemacht hat
   *
   * @see RuleSet
   */
  @Override
  public boolean checkWin(FourConnectGameBoard board, FourConnectPlayer player) {
    winningPositions.clear();
    
    // Überprüfen ob 4 Scheiben in horizontaler Aufeinanderfolge des aktuellen
    // Spielers existieren
    for (int i = 0; i < board.getColumns() - 3; i++) {
      for (int j = 0; j < board.getRows(); j++) {
        if (board.getCellOwner(new Position(i, j)).equals(player) && board.getCellOwner(
          new Position(i + 1, j)).equals(player) && board.getCellOwner(new Position(i + 2, j))
            .equals(player) && board.getCellOwner(new Position(i + 3, j)).equals(player)) {
          determineWinningPositions(
              new Position(i, j),
              new Position(i + 1, j),
              new Position(i + 2, j),
              new Position(i + 3, j));
          return true;
        }
      }
    }

    // Überprüfen ob 4 Scheiben in vertikaler Aufeinanderfolge des aktuellen
    // Spielers existieren
    for (int i = 0; i < board.getColumns(); i++) {
      for (int j = 0; j < board.getRows() - 3; j++) {
        if (board.getCellOwner(new Position(i, j)).equals(player) && board.getCellOwner(
          new Position(i, j + 1)).equals(player) && board.getCellOwner(new Position(i, j + 2))
            .equals(player) && board.getCellOwner(new Position(i, j + 3)).equals(player)) {
          determineWinningPositions(
              new Position(i, j),
              new Position(i, j + 1),
              new Position(i, j + 2),
              new Position(i, j + 3));
          return true;
        }
      }
    }

    // Überprüfen ob 4 Scheiben in diagonaler (links oben → rechts unten)
    // Aufeinanderfolge des aktuellen Spielers existieren
    for (int i = 0; i < board.getColumns() - 3; i++) {
      for (int j = 0; j < board.getRows() - 3; j++) {
        if (board.getCellOwner(new Position(i, j)).equals(player)
            && board.getCellOwner(new Position(i + 1, j + 1)).equals(player)
            && board.getCellOwner(new Position(i + 2, j + 2)).equals(player)
            && board.getCellOwner(new Position(i + 3, j + 3)).equals(player)) {
          determineWinningPositions(
              new Position(i, j),
              new Position(i + 1, j + 1),
              new Position(i + 2, j + 2),
              new Position(i + 3, j + 3));
          return true;
        }
      }
    }

    // Überprüfen ob 4 Scheiben in diagonaler (rechts oben → links unten)
    // Aufeinanderfolge des aktuellen Spielers existieren
    for (int i = board.getColumns() - 1; i >= 3; i--) {
      for (int j = 0; j < board.getRows() - 3; j++) {
        if (board.getCellOwner(new Position(i, j)).equals(player)
            && board.getCellOwner(new Position(i - 1, j + 1)).equals(player)
            && board.getCellOwner(new Position(i - 2, j + 2)).equals(player)
            && board.getCellOwner(new Position(i - 3, j + 3)).equals(player)) {
          determineWinningPositions(
              new Position(i, j),
              new Position(i - 1, j + 1),
              new Position(i - 2, j + 2),
              new Position(i - 3, j + 3));
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Implementierung der Interface methode checkTie().
   *
   * <p>Wird genutzt um zu überprüfen, ob ein Unentschieden vorliegt.
   *
   * @param board aktueller Zustand des Spielbretts
   *
   * @see RuleSet
   */
  @Override
  public boolean checkTie(FourConnectGameBoard board) {
    // Check ob Spielbrett voll
    return board.isFull();
  }
  
  /**
   * Gibt die zuletzt ermittelte Gewinnkombination zurück.
   *
   * @return Liste der vier Gewinnpositionen oder eine leere Liste
   */
  public List<Position> getLastWinningPositions() {
    return winningPositions;
  }
  
  /**
   * Ermittelt die vier Positionen, die zum Sieg des Spielers geführt haben.
   *
   * @param board aktueller Zustand des Spielbretts
   * @param player Spieler, dessen Gewinnkombination gesucht wird
   * @return Liste der vier Gewinnpositionen oder eine leere Liste
   */
  private void determineWinningPositions(
      Position first,
      Position second,
      Position third,
      Position fourth) {
    winningPositions.add(first);
    winningPositions.add(second);
    winningPositions.add(third);
    winningPositions.add(fourth);
  }
}
