/*
 * 1.0 2026-04-28 Truong Tan Long Nguyen
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Gervithrall Systems GmbH ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Gervithrall Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package SEG11.IFE_Entertainment.Infrastructure;

/**
 * Service zur Verwaltung des Airline-Brandings (CI-Anpassung).
 *
 * <p>Ermöglicht die Anpassung der visuellen Identität der Airline,
 * einschließlich Farben, Logo und Name. Wird als Singleton implementiert,
 * sodass nur eine Instanz global zugänglich ist.
 * 
 * @author Truong Tan Long Nguyen
 */
public class BrandingService {

    private static BrandingService instance;

    private String primaryColor;
    private String secondaryColor;
    private String logoPath;
    private String airlineName;
    private String currentThemeId;

    /**
     * Privater Konstruktor mit Standardwerten für das Default-Branding.
     */
    private BrandingService() {
        setTheme("gervithrall");
    }
    
    /**
     * Gibt die einzige Instanz des BrandingService zurück.
     *
     * @return die Singleton-Instanz
     */
    public static BrandingService getInstance() {
        if (instance == null) {
            instance = new BrandingService();
        }
        return instance;
    }

    /**
     * Gibt die Primärfarbe zurück.
     *
     * @return die Primärfarbe als Hex-String
     */
    public String getPrimaryColor() {
        return primaryColor;
    }

    /**
     * Gibt die Sekundärfarbe zurück.
     *
     * @return die Sekundärfarbe als Hex-String
     */
    public String getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * Gibt den Pfad zum Logo zurück.
     *
     * @return der Logo-Pfad
     */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * Gibt den Namen der Airline zurück.
     *
     * @return der Airline-Name
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Gibt die ID der aktuellen Airline zurück.
     *
     * @return der Airline-ID
     */
    public String getCurrentThemeId() {
        return currentThemeId;
    }
    
    /**
     * Setzt die Primärfarbe.
     *
     * @param primaryColor die neue Primärfarbe als Hex-String
     */
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    /**
     * Setzt die Sekundärfarbe.
     *
     * @param secondaryColor die neue Sekundärfarbe als Hex-String
     */
    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    /**
     * Setzt den Pfad zum Logo.
     *
     * @param logoPath der neue Logo-Pfad
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    /**
     * Setzt den Namen der Airline.
     *
     * @param airlineName der neue Airline-Name
     */
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    /**
     * Setzt das Theme anhand einer Theme-ID.
     *
     * @param themeId die ID des gewünschten Themes
     */
    public void setTheme(String themeId) {
    	this.currentThemeId = themeId;
    	
    	switch (themeId) {

    	case "gervithrall":
    	    this.primaryColor = "#004761";
    	    this.secondaryColor = "#555756";
    	    this.airlineName = "Gervithrall Systems";
    	    this.logoPath = "/SEG11/IFE_Entertainment/images/logo_gervithrall-systems.png";
    	    break;
    	
    	case "lufthansa":
            this.primaryColor = "#05164D";
            this.secondaryColor = "#FFCC00";
            this.airlineName = "Lufthansa";
            this.logoPath = "/SEG11/IFE_Entertainment/images/logo_lufthansa.png";
            break;

        case "emirates":
            this.primaryColor = "#D71920";
            this.secondaryColor = "#333333";
            this.airlineName = "Emirates";
            this.logoPath = "/SEG11/IFE_Entertainment/images/logo_emirates.png";
            break;

        case "ryanair":
            this.primaryColor = "#073590";
            this.secondaryColor = "#F1C933";
            this.airlineName = "Ryanair";
            this.logoPath = "/SEG11/IFE_Entertainment/images/logo_ryanair.png";
            break;

        case "singapore":
            this.primaryColor = "#0F2E6D";
            this.secondaryColor = "#F9B000";
            this.airlineName = "Singapore Airlines";
            this.logoPath = "/SEG11/IFE_Entertainment/images/logo_singapore.png";
            break;

        default:
        	this.currentThemeId = "gervithrall";
        	this.primaryColor = "#004761";
            this.secondaryColor = "#555756";
            this.airlineName = "Gervithrall Systems";
            this.logoPath = "/SEG11/IFE_Entertainment/images/logo_gervithrall-systems.png";
            break;
    	}
    }
}