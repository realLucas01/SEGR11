/*
 * 1.0 2026-04-19 Luca Tauscher
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

package seg11.ife_entertainment.four_connect;

import seg11.ife_entertainment.game_core.MoveStrategy;

/**
 * Der Vier gewinnt Spieler.
 *
 * @author Luca Tauscher
 */
public class FourConnectPlayer {
  /** Der Typ des Spielers, siehe das enum {@link Player}. */
  private final Player type;
  /** Die verwendete Schwierigkeitsstufe des Bots. */
  private final MoveStrategy strategy;
  /** Die Farbe des Spielsteines. */
  private final String colour;

  /**
   * Der Konstruktor um einen FCPlayer zu initialisieren.
   *
   * <p>Initialisiert ein Spieler Objekt.
   *
   * @param type     der Type des Spielers: Bot oder Mensch
   * @param strategy wenn es ein Bot ist, die zu verwendende Strategy/Schwierigkeitsstufe
   * @param colour   die Farbe des Spielsteines
   */
  public FourConnectPlayer(Player type, MoveStrategy strategy, String colour) {
    this.type = type;
    this.strategy = strategy;
    this.colour = colour;
  }

  /**
   * Gibt den Typ des Spielers zurück.
   *
   * @return der Spieler
   */
  public Player getType() {
    return type;
  }

  /**
   * Wenn vorhanden, gibt es die verwendete Bot Strategy zurück.
   *
   * @return die Bot Strategy
   */
  public MoveStrategy getStrategy() {
    return strategy;
  }

  /**
   * Gibt die Farbe für den Spieler zurück.
   *
   * @return die Farbe
   */
  public String getColour() {
    return colour;
  }
}
