package SEG11.IFE_Entertainment.UIGameController;

import java.io.IOException;
import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.UIController.GameController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class FourConnectGameController implements GameController {

    @FXML
    private GridPane gridPane;

    @FXML
    private Label statusLabel;

    private final FourConnectGame game = new FourConnectGame();

    @Override
    @FXML
    public void restartGame() throws IOException {
        game.restart();
        updateStatus();
    }

    @Override
    @FXML
    public void backToMainMenu() throws IOException {
        game.endGame();
        App.setRoot("MainMenu");
    }

    @Override
    @FXML
    public void openHelp() throws IOException {
        App.setRoot("Help");
    }

    public void handleColumnInput(Integer column) {
        if (game.getStatus() != GameState.Running) {
            return;
        }
        GameState result = game.dropDisc(column);
        if (result == GameState.Won) {
            statusLabel.setText("Gewonnen!");
        } else if (result == GameState.Tied) {
            statusLabel.setText("Unentschieden!");
        } else {
            game.playerTurn();
            updateStatus();
        }
    }

    public void handlePlayMode(Player playerOne, Player playerTwo) {
        game.initFourConnectGame(playerOne, playerTwo);
        updateStatus();
    }

    private void updateStatus() {
        GameState state = game.getStatus();
        switch (state) {
            case Running -> statusLabel.setText("Spiel läuft");
            case Won -> statusLabel.setText("Gewonnen!");
            case Tied -> statusLabel.setText("Unentschieden!");
            default -> statusLabel.setText("");
        }
    }
}