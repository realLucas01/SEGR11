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
package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für das Hauptmenü.
 *
 * <p>Stellt die Navigation zu den verschiedenen Screens des Hauptmenüs bereit.
 */
public class MainMenuController {

    /**
     * Navigiert zur Modusauswahl.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGame() throws IOException {
        App.setRoot("ModeMenu");
    }

    /**
     * Navigiert zu den Einstellungen.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void openSettings() throws IOException {
        App.setRoot("Settings");
    }

    /**
     * Beendet die Anwendung.
     */
    @FXML
    public void exit() {
        System.exit(0);
    }

    /**
     * Navigiert zum Hilfe-Screen.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void openHelp() throws IOException {
        App.setRoot("Help");
    }
}