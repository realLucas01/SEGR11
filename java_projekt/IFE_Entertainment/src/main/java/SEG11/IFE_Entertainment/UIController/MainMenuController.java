package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;
import java.io.IOException;

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

    @FXML
    private void switchToHelp() throws IOException {
        App.setRoot("Help");
    }

    @FXML
    private void switchToSettings() throws IOException {
        App.setRoot("Settings");
    }

}