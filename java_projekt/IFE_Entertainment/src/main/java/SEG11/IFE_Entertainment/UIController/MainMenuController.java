package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

public class MainMenuController {

    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("Game");
    }
}
