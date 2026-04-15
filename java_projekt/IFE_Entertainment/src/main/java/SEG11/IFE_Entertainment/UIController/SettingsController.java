package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

import SEG11.IFE_Entertainment.App;
import javafx.fxml.FXML;

public class SettingsController {

	/*auskommentieren und Importieren sobald alle Vorbereitungen Gemergt sind
	private LocalizationService localizatioService;
	private BrandingService brandingService;
	*/
	
	@FXML
	public void backToMainMenu() throws IOException {
		App.setRoot("MainMenu");
		// TODO
	}
	
	public void changeLanguage(String languageCode) {
		// TODO
	}
	
	public void changeTheme(String themeId) {
		// TODO
	}
}
