/*
 * 1.0 2026-04-19 Luca Tauscher
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gervithrall Systems GmbH
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with Gervithrall
 * Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */


package SEG11.IFE_Entertainment.FourConnect;

import SEG11.IFE_Entertainment.GameCore.IPlayArea;
import java.util.*;

public class FourConnectGameBoard implements IPlayArea {
  private static final Integer ROW_COUNTS = 6; // 6
  private static final Integer COLUM_COUNTS = 7; // 7
  private final Map<Position, FourConnectPlayer> cells = new HashMap<>();

  /**
   * Standardkonstruktor zum Initialisieren des Spielbrettes
   */
  public FourConnectGameBoard() {
    final FourConnectPlayer nonePlayer = new FourConnectPlayer(Player.NONE, null, null);
    for (int r = 0; r < ROW_COUNTS; r++) {
      for (int c = 0; c < COLUM_COUNTS; c++) {
        final Position position = new Position(c, r);
        cells.put(position, nonePlayer);
      }
    }
  }

  /**
   * gibt die Anzahl der Zeilen zurück
   * 
   * @return die Anzahl an Zeilen
   */
  public Integer getRows() {
    return ROW_COUNTS;
  }


  /**
   * gibt die Anzahl der Spalten zurück
   * 
   * @return Anzahl der Spalten
   */
  public Integer getColumns() {
    return COLUM_COUNTS;
  }

  /**
   * erhält eine bestimmte Zelle und gibt den Besitzer dieser Zelle zurück
   * 
   * @param y die Spalte
   * @param x die Zeile
   * @return den Spieler der Zelle
   */
  public FourConnectPlayer getCellOwner(Integer x, Integer y) {
    return cells.get(new Position(x, y));
  }

  /**
   * wird in dropDisc() aufgerufen und erhält die ermittelte Zelle, diese Zelle wird nun dem Spieler
   * zugewiesen
   * 
   * @param cell übergabe der Position
   * @param currentPlayer der Spieler welcher das Spielfeld bekommen soll
   */
  public void setCellValue(Position cell, FourConnectPlayer currentPlayer) {
    cells.put(cell, currentPlayer);
  }

  /**
   * Wird in der BotStrategy benötigt, um eine Kopie des vorhanden Brettes zu erstellen
   * 
   * @param board das zu kopieren Spielfeld
   */
  public void copy(FourConnectGameBoard board) {
    for (int r = 0; r < ROW_COUNTS; r++) {
      for (int c = 0; c < COLUM_COUNTS; c++) {
        final Position position = new Position(c, r);
        cells.put(position, board.getCellOwner(c, r));
      }
    }
  }

  /**
   * überprüft, ob das Spielfeld gefüllt ist
   * 
   * @return true, wenn voll und false, wenn es noch nicht voll ist
   */
  @Override
  public Boolean isFull() {
    final int numberCells = ROW_COUNTS * COLUM_COUNTS; // Gesamtanzahl der vorhanden Zellen
    int filledCells = 0;
    for (Map.Entry<Position, FourConnectPlayer> pos : cells.entrySet()) {
      if (pos.getValue().getType() != Player.NONE) {
        filledCells++;
      }
    }
    return filledCells == numberCells;
  }

  /**
   * füllt das Feld erneut mit leeren Zellen
   * 
   * @return 0, wenn erfolgreich
   */
  @Override
  public Integer clear() {
    final FourConnectPlayer nonePlayer = new FourConnectPlayer(Player.NONE, null, null);
    for (int r = 0; r < ROW_COUNTS; r++) {
      for (int c = 0; c < COLUM_COUNTS; c++) {
        final Position position = new Position(c, r);
        cells.put(position, nonePlayer);
      }
    }
    return 0;
  }
}
