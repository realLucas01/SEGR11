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
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.Infrastructure.GameSessionService;
import SEG11.IFE_Entertainment.UIGameController.FourConnectGameController;
import javafx.fxml.FXML;
import java.io.IOException;
/**
 * Controller für den Hilfe-Screen.
 *
 * <p>Stellt die Navigation vom Hilfe-Screen zurück zum Spielfeld bereit.
 */
public class HelpController {

    /**
     * Navigiert zurück zum Spielfeld.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void backToGameScreen() throws IOException {
        String previous = GameSessionService.getInstance().getPreviousScreen();
        if (previous.equals("FourConnectGame")) {
            FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
            controller.resumeGame();
        } else {
            App.setRoot("MainMenu");
        }
    }
}