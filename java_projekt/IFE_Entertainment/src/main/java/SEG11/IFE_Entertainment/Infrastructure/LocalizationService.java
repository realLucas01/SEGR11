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

package seg11.ife_entertainment.infrastructure;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Service zur Verwaltung der Anzeigesprache.
 *
 * <p>Lädt Texte aus den entsprechenden Properties-Dateien basierend auf der
 * aktuell eingestellten Sprache. Wird als Singleton implementiert, sodass nur eine Instanz global
 * zugänglich ist.
 *
 * @author Truong Tan Long Nguyen
 */
public class LocalizationService {

  private static LocalizationService instance;

  private static final String BUNDLE_BASE = "i18n.messages";

  private ResourceBundle bundle;
  private Locale currentLocale;

  /**
   * Privater Konstruktor, setzt Standardsprache auf Englisch.
   */
  private LocalizationService() {
    this.currentLocale = Locale.ENGLISH;
    loadBundle();
  }

  /**
   * Gibt die einzige Instanz des LocalizationService zurück.
   *
   * @return die Singleton-Instanz
   */
  public static LocalizationService getInstance() {
    if (instance == null) {
      instance = new LocalizationService();
    }
    return instance;
  }

  /**
   * Lädt das ResourceBundle für die aktuelle Sprache.
   */
  private void loadBundle() {
    bundle = ResourceBundle.getBundle(BUNDLE_BASE, currentLocale);
  }

  /**
   * Gibt den Text zum angegebenen Schlüssel zurück. Falls der Schlüssel nicht gefunden wird, wird
   * der Schlüssel selbst zurückgegeben.
   *
   * @param key der Schlüssel des gesuchten Texts
   *
   * @return der lokalisierte Text oder der Schlüssel bei fehlendem Eintrag
   */
  public String getString(String key) {
    try {
      return bundle.getString(key);
    } catch (MissingResourceException e) {
      return key;
    }
  }

  /**
   * Setzt die aktuelle Sprache und lädt das Bundle neu.
   *
   * @param locale das neue Locale
   */
  public void setLocale(Locale locale) {
    this.currentLocale = locale;
    loadBundle();
  }

  /**
   * Gibt das aktuell eingestellte Locale zurück.
   *
   * @return das aktuelle Locale
   */
  public Locale getCurrentLocale() {
    return currentLocale;
  }

  /**
   * Gibt alle verfügbaren Sprachen zurück.
   *
   * @return Array der verfügbaren Locales
   */
  public Locale[] getAvailableLocales() {
    return new Locale[] {Locale.ENGLISH, Locale.GERMAN};
  }

  /**
   * Setzt die Sprache anhand eines Sprachcodes.
   *
   * @param languageCode der Sprachcode, z.B. "de" oder "en"
   */
  public void setLanguage(String languageCode) {
    setLocale(new Locale(languageCode));
  }

  /**
   * Gibt den Text zum angegebenen Schlüssel zurück.
   *
   * @param key der Schlüssel des gesuchten Texts
   *
   * @return der lokalisierte Text
   */
  public String getText(String key) {
    return getString(key);
  }
}
