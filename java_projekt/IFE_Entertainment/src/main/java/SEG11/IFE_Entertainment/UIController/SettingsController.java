package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Locale;


public class SettingsController {

    private final LocalizationService localizationService = LocalizationService.getInstance();


    @FXML
    private void setLanguageEnglish() {
        localizationService.setLocale(Locale.ENGLISH);
    }


    @FXML
    private void setLanguageGerman() {
        localizationService.setLocale(Locale.GERMAN);
    }


    @FXML
    private void switchToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}
