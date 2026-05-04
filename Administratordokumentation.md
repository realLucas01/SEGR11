# Administratordokumentation - IFE Entertainment

## Übersicht

IFE Entertainment ist eine offlinefähige Spieleapplikation zur Erweiterung des Inflight-Entertainment-Systems (IFE) von Novaris Cabin Systems GmbH. Die Anwendung wird auf den Sitzmonitoren der Passagiere betrieben und bietet aktuell das Spiel Vier Gewinnt an.

---

## Systemanforderungen

- Java 21 LTS (21.0.x)
- JavaFX 21.0.2
- Keine Netzwerkverbindung erforderlich - vollständiger Offline-Betrieb
- Keine zusätzliche Peripherie erforderlich - Touch oder Mausbedienung

---

## Installation

Das Programm wird als ausführbare JAR-Datei ausgeliefert.

### Programmstart
```
java -jar IFE_Entertainment.jar
```
---

## Build aus dem Quellcode

**Voraussetzungen:**
- JDK 21 LTS
- Maven 3.9.x

**Build-Schritte:**

1. Repository klonen
2. In das Projektverzeichnis wechseln:

```cd java_projekt/IFE_Entertainment```
3. Build ausführen:
```mvn clean install```
4. Die fertige JAR-Datei befindet sich im `target/` Ordner

---

## Projektstruktur
```
java_projekt/IFE_Entertainment/
├── src/
│   ├── main/
│   │   ├── java/SEG11/IFE_Entertainment/
│   │   │   ├── FourConnect/             - Spiellogik für Vier Gewinnt
│   │   │   ├── GameCore/                - Allgemeine Spiel-Interfaces
│   │   │   ├── Infrastructure/          - BrandingService, LocalizationService
│   │   │   ├── UIController/            - Allgemeine UI Controller und Interfaces
│   │   │   └── UIFourConnectController/ - Controller spezifisch für Vier Gewinnt
│   │   └── resources/
│   │       ├── i18n/                    - Sprachdateien
│   │       └── SEG11/IFE_Entertainment/ - FXML-Dateien und CSS
│   └── test/                            - Unit Tests
└── pom.xml
```
---

## Konfiguration

### Branding (CI-Anpassung)

Das Airline-Branding wird über die Klasse `BrandingService` verwaltet. Folgende Eigenschaften können angepasst werden:

| Eigenschaft | Standardwert |
|---|---|
| Primärfarbe | `#1a1a2e` |
| Sekundärfarbe | `#e94560` |
| Logo-Pfad | `/SEG11/IFE_Entertainment/images/logo_default.png` |
| Airline-Name | `Default Airline` |

Änderungen werden direkt im Konstruktor von `BrandingService.java` vorgenommen:
```
java
private BrandingService() {
    this.primaryColor   = "#1a1a2e";              // Primärfarbe anpassen
    this.secondaryColor = "#e94560";              // Sekundärfarbe anpassen
    this.logoPath       = "/pfad/zum/logo.png";   // Logo-Pfad anpassen
    this.airlineName    = "Airline Name";         // Airline-Name anpassen
}
```



### Sprachkonfiguration

Das Programm unterstützt standardmäßig Deutsch und Englisch. Die Sprachdateien liegen unter:
```src/main/resources/i18n/
├── messages_de.properties   - Deutsche Texte
└── messages_en.properties   - Englische Texte
```
#### Neue Sprache hinzufügen

1. Neue Properties-Datei erstellen: `messages_XX.properties` (XX = Sprachcode, z.B. `fr` für Französisch)
2. Alle Schlüssel aus einer bestehenden Datei übernehmen und übersetzen
3. In `LocalizationService.java` die neue Sprache in `getAvailableLocales()` eintragen:
```
java
public Locale[] getAvailableLocales() {
    return new Locale[]{Locale.ENGLISH, Locale.GERMAN, Locale.FRENCH};
}
```

4. Neu bauen: `mvn clean install`

---

## Tests

Unit Tests werden mit JUnit 5 ausgeführt:
```mvn test```
Die Tests liegen unter `src/test/java/SEG11IFE_Entertainment/`.

---

## Erweiterung um neue Spiele

Die Architektur ist modular aufgebaut. Um ein neues Spiel hinzuzufügen:

1. Neues Package analog zu `FourConnect/` erstellen
2. `IGame` Interface implementieren
3. Neuen Controller erstellen der `GameController` implementiert
4. FXML-Datei für das neue Spiel erstellen
5. Neues Spiel im Hauptmenü (`MainLayout.fxml`) als Kachel hinzufügen

---

## Bekannte Einschränkungen

- Die `setTheme()` Methode in `BrandingService` ist noch nicht implementiert
- Sprachänderungen werden erst beim nächsten Screenwechsel wirksam

---

## Fehlerbehebung

### Programm startet nicht
- Java-Version prüfen: `java -version` (muss 21 sein)
- JAR-Datei vorhanden?

### Sprache wird nicht geladen
- Properties-Datei vorhanden und korrekt benannt?
- Dateiformat UTF-8?
- Sprachcode in `getAvailableLocales()` eingetragen?

### Build schlägt fehl
- Maven Version prüfen: `mvn -version`
- JDK 21 installiert?
- `mvn clean install` erneut ausführen
