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

package SEG11.IFE_Entertainment.FourConnect;

/**
 * Der Vier gewinnt Spieler
 */
public class FourConnectPlayer {
    private final Player type;
    private final FourConnectBotStrategy strategy;
    private final String colour;

    /**
     * Standardkonstruktor
     */
    public FourConnectPlayer(Player type, FourConnectBotStrategy strategy, String colour) {
        this.type = type;
        this.strategy = type == Player.BOT ? strategy : null;
        this.colour = colour;
    }

    /**
     * Gibt den Typ des Spielers zurück
     *
     * @return der Spieler
     */
    public Player getType(){
        return type;
    }

    /**
     * Wenn vorhanden, gibt es der verwendete Bot Strategy zurück
     *
     * @return die Bot Strategy
     */
    public FourConnectBotStrategy getStrategy(){
        return strategy;
    }

    /**
     * Gibt die Farbe für den Spieler zurück
     *
     * @return die Farbe
     */
    public String getColour(){
        return colour;
    }
}
