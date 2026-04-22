package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;
import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("FourConnectGame");
    }

    @FXML
    private void openModeMenu() throws IOException {
        App.setRoot("ModeMenu");
    }

    @FXML
    private void openSettings() throws IOException {
        App.setRoot("Settings");
    }

    @FXML
    private void openHelp() throws IOException {
        App.setRoot("Help");
    }

    @FXML
    private void onExit() {
        System.exit(0);
    }
}