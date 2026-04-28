package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import SEG11.IFE_Entertainment.Infrastructure.LocalizationService;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import java.io.IOException;

/**
 * Controller für den Einstellungs-Screen.
 *
 * <p>Ermöglicht die Anpassung der Sprache und des Themes der Anwendung.
 */
public class SettingsController {

    /** Auswahlfeld für die Sprache. */
    @FXML
    private ComboBox<String> languageBox;

    private final LocalizationService localizationService = LocalizationService.getInstance();
    private final BrandingService brandingService = BrandingService.getInstance();

    /**
     * Ändert die Anzeigesprache anhand der Auswahl in der ComboBox.
     */
    @FXML
    public void changeLanguage() {
        String languageCode = languageBox.getValue();
        if (languageCode != null) {
            localizationService.setLanguage(languageCode);
        }
    }

    /**
     * Ändert das Theme der Anwendung.
     * TODO: Themawahl implementieren (KANN-Kriterium)
     */
    @FXML
    public void changeTheme() {
        // TODO: Themawahl implementieren (KANN-Kriterium)
    }

    /**
     * Navigiert zurück zum Hauptmenü.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}