package segeleven.ife.entertainment.infrastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocalizationServiceTest {

  private LocalizationService service;

  @BeforeEach
  void setUp() {
    service = LocalizationService.getInstance();
    service.setLocale(Locale.ENGLISH);
  }

  @Test
  void testGetCurrentLocale() {
    assertEquals(Locale.ENGLISH, service.getCurrentLocale());
  }

  @Test
  void testSetLocale() {
    service.setLocale(Locale.GERMAN);
    assertEquals(Locale.GERMAN, service.getCurrentLocale());
  }

  @Test
  void testSetLanguage() {
    service.setLanguage("de");
    assertEquals("de", service.getCurrentLocale().getLanguage());
  }

  @Test
  void testGetAvailableLocales() {
    Locale[] locales = service.getAvailableLocales();
    assertEquals(2, locales.length);
    assertEquals(Locale.ENGLISH, locales[0]);
    assertEquals(Locale.GERMAN, locales[1]);
  }

  @Test
  void testGetStringMissingKey() {
    assertEquals("nonexistent.key", service.getString("nonexistent.key"));
  }

  @Test
  void testGetTextMissingKey() {
    assertEquals("nonexistent.key", service.getText("nonexistent.key"));
  }

  @Test
  void testSingleton() {
    LocalizationService service2 = LocalizationService.getInstance();
    assertSame(service, service2);
  }

  @Test
  void testGetStringEnglish() {
    service.setLocale(Locale.ENGLISH);
    assertEquals("Start Game", service.getString("menu.start"));
  }

  @Test
  void testGetStringGerman() {
    service.setLocale(Locale.GERMAN);
    assertEquals("Spiel starten", service.getString("menu.start"));
  }

  @Test
  void testGetTextEnglish() {
    service.setLocale(Locale.ENGLISH);
    assertEquals("Four Connect", service.getText("game.title"));
  }

  @Test
  void testGetTextGerman() {
    service.setLocale(Locale.GERMAN);
    assertEquals("Vier Gewinnt", service.getText("game.title"));
  }
}
