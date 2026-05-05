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

## Konfiguration

### Branding (CI-Anpassung)

Das Airline-Branding wird über die Klasse `BrandingService` verwaltet. Folgende Eigenschaften können angepasst werden:

| Eigenschaft | Standardwert |
|---|---|
| Primärfarbe | `#1a1a2e` |
| Sekundärfarbe | `#e94560` |
| Logo-Pfad | `/SEG11/IFE_Entertainment/images/logo_default.png` |
| Airline-Name | `Default Airline` |

Für Branding-Anpassungen bitte das Entwicklungsteam kontaktieren.
}



### Sprachkonfiguration

Das Programm unterstützt standardmäßig Deutsch und Englisch. Die Sprache kann in den Einstellungen der Anwendung geändert werden.

Für das Hinzufügen einer neuen Sprache bitte das Entwicklungsteam kontaktieren.

4. Neu bauen: `mvn clean install`


---

## Bekannte Einschränkungen

- Die `setTheme()` Methode in `BrandingService` ist noch nicht implementiert
- Code Coverage per JaCoCo ist noch nicht aktiv konfiguriert
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

- ### Coverage-Bericht nicht sichtbar
- `mvn clean site install` ausführen
- `index.html` im konfigurierten Coverage-Ausgabeordner öffnen

### JavaDocs nicht sichtbar
- `mvn clean site install` ausführen
- `index.html` im konfigurierten JavaDocs-Ausgabeordner öffnen
