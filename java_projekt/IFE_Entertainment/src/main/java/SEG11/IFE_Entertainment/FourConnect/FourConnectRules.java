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

import SEG11.IFE_Entertainment.GameCore.IPlayArea;
import SEG11.IFE_Entertainment.GameCore.IRuleSet;

/**
 * Klasse stellt grundlegende Funktionen für das Überprüfen des Regelwerks zur
 * verfügung
 * 
 * <p>Implementiert dabei {@link IRuleSet} und seine Funktionen
 * 
 * @author Lucas Rumann
 * @param <FourConnectGameBoard> Der generische Datentyp {@link IRuleSet#IPlayAreaT}
 *                               wurde auf die von uns implementierte Version
 *                               des Interface {@link IPlayArea} konkretisiert
 * @param <FourConnectPlayer>    Der generische Datentyp {@link IRuleSet PlayerT} wurde
 *                               auf die von unserem implementierung des Spielers
 *                               konkretisiert
 * 
 * @see IPlayArea
 * @see Player
 * 
 */
public class FourConnectRules implements IRuleSet<FourConnectGameBoard, FourConnectPlayer> {

	/**
	 * Implementierung der Interface Methode checkWin()
	 * 
	 * <p>Wird genutzt um zu überprüfen, ob ein Sieg vorliegt
	 * 
	 * @param board  Aktueller Zustand des Spielbretts
	 * @param player Spieler der den aktuellen Zug gemacht hat
	 * 
	 * @see IRuleSet
	 */
	@Override
	public boolean checkWin(FourConnectGameBoard board, FourConnectPlayer player) {

		// Überprüfen ob 4 Scheiben in horizontaler Aufeinanderfolge des aktuellen
		// Spielers existieren
		for (int i = 0; i < board.getColumns() - 3; i++) {
			for (int j = 0; j < board.getRows(); j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i + 1, j)).equals(player)
						&& board.getCellOwner(new Position(i + 2, j)).equals(player)
						&& board.getCellOwner(new Position(i + 3, j)).equals(player)) {
					return true;
				}
			}
		}

		// Überprüfen ob 4 Scheiben in vertikaler Aufeinanderfolge des aktuellen
		// Spielers existieren
		for (int i = 0; i < board.getColumns(); i++) {
			for (int j = 0; j < board.getRows() - 3; j++) {
				if (board.getCellOwner(new Position(i, j)).equals(player)
						&& board.getCellOwner(new Position(i, j + 1)).equals(player)
						&& board.getCellOwner(new Position(i, j + 2)).equals(player)
						&& board.getCellOwner(new Position(i, j + 3)).equals(player)) {
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
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Implementierung der Interfacemethode checkTie()
	 * 
	 * <p>Wird genutzt um zu überprüfen, ob ein Unentschieden vorliegt
	 * 
	 * @param board aktueller Zustand des Spielbretts
	 * 
	 * @see IRuleSet
	 */
	@Override
	public boolean checkTie(FourConnectGameBoard board) {
		// Check ob Spielbrett voll
		return board.isFull();
	}
}
