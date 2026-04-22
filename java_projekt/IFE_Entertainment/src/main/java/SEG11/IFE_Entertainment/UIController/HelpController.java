package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für die Hilfe
 */
public class HelpController {

    @FXML
    public void backToGameScreen() throws IOException {
        App.setRoot("FourConnectGame");
    }
}