package SEG11.IFE_Entertainment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MainMenu"), 1000, 900);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
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
        scene.setRoot(loader.load());
        return loader.getController();
    }

}