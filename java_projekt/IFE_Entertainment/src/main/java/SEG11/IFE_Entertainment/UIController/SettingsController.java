public class SettingsController {

    private final LocalizationService localizationService = LocalizationService.getInstance();
    private final BrandingService brandingService = BrandingService.getInstance();

    @FXML
    public void changeLanguage() {
        // TODO: Sprachwahl implementieren (KANN-Kriterium)
    }

    @FXML
    public void changeTheme() {
        // TODO: Themawahl implementieren (KANN-Kriterium)
    }

    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}