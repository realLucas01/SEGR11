/*
 * 1.0 2026-04-28 Lucas Rumann
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


package segeleven.ife.entertainment.gamecore;

/**
 * Interface für die Logik zur Verwaltung des Spielbretts.
 *
 * <p>Ist für die Klasse zu implementieren, die die gesamte Logik für die
 * Verwaltung des Spielbretts beherbergt, also z.B.: das Initialisieren des Spielbretts und das zur
 * verfügungsstellen von Funktionen um auf einzelne Zellen oder Werte zuzugreifen und diese zu
 * verändern.
 *
 * @author Lucas Rumann
 */
public interface PlayArea {

  /**
   * Funktion zum Überprüfen, ob das Spielfeld voll ist.
   *
   * @return Booleschen Wert, der wahr ist, wenn das Spielfeld voll ist
   */
  Boolean isFull();

  /**
   * Funktion zum leeren und neu-initialisieren des Spielbretts.
   *
   * @return 0, wenn die Operation erfolgreich war, andernfalls ein Fehlercode (!= 0).
   */
  Integer clear();
}
