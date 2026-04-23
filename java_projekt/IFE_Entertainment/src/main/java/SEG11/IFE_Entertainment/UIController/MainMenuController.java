package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

public class MainMenuController {

    @FXML
    public void startGame() throws IOException {
        App.setRoot("ModeMenu");
    }

    @FXML
    public void openSettings() throws IOException {
        App.setRoot("Settings");
    }

    @FXML
    public void exit() {
        System.exit(0);
    }
    @FXML
    public void openHelp() throws IOException {
        App.setRoot("Help");
    }
}