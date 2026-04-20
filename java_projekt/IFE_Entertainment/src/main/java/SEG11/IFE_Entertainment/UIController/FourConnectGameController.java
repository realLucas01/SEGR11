package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class FourConnectGameController {


    @FXML
    private void restartGame() throws IOException {
        App.setRoot("FourConnectGame");
    }

    @FXML
    private void switchToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }

    @FXML
    private void switchToHelp() throws IOException {
        App.setRoot("Help");
    }
}