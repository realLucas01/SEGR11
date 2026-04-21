package SEG11.IFE_Entertainment.Infrastructure;

/**
 * Service zur Verwaltung des Airline-Brandings (CI-Anpassung).
 * Singleton – einmalig instanziiert, global zugänglich.
 */
public class BrandingService {

    private static BrandingService instance;

    private String primaryColor;
    private String secondaryColor;
    private String logoPath;
    private String airlineName;

    private BrandingService() {
        this.primaryColor   = "#1a1a2e";
        this.secondaryColor = "#e94560";
        this.logoPath       = "/SEG11/IFE_Entertainment/images/logo_default.png";
        this.airlineName    = "Default Airline";
    }

    public static BrandingService getInstance() {
        if (instance == null) {
            instance = new BrandingService();
        }
        return instance;
    }

    // --- Getter ---

    public String getPrimaryColor() {
        return primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getAirlineName() {
        return airlineName;
    }

    // --- Setter ---

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
