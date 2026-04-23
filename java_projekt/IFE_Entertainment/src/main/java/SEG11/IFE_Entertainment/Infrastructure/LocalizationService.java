package SEG11.IFE_Entertainment.Infrastructure;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Service zur Verwaltung der Anzeigesprache
 */
public class LocalizationService {

    private static LocalizationService instance;

    private static final String BUNDLE_BASE = "i18n.messages";

    private ResourceBundle bundle;
    private Locale currentLocale;

    private LocalizationService() {
        this.currentLocale = Locale.ENGLISH;
        loadBundle();
    }

    public static LocalizationService getInstance() {
        if (instance == null) {
            instance = new LocalizationService();
        }
        return instance;
    }

    private void loadBundle() {
        bundle = ResourceBundle.getBundle(BUNDLE_BASE, currentLocale);
    }

    public String getString(String key) {
        try {
            return bundle.getString(key);
        } catch (MissingResourceException e) {
            return key;
        }
    }

    public void setLocale(Locale locale) {
        this.currentLocale = locale;
        loadBundle();
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }


    public Locale[] getAvailableLocales() {
        return new Locale[]{Locale.ENGLISH, Locale.GERMAN};
    }
    public void setLanguage(String languageCode) {
        setLocale(new Locale(languageCode));
    }

    public String getText(String key) {
        return getString(key);
    }
}