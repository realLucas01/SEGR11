package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

public class MainMenuController {

    @FXML
    public void startGame() throws IOException {
        App.setRoot("FourConnectGame");
    }

    @FXML
    public void openSetting() throws IOException {
        App.setRoot("Settings");
    }

    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}