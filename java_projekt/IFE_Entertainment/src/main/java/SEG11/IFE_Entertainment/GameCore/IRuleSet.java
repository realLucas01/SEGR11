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

package SEG11.IFE_Entertainment.GameCore;

/**
 * Interface für die Überprüfung/Einhaltung der Spielregeln
 * 
 * <p>Ist für die Klasse zu implementieren, die die gesammte Logik für die
 * Überprüfung der Spielzüge auf Konformität mit dem jeweiligen Regelwerk
 * beherbergt
 * 
 * @param <IPlayAreaT> Ist bei der Implementierung des Interface mit der eigenen
 *                     Implementierung von {@link IPlayArea} zu konkretisieren
 * @param <PlayerT>    Ist bei der Implementierung des Interface mit der eigenen
 *                     Implementierung der Klasse des Spielers zu konkretisieren
 */
public interface IRuleSet<IPlayAreaT, PlayerT> {

	/**
	 * Funktion zur Überprüfung ob ein Sieg vorliegt
	 * 
	 * @param board  Den aktuellen Zustand des Spielbretts im Datentyp der eigenen
	 *               Implementierung von {@link IPlayArea}
	 * @param player Spieler der den aktuellen Zug gemacht hat im Datentyp der
	 *               eigenen Implementierung der Klasse des Spielers
	 * 
	 */
	boolean checkWin(IPlayAreaT board, PlayerT player);

	/**
	 * Funktion zur Überprüfung ob ein Unentschieden vorliegt
	 * 
	 * @param board Den aktuellen Zustand des Spielbretts im Datentyp der eigenen
	 *              Implementierung von {@link IPlayArea}
	 * 
	 */
	boolean checkTie(IPlayAreaT board);
}
