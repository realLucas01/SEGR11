package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

public class MainMenuController {

    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("Game");
    }

    @FXML
    private void switchToHelp() throws IOException {
        App.setRoot("Help");
    }

    @FXML
    private void switchToSettings() throws IOException {
        App.setRoot("Settings");
    }

}