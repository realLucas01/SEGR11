package SEG11.IFE_Entertainment.UIGameController;

import java.io.IOException;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.UIController.GameController;
import javafx.fxml.FXML;

public class FourConnectGameController implements GameController{

	@Override
	@FXML
	public void restartGame() throws IOException {
		// TODO
	}

	@Override
	@FXML
	public void backToMainMenu() throws IOException {
		App.setRoot("MainMenu");
		// TODO
	}

	@Override
	@FXML
	public void openHelp() throws IOException {
		// TODO 
	}
	
	public void handleColumnInput(Integer column) {
		// TODO
	}
	
	/*auskommentieren und Importieren sobald alle Vorbereitungen Gemergt sind
	public void handlePlayMode(Player player) { 
		// TODO 
	}
	*/
}