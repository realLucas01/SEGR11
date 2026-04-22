package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;
import javafx.fxml.FXML;
import java.io.IOException;

public class SettingsController {

    private final LocalizationService localizationService = LocalizationService.getInstance();
    private final BrandingService brandingService = BrandingService.getInstance();

    @FXML
    public void changeLanguage(String languageCode) {
        localizationService.setLocale(new java.util.Locale(languageCode));
    }

    @FXML
    public void changeTheme(String themeId) {
        brandingService.setAirlineName(themeId);
    }

    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}