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

package segeleven.ife.entertainment.uicontroller;

import java.io.IOException;
import javafx.fxml.FXML;
import segeleven.ife.entertainment.App;

/**
 * Controller für die allgemeine Hilfe-Seite im Hauptmenü.
 *
 * <p>Stellt die Navigation zurück zum Hauptmenü bereit.
 *
 * @author Truong Tan Long Nguyen
 */
public class MainHelpController {

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
