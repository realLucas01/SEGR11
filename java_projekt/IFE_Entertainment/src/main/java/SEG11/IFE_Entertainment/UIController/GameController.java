package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

public class GameController {

    @FXML
    private void switchToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}