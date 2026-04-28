package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
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
        App.setRoot("FourConnectGame");
    }
}