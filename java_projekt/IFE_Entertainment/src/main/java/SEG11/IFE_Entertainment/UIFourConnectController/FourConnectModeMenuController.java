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
package SEG11.IFE_Entertainment.UIFourConnectController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.Player;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für die Modusauswahl.
 *
 * <p>Ermöglicht die Auswahl des Spielmodus und startet das Spiel
 * mit den entsprechenden Spielertypen.
 * 
 * @author Truong Tan Long Nguyen
 */
public class FourConnectModeMenuController {

    /**
     * Startet ein Spiel im Zwei-Spieler-Modus.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGame() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HUMAN);
    }

    /**
     * Startet ein Spiel gegen den einfachen Bot.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGameEasyBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.EASYBOT);
    }

    /**
     * Startet ein Spiel gegen den schweren Bot.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGameHardBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HARDBOT);
    }

    /**
     * Navigiert zurück zum Hauptmenü.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}