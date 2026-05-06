# Administratordokumentation - IFE Entertainment

## Übersicht

IFE Entertainment ist eine offlinefähige Spieleapplikation zur Erweiterung des Inflight-Entertainment-Systems (IFE) von Novaris Cabin Systems GmbH. Die Anwendung wird auf den Sitzmonitoren der Passagiere betrieben und bietet aktuell das Spiel Vier Gewinnt an.

---

## Systemanforderungen

- Java 21 LTS (21.0.x)
- JavaFX 21.0.2
- Maven 3.9.x
- Keine Netzwerkverbindung erforderlich - vollständiger Offline-Betrieb
- Keine zusätzliche Peripherie erforderlich - Touch oder Mausbedienung
---

## Installation

Das Programm wird als ausführbare Fat-JAR-Datei ausgeliefert. Diese enthält den gesamten Code sowie alle JavaFX-Bibliotheken und ist ohne separate JavaFX-Installation lauffähig.

### Programmstart
```
java -jar IFE_Entertainment.jar
```
---

## Build aus dem Quellcode

**Voraussetzungen:**
- JDK 21 LTS
- Maven 3.9.x

**Build-Befehl:**
```mvn clean site install```
Dieser Befehl führt folgende Schritte automatisch aus:

1. **Qualitätssicherung** - JUnit Tests werden automatisch ausgeführt
2. **Code Coverage** - JaCoCo misst die Testabdeckung und erstellt Berichte
3. **Fat-JAR** - Code und alle JavaFX-Bibliotheken werden zu einer ausführbaren JAR zusammengepackt
4. **Auto Copy** - Die fertige JAR sowie JavaDocs und Coverage-Berichte werden automatisch in die vorgesehenen Ausgabeordner kopiert

**Ausgaben nach dem Build:**

- Die fertige JAR-Datei liegt nicht im `target/` Ordner sondern wird automatisch in einen konfigurierten Ausgabeordner kopiert
- JavaDocs und Coverage-Berichte werden ebenfalls automatisch kopiert
- Zum Öffnen der Berichte die jeweilige `index.html` im Ausgabeordner starten

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

Das Airline-Branding wird über die Klasse `BrandingService.java` verwaltet. Folgende Eigenschaften können angepasst werden:

| Eigenschaft | Standardwert |
|---|---|
| Primärfarbe | `#1a1a2e` |
| Sekundärfarbe | `#e94560` |
| Logo-Pfad | `/SEG11/IFE_Entertainment/images/logo_default.png` |
| Airline-Name | `Default Airline` |

Die Werte werden im Konstruktor von `BrandingService.java` (Zeile 40-44) angepasst:

```java
private BrandingService() {
    this.primaryColor   = "#1a1a2e";              // Primärfarbe anpassen
    this.secondaryColor = "#e94560";              // Sekundärfarbe anpassen
    this.logoPath       = "/pfad/zum/logo.png";   // Logo-Pfad anpassen
    this.airlineName    = "Airline Name";         // Airline-Name anpassen
}
```

### Sprachkonfiguration

Das Programm unterstützt standardmäßig Deutsch und Englisch. Die Sprache kann in den Einstellungen der Anwendung geändert werden.

Die Sprachdateien liegen unter:

```
src/main/resources/i18n/
├── messages_de.properties   - Deutsche Texte
└── messages_en.properties   - Englische Texte
```

#### Neue Sprache hinzufügen

1. Neue Properties-Datei erstellen: `messages_XX.properties` (XX = Sprachcode, z.B. `fr` für Französisch)
2. Alle Schlüssel aus einer bestehenden Datei übernehmen und übersetzen
3. In `LocalizationService.java` (Zeile 80) die neue Sprache in `getAvailableLocales()` eintragen:

```
java
public Locale[] getAvailableLocales() {
    return new Locale[]{Locale.ENGLISH, Locale.GERMAN, Locale.FRENCH};
}
```

4. Neu bauen: `mvn clean site install`
---
## Tests und Qualitätssicherung

Unit Tests und Code Coverage werden bei jedem Build automatisch ausgeführt. Der Coverage-Bericht wird automatisch in den `final/` Ordner kopiert - zum Öffnen die `index.html` dort starten.

## Bekannte Einschränkungen

- Die `setTheme()` Methode in `BrandingService` ist noch nicht implementiert
- Code Coverage per JaCoCo ist noch nicht aktiv konfiguriert
---

## Fehlerbehebung

### Programm startet nicht
- Java-Version prüfen: `java -version` (muss 21 sein)
- JAR-Datei im `final/` Ordner vorhanden?
- Versionsnummer im Dateinamen korrekt?

### Sprache wird nicht geladen
- Einstellungen in der Anwendung prüfen
- Bei anhaltenden Problemen das Entwicklungsteam kontaktieren

### Build schlägt fehl
- Maven Version prüfen: `mvn -version`
- JDK 21 installiert?
- `mvn clean install` erneut ausführen

- ### Coverage-Bericht nicht sichtbar
- `mvn clean site install` ausführen
- `index.html` im konfigurierten Coverage-Ausgabeordner öffnen

### JavaDocs nicht sichtbar
- `mvn clean site install` ausführen
- `index.html` im konfigurierten JavaDocs-Ausgabeordner öffnen
