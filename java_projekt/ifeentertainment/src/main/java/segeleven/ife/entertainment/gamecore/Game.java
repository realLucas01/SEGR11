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

package segeleven.ife.entertainment.gamecore;

/**
 * Interface für die Logik des Spielablaufes.
 *
 * <p>Ist für die Klasse zu implementieren, die die gesamte Logik für den Ablauf
 * und die Verwaltung des Spieles beherbergt, also in der neuen Spiele initialisiert werden, Züge
 * ausgeführt werden usw.
 *
 * @param <PlayAreaT> Ist bei der Implementierung des Interface mit der eigenen Implementierung von
 *    {@link PlayArea} zu konkretisieren
 *
 * @author Lucas Rumann
 */
public interface Game<PlayAreaT> {

  /**
   * Wird genutzt, um den aktuellen Status des Spiels von außerhalb abzufragen.
   *
   * @return Den aktuellen Status des Spiels im Datentyp des ENUM {@link GameState}
   */
  GameState getStatus();

  /**
   * Wird genutzt, um den aktuellen Status des Spiels manuell von außerhalb zu setzen.
   *
   * @param state Den gewünschten Status des Spiels im Datentyp des ENUM {@link GameState}
   */
  void setStatus(GameState state);

  /**
   * Wird genutzt, um den aktuellen Zustand des Spielbretts von außerhalb abzufragen.
   *
   * @return Den aktuellen Zustand des Spielbretts im Datentyp der eigenen Implementierung von
   *   {@link PlayArea}
   */
  PlayAreaT getBoard();

  /**
   * Funktion zum neu starten des Spiels unter gleichen Bedingungen.
   */
  void restart();

}
