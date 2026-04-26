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
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class FourConnectGameController implements GameController {

    @FXML
    private GridPane gridPane;

    @FXML
    private Label statusLabel;

    private final FourConnectGame game = new FourConnectGame();
    private Circle[][] circles = new Circle[6][7];

    @Override
    @FXML
    public void restartGame() throws IOException {
        game.restart();
        initBoard();
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
        if (game.getBoard().getCellOwner(column, 0).getType() != Player.NONE) {
            statusLabel.setText("Spalte ist voll!");
            return;
        }
        GameState result = game.dropDisc(column);
        updateBoard();
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
        initBoard();
        updateStatus();
    }

    private void initBoard() {
        gridPane.getChildren().clear();
        BrandingService branding = BrandingService.getInstance();
        circles = new Circle[6][7];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                Circle circle = new Circle(30);
                circle.setFill(Color.GRAY);
                circles[row][col] = circle;
                final int c = col;
                circle.setOnMouseClicked(e -> handleColumnInput(c));
                gridPane.add(circle, col, row);
            }
        }
    }

    private void updateBoard() {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                String colour = game.getBoard().getCellOwner(col, row).getColour();
                if (colour != null) {
                    circles[row][col].setFill(Color.web(colour));
                } else {
                    circles[row][col].setFill(Color.GRAY);
                }
            }
        }
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