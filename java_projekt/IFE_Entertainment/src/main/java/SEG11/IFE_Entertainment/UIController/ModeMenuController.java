package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.UIGameController.FourConnectGameController;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für das Modusmenü
 */
public class ModeMenuController {

    @FXML
    public void startGame() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HUMAN);
    }

    @FXML
    public void startGameEasyBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.EASYBOT);
    }

    @FXML
    public void startGameHardBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HARDBOT);
    }

    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}