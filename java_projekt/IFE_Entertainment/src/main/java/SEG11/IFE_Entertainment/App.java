/*
 * 1.0 2026-04-22 Lucas Rumann
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

package SEG11.IFE_Entertainment;

import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * JavaFX App
 *
 * @author Lucas Rumann
 */
public class App extends Application {

  private static Scene scene;

  /**
   * Start und erstellung der FX Szene
   *
   * @param stage die primäre stage, auf die die App Szene gesetzt wird. Die Anwendung, kann weitere
   *              Szenen erstellen, diese sind dann aber nicht die primäre  the primary stage for
   *              this application, onto which
   *
   * @throws IOException
   */
  @Override
  public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("MainMenu"), 1000, 900);
    applyBranding();

    stage.setScene(scene);
    stage.setFullScreen(true);
    stage.show();
  }

  /**
   * Setzt eine neue Root-FXML für die aktuelle Scene und aktualisiert anschließend das Branding.
   *
   * @param fxml Name der FXML-Datei ohne Dateiendung
   *
   * @throws IOException falls die FXML-Datei nicht geladen werden kann
   */
  public static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
    applyBranding();
  }

  /**
   * Wendet das aktuell ausgewählte Theme auf die Anwendung an.
   *
   * <p>Dabei werden die Theme-Farben aus dem BrandingService
   * als CSS-Variablen an das Root-Element der Scene übergeben.
   */
  public static void applyBranding() {
    BrandingService branding = BrandingService.getInstance();

    scene.getRoot().setStyle(
      "-theme-primary: " + branding.getPrimaryColor() + ";" + "-theme-secondary: " + branding.getSecondaryColor() + ";");
  }

  /* Lädt, die angegebene JavaFX Datei und zeigt diese an.
   *
   * @param fxml, die Anzuzeigende Datei
   * @return fxmlLoader.load()
   * @throws IOException
   */
  private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    fxmlLoader.setResources(ResourceBundle.getBundle("i18n.messages",
      LocalizationService.getInstance().getCurrentLocale()));
    return fxmlLoader.load();
  }

  /**
   * Lädt eine FXML-Datei, setzt sie als Root der Scene und gibt den zugehörigen Controller zurück.
   *
   * @param <T>  der Typ des Controllers
   * @param fxml der Name der FXML-Datei ohne Dateiendung
   *
   * @return der Controller der geladenen FXML-Datei
   *
   * @throws IOException falls die FXML-Datei nicht geladen werden kann
   */
  public static <T> T setRootAndGetController(String fxml) throws IOException {
    FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    loader.setResources(ResourceBundle.getBundle("i18n.messages",
      LocalizationService.getInstance().getCurrentLocale()));
    scene.setRoot(loader.load());
    return loader.getController();
  }

  public static void main(String[] args) {
    launch();
  }

}
