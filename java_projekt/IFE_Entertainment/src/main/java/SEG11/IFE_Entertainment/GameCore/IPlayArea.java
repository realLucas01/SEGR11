/*
 * 1.0 2026-04-22 Luca Tauscher
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


package SEG11.IFE_Entertainment.GameCore;

/**
 * Das Interface für das Spielfeld
 *
 *
 *<p>Ist für die Klasse zu implementieren die, die gesamte Logik für das
 * Spielfeld beherbergt.
 *
 *
 *
 */
public interface IPlayArea {
  /**
   * Überprüft, ob das Spielfeld voll ist
   * @return true wenn voll, und false wenn noch nicht voll
   */
  Boolean isFull();

  /**
   * Funktion um das Spielfeld zu leeren, oder den Ausgangszustand herzustellen
   * @return 0, wenn erfolgreich
   */
  Integer clear();
}
