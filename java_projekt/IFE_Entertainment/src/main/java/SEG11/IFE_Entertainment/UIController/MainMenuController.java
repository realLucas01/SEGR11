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