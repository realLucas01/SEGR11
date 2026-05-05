/*
 * 1.0 2026-04-28 Truong Tan Long Nguyen
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

package SEG11.IFE_Entertainment.Infrastructure;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;

/**
 * Service zur Verwaltung der aktuellen Spielsitzung.
 *
 * <p>Speichert das laufende Spiel und den vorherigen Screen damit Controller
 * darauf zugreifen können. Wird als Singleton implementiert,
 * sodass nur eine Instanz global zugänglich ist.
 */
public class GameSessionService {

    private static GameSessionService instance;

    /** Das aktuell laufende Spiel */
    private FourConnectGame currentGame;

    /** Der vorherige Screen von dem aus Help geöffnet wurde */
    private String previousScreen = "MainMenu";

    /**
     * Privater Konstruktor.
     */
    private GameSessionService() {}

    /**
     * Gibt die einzige Instanz des GameSessionService zurück.
     *
     * @return die Singleton-Instanz
     */
    public static GameSessionService getInstance() {
        if (instance == null) {
            instance = new GameSessionService();
        }
        return instance;
    }

    /**
     * Gibt das aktuell laufende Spiel zurück.
     *
     * @return das aktuelle FourConnectGame Objekt
     */
    public FourConnectGame getCurrentGame() {
        return currentGame;
    }

    /**
     * Setzt das aktuell laufende Spiel.
     *
     * @param game das zu speichernde FourConnectGame Objekt
     */
    public void setCurrentGame(FourConnectGame game) {
        this.currentGame = game;
    }

    /**
     * Gibt den vorherigen Screen zurück.
     *
     * @return der Name des vorherigen Screens
     */
    public String getPreviousScreen() {
        return previousScreen;
    }

    /**
     * Setzt den vorherigen Screen.
     *
     * @param screen der Name des vorherigen Screens
     */
    public void setPreviousScreen(String screen) {
        this.previousScreen = screen;
    }
}