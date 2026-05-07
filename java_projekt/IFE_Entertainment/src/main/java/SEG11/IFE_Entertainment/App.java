package SEG11.IFE_Entertainment;

import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MainMenu"), 1000, 900);
        applyBranding();

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    /**
     * Setzt eine neue Root-FXML für die aktuelle Scene
     * und aktualisiert anschließend das Branding.
     *
     * @param fxml Name der FXML-Datei ohne Dateiendung
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
            "-theme-primary: " + branding.getPrimaryColor() + ";" +
            "-theme-secondary: " + branding.getSecondaryColor() + ";"
        );
    }    
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("i18n.messages",
                LocalizationService.getInstance().getCurrentLocale()));
        return fxmlLoader.load();
    }

    /**
     * Lädt eine FXML-Datei, setzt sie als Root der Scene und gibt den zugehörigen Controller zurück.
     *
     * @param <T> der Typ des Controllers
     * @param fxml der Name der FXML-Datei ohne Dateiendung
     * @return der Controller der geladenen FXML-Datei
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