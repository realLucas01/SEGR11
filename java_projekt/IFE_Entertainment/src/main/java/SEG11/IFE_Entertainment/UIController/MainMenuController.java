package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

public class MainMenuController {

	// TODO in startGame() umändern und implementieren
    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("FourConnectGame");
        // TODO
    }
    
    @FXML
    private void openSettings() throws IOException{
    	// TODO
    }
    
    @FXML
    private void backToMainMenu() throws IOException{
    	// TODO
    }
}
