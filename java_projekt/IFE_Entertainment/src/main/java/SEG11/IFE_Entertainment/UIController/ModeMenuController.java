package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für das Modusmenü
 */
public class ModeMenuController {

    @FXML
    public void startGame() throws IOException {
        // TODO: FourConnectGame mit GameMode.TWOPLAYER starten
        App.setRoot("FourConnectGame");
    }

    @FXML
    public void startGameEasyBot() throws IOException {
        // TODO: FourConnectGame mit EasyBot starten
        App.setRoot("FourConnectGame");
    }

    @FXML
    public void startGameHardBot() throws IOException {
        // TODO: FourConnectGame mit HardBot starten
        App.setRoot("FourConnectGame");
    }

    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}