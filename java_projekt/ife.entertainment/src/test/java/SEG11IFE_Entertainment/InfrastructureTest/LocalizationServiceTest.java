package SEG11IFE_Entertainment.InfrastructureTest;

import segeleven.ife.entertainment.infrastructure.LocalizationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

public class LocalizationServiceTest {

    private LocalizationService service;

    @BeforeEach
    public void setUp() {
        service = LocalizationService.getInstance();
        service.setLocale(Locale.ENGLISH);
    }

    @Test
    public void testGetCurrentLocale() {
        assertEquals(Locale.ENGLISH, service.getCurrentLocale());
    }

    @Test
    public void testSetLocale() {
        service.setLocale(Locale.GERMAN);
        assertEquals(Locale.GERMAN, service.getCurrentLocale());
    }

    @Test
    public void testSetLanguage() {
        service.setLanguage("de");
        assertEquals("de", service.getCurrentLocale().getLanguage());
    }

    @Test
    public void testGetAvailableLocales() {
        Locale[] locales = service.getAvailableLocales();
        assertEquals(2, locales.length);
        assertEquals(Locale.ENGLISH, locales[0]);
        assertEquals(Locale.GERMAN, locales[1]);
    }

    @Test
    public void testGetStringMissingKey() {
        assertEquals("nonexistent.key", service.getString("nonexistent.key"));
    }

    @Test
    public void testGetTextMissingKey() {
        assertEquals("nonexistent.key", service.getText("nonexistent.key"));
    }

    @Test
    public void testSingleton() {
        LocalizationService service2 = LocalizationService.getInstance();
        assertSame(service, service2);
    }

    @Test
    public void testGetStringEnglish() {
        service.setLocale(Locale.ENGLISH);
        assertEquals("Start Game", service.getString("menu.start"));
    }

    @Test
    public void testGetStringGerman() {
        service.setLocale(Locale.GERMAN);
        assertEquals("Spiel starten", service.getString("menu.start"));
    }

    @Test
    public void testGetTextEnglish() {
        service.setLocale(Locale.ENGLISH);
        assertEquals("Four Connect", service.getText("game.title"));
    }

    @Test
    public void testGetTextGerman() {
        service.setLocale(Locale.GERMAN);
        assertEquals("Vier Gewinnt", service.getText("game.title"));
    }
}