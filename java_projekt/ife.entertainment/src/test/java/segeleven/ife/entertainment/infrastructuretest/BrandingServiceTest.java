package segeleven.ife.entertainment.infrastructuretest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import segeleven.ife.entertainment.infrastructure.BrandingService;

/** Tests für den BrandingService. */
public class BrandingServiceTest {

  private BrandingService service;

  /** Setzt den BrandingService vor jedem Test auf Standardwerte zurück. */
  @BeforeEach
  public void setUp() {
    service = BrandingService.getInstance();
    service.setTheme("gervithrall");
  }

  /** Testet die Rückgabe der Primärfarbe. */
  @Test
  public void testGetPrimaryColor() {
    assertEquals("#004761", service.getPrimaryColor());
  }

  /** Testet die Rückgabe der Sekundärfarbe. */
  @Test
  public void testGetSecondaryColor() {
    assertEquals("#555756", service.getSecondaryColor());
  }

  /** Testet die Rückgabe des Logo-Pfads. */
  @Test
  public void testGetLogoPath() {
    assertEquals("/segeleven/ife.entertainment/images/logo_gervithrall-systems.png", service.getLogoPath());
  }

  /** Testet die Rückgabe des Airline-Namens. */
  @Test
  public void testGetAirlineName() {
    assertEquals("Gervithrall Systems", service.getAirlineName());
  }

  /** Testet die Rückgabe der aktuellen Theme-ID. */
  @Test
  public void testGetCurrentThemeId() {
    assertEquals("gervithrall", service.getCurrentThemeId());
  }

  /** Testet das Setzen der Primärfarbe. */
  @Test
  public void testSetPrimaryColor() {
    service.setPrimaryColor("#ffffff");
    assertEquals("#ffffff", service.getPrimaryColor());
  }

  /** Testet das Setzen der Sekundärfarbe. */
  @Test
  public void testSetSecondaryColor() {
    service.setSecondaryColor("#000000");
    assertEquals("#000000", service.getSecondaryColor());
  }

  /** Testet das Setzen des Logo-Pfads. */
  @Test
  public void testSetLogoPath() {
    service.setLogoPath("/new/path/logo.png");
    assertEquals("/new/path/logo.png", service.getLogoPath());
  }

  /** Testet das Setzen des Airline-Namens. */
  @Test
  public void testSetAirlineName() {
    service.setAirlineName("Test Airline");
    assertEquals("Test Airline", service.getAirlineName());
  }

  /** Testet das Singleton-Pattern. */
  @Test
  public void testSingleton() {
    BrandingService service2 = BrandingService.getInstance();
    assertSame(service, service2);
  }

  /** Testet das Gervithrall-Theme. */
  @Test
  public void testSetThemeGervithrall() {
    service.setTheme("gervithrall");
    assertEquals("#004761", service.getPrimaryColor());
    assertEquals("#555756", service.getSecondaryColor());
    assertEquals("Gervithrall Systems", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_gervithrall-systems.png", service.getLogoPath());
    assertEquals("gervithrall", service.getCurrentThemeId());
  }

  /** Testet das Lufthansa-Theme. */
  @Test
  public void testSetThemeLufthansa() {
    service.setTheme("lufthansa");
    assertEquals("#05164D", service.getPrimaryColor());
    assertEquals("#FFCC00", service.getSecondaryColor());
    assertEquals("Lufthansa", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_lufthansa.png", service.getLogoPath());
    assertEquals("lufthansa", service.getCurrentThemeId());
  }

  /** Testet das Emirates-Theme. */
  @Test
  public void testSetThemeEmirates() {
    service.setTheme("emirates");
    assertEquals("#D71920", service.getPrimaryColor());
    assertEquals("#333333", service.getSecondaryColor());
    assertEquals("Emirates", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_emirates.png", service.getLogoPath());
    assertEquals("emirates", service.getCurrentThemeId());
  }

  /** Testet das Ryanair-Theme. */
  @Test
  public void testSetThemeRyanair() {
    service.setTheme("ryanair");
    assertEquals("#073590", service.getPrimaryColor());
    assertEquals("#F1C933", service.getSecondaryColor());
    assertEquals("Ryanair", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_ryanair.png", service.getLogoPath());
    assertEquals("ryanair", service.getCurrentThemeId());
  }

  /** Testet das Singapore-Theme. */
  @Test
  public void testSetThemeSingapore() {
    service.setTheme("singapore");
    assertEquals("#0F2E6D", service.getPrimaryColor());
    assertEquals("#F9B000", service.getSecondaryColor());
    assertEquals("Singapore Airlines", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_singapore.png", service.getLogoPath());
    assertEquals("singapore", service.getCurrentThemeId());
  }

  /** Testet das Standard-Theme bei unbekannter Theme-ID. */
  @Test
  public void testSetThemeDefault() {
    service.setTheme("unknown");
    assertEquals("#004761", service.getPrimaryColor());
    assertEquals("#555756", service.getSecondaryColor());
    assertEquals("Gervithrall Systems", service.getAirlineName());
    assertEquals("/segeleven/ife.entertainment/images/logo_gervithrall-systems.png", service.getLogoPath());
    assertEquals("gervithrall", service.getCurrentThemeId());
  }
}