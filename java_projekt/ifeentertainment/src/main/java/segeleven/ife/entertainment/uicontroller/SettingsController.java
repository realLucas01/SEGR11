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

import segeleven.ife.entertainment.App;
import segeleven.ife.entertainment.infrastructure.LocalizationService;
import segeleven.ife.entertainment.infrastructure.BrandingService;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

/**
 * Controller für den Einstellungs-Screen.
 *
 * <p>Ermöglicht die Anpassung der Sprache und des Themes der Anwendung.
 *
 * @author Truong Tan Long Nguyen
 */
public class SettingsController {

  /** Auswahlfeld für die Sprache. */
  @FXML
  private ComboBox<String> languageBox;

  /** Auswahlfeld für das Theme. */
  @FXML
  private ComboBox<String> themeBox;

  private final LocalizationService localizationService = LocalizationService.getInstance();
  private final BrandingService brandingService = BrandingService.getInstance();

  /**
   * Initialisiert die ComboBox mit den verfügbaren Sprachen und setzt die aktuell gewählte
   * Sprache.
   */
  @FXML
  public void initialize() {
    languageBox.getItems().addAll("de", "en");
    languageBox.setValue(localizationService.getCurrentLocale().getLanguage());

    themeBox.getItems().addAll("gervithrall", "lufthansa", "emirates", "ryanair");
    themeBox.setValue("gervithrall");

  }

  /**
   * Ändert die Anzeigesprache anhand der Auswahl in der ComboBox und lädt den Settings-Screen neu.
   *
   * @throws IOException falls die FXML-Datei nicht geladen werden kann
   */
  @FXML
  public void changeLanguage() throws IOException {
    String languageCode = languageBox.getValue();
    if (languageCode != null) {
      localizationService.setLanguage(languageCode);
      App.setRoot("Settings");
    }
  }

  /**
   * Ändert das Theme der Anwendung.
   * TODO: Themawahl implementieren (KANN-Kriterium)
   */
  @FXML
  public void changeTheme() {
    String selectedTheme = themeBox.getValue();
    if (selectedTheme != null) {
      brandingService.setTheme(selectedTheme);
      App.applyBranding();
    }
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
