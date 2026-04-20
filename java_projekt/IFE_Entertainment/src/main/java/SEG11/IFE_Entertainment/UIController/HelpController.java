package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

import java.io.IOException;

/**
 * Controller für die Hilfe
 */
public class HelpController {

    /**
     * Navigiert zurück zum Hauptmenü
     */
    @FXML
    private void switchToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}
 