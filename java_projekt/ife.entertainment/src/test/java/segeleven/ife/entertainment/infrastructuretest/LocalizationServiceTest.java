package segeleven.ife.entertainment.infrastructuretest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import segeleven.ife.entertainment.infrastructure.LocalizationService;

/** Tests für den LocalizationService. */
public class LocalizationServiceTest {

  private LocalizationService service;

  /** Setzt den LocalizationService vor jedem Test auf Englisch zurück. */
  @BeforeEach
  public void setUp() {
    service = LocalizationService.getInstance();
    service.setLocale(Locale.ENGLISH);
  }

  /** Testet die Rückgabe des aktuellen Locales. */
  @Test
  public void testGetCurrentLocale() {
    assertEquals(Locale.ENGLISH, service.getCurrentLocale());
  }

  /** Testet das Setzen des Locales auf Deutsch. */
  @Test
  public void testSetLocale() {
    service.setLocale(Locale.GERMAN);
    assertEquals(Locale.GERMAN, service.getCurrentLocale());
  }

  /** Testet das Setzen der Sprache auf Deutsch per Sprachcode. */
  @Test
  public void testSetLanguageDe() {
    service.setLanguage("de");
    assertEquals("de", service.getCurrentLocale().getLanguage());
  }

  /** Testet das Setzen der Sprache auf Englisch per Sprachcode. */
  @Test
  public void testSetLanguageEn() {
    service.setLanguage("en");
    assertEquals("en", service.getCurrentLocale().getLanguage());
  }

  /** Testet die Rückgabe der verfügbaren Locales. */
  @Test
  public void testGetAvailableLocales() {
    Locale[] locales = service.getAvailableLocales();
    assertEquals(2, locales.length);
    assertEquals(Locale.ENGLISH, locales[0]);
    assertEquals(Locale.GERMAN, locales[1]);
  }

  /** Testet getString mit einem nicht vorhandenen Schlüssel. */
  @Test
  public void testGetStringMissingKey() {
    assertEquals("nonexistent.key", service.getString("nonexistent.key"));
  }

  /** Testet getText mit einem nicht vorhandenen Schlüssel. */
  @Test
  public void testGetTextMissingKey() {
    assertEquals("nonexistent.key", service.getText("nonexistent.key"));
  }

  /** Testet das Singleton-Pattern. */
  @Test
  public void testSingleton() {
    LocalizationService service2 = LocalizationService.getInstance();
    assertSame(service, service2);
  }

  /** Testet getString mit einem gültigen Schlüssel auf Englisch. */
  @Test
  public void testGetStringEnglish() {
    service.setLocale(Locale.ENGLISH);
    assertEquals("Start Game", service.getString("menu.start"));
  }

  /** Testet getString mit einem gültigen Schlüssel auf Deutsch. */
  @Test
  public void testGetStringGerman() {
    service.setLocale(Locale.GERMAN);
    assertEquals("Spiel starten", service.getString("menu.start"));
  }

  /** Testet getText mit einem gültigen Schlüssel auf Englisch. */
  @Test
  public void testGetTextEnglish() {
    service.setLocale(Locale.ENGLISH);
    assertEquals("Four Connect", service.getText("game.title"));
  }

  /** Testet getText mit einem gültigen Schlüssel auf Deutsch. */
  @Test
  public void testGetTextGerman() {
    service.setLocale(Locale.GERMAN);
    assertEquals("Vier Gewinnt", service.getText("game.title"));
  }
}