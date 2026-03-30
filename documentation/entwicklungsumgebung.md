
## Versionierung 

| Kriterium                 | Git                                      | Mercurial (hg)                          | Subversion (SVN)                          |
|---------------------------|------------------------------------------|-----------------------------------------|-------------------------------------------|
| Kosten / Lizenz           | kostenlos, Open Source                   | kostenlos, Open Source                  | kostenlos, Open Source                    |
| Arbeitsweise              | verteilt (jeder hat vollständiges Repo)  | verteilt                                | zentral (ein zentrales Repo)              |
| Verbreitung / Standard    | **sehr hoch**, De-facto-Standard         | mittel, eher Nische                     | rückläufig, v.a. in Altprojekten          |
| Integration mit GitLab    | **sehr gut**, direkt unterstützt         | nur über Umwege/Bridges                 | nur über Spiegel-Repos                    |
| Einarbeitungsaufwand      | mittel (Branches, Merge, etc.)           | etwas einfacher als Git                 | einfach, aber weniger flexibel            |
| Offline-Arbeit            | vollständig möglich                      | vollständig möglich                     | eingeschränkt (zentrales Repo nötig)      |
| Eignung für Studium       | **sehr gut**, viele Beispiele/Tutorials  | okay, aber wenig Material               | eher nur für Legacy-Szenarien             |
| Eignung für unser Projekt | **empfohlen**                            | nicht notwendig                         | eher ungeeignet                           |


## UML-Tool 

| Kriterium                    | Papyrus (Eclipse-Plugin)                  | Visual Paradigm Community Edition       | StarUML                            |
|-----------------------------|-------------------------------------------|-----------------------------------------|------------------------------------|
| Kosten / Lizenz             | Open Source, kostenlos                    | Kostenlose Community-Edition, sonst lizenzpflichtig | Kostenpflichtig (Testversion gratis) |
| Plattformen                 | Läuft überall, wo Eclipse läuft (Win/Linux an der HTW) | Win / macOS / Linux                    | Win / macOS / Linux                |
| UML2-Unterstützung          | Volle UML2-Unterstützung                  | Volle UML2-Unterstützung               | Gute UML-Unterstützung             |
| Code-Generierung nach Java  | Möglich über Eclipse-Plugins / Profile   | Integrierte Code-Generierung sehr komfortabel | Teilweise über Erweiterungen       |
| Integration in IDE          | Direkt in Eclipse eingebunden            | Eigene IDE, kann mit Eclipse/IntelliJ zusammen genutzt werden | Eigenständiges Tool, keine enge IDE-Integration |
| Bedienbarkeit / Lernaufwand | Oberfläche etwas „oldschool“, aber okay  | Sehr komfortable UI, viele Assistenten  | Moderne UI, relativ leicht bedienbar |
| Eignung für Laborrechner    | Sehr gut, da Eclipse meist schon installiert ist | Muss extra installiert werden          | Muss extra installiert werden      |
| Eignung für unser Projekt   | **empfohlen**                             | geeignet, aber Lizenz & Overkill       | eher ungeeignet                    |

## Build-Tool 

| Kriterium                    | Maven                                      | Gradle                                     | Ant                                     |
|-----------------------------|--------------------------------------------|-------------------------------------------|-----------------------------------------|
| Projektstruktur             | Klare Standardstruktur (konventionsbasiert)| Flexibel, Struktur frei definierbar       | Keine Vorgaben, alles selbst definieren |
| Integration in IDE          | Sehr gut (Eclipse, IntelliJ, VS Code)      | Sehr gut                                   | Gut, aber weniger komfortabel           |
| Abhängigkeiten (Dependencies)| Sehr einfach, riesiges zentrales Repo     | Ebenfalls sehr gut, kompatibel zu Maven   | Möglich, aber aufwendiger               |
| Einarbeitungsaufwand        | Mittel, aber viele Beispiele/Tutorials     | Etwas höher wegen DSL                     | Relativ hoch, da alles von Hand         |
| Typische Nutzung heute      | Standard in sehr vielen Java-Projekten     | Häufig in moderneren Projekten            | Vor allem in älteren/Legacy-Projekten   |
| Eignung für unser Projekt   | **empfohlen**                              | geeignet, aber etwas zu viel für dem Amfanh   | eher ungeeignet                         |

## UI-Prototyping-Tool 

| Kriterium                 | Figma                                      | Balsamiq                                 | Pencil Project                          |
|---------------------------|--------------------------------------------|------------------------------------------|-----------------------------------------|
| Kosten / Lizenz           | kostenloser Free-Plan                      | kostenpflichtig (Testversion verfügbar)  | kostenlos, Open Source                  |
| Zugriff / Installation    | im Browser, optional Desktop-App           | Desktop-App                              | Desktop-App                             |
| Zusammenarbeit im Team    | **sehr gut**, Echtzeit-Kollaboration       | kaum, eher Einzelarbeit                  | keine/kaum Teamfunktionen               |
| Bedienbarkeit             | leicht, moderne Oberfläche                 | sehr einfach, aber stark reduziert       | okay, etwas altmodisch                  |
| Funktionsumfang           | viele Komponenten, klickbare Prototypen    | einfache Wireframes, wenig Details       | einfache Mockups, weniger Komfort       |
| Export in Doku (PNG/PDF)  | sehr gut                                   | gut                                      | gut                                     |
| Eignung für unser Projekt | **empfohlen** (Team + Browser + flexibel)  | möglich, aber weniger Team-geeignet      | möglich, wenn Open Source/offline wichtig |

## IDE / Editor 

| Kriterium                 | IntelliJ IDEA Community                  | Eclipse IDE                             | VS Code (+ Java-Extensions)               |
|---------------------------|------------------------------------------|-----------------------------------------|-------------------------------------------|
| Kosten / Lizenz           | kostenlos (Community Edition)            | kostenlos, Open Source                  | kostenlos, Open Source                    |
| Java-Unterstützung        | **sehr gut**, viele Komfortfeatures      | sehr gut, seit Jahren Java-Standard     | gut, über Extensions                      |
| Bedienbarkeit / Lernaufwand | intuitiv, moderne Oberfläche          | etwas unübersichtlicher, viele Menüs    | leicht, aber Java-Setup etwas aufwendiger |
| Refactoring / Komfort     | sehr starke Refactoring-Tools, Inspektionen | gut, viele Funktionen über Plugins   | okay, weniger mächtige Refactorings       |
| Integration mit Build-/VCS | sehr gute Maven/Gradle/Git-Integration | gute Maven/Gradle/Git-Unterstützung     | Git gut, Build-Tools über Extensions      |
| Performance               | flüssig, braucht aber etwas mehr RAM     | kann träge sein bei vielen Plugins      | leichtgewichtig, startet schnell          |
| Eignung für Einsteiger    | gut, wenn man sich kurz einarbeitet      | okay, aber etwas „alt“ in der Bedienung | gut, vor allem wenn man VS Code schon kennt |
| Eignung für unser Projekt | **empfohlen**                            | geeignet, v.a. wenn an der Hochschule genutzt | geeignet, wenn Team lieber VS Code nutzt |


## Test-Automatisierung 

| Kriterium                 | JUnit 5                                 | TestNG                                  | Mockito                                  |
|---------------------------|-----------------------------------------|-----------------------------------------|------------------------------------------|
| Kosten / Lizenz           | kostenlos, Open Source                  | kostenlos, Open Source                  | kostenlos, Open Source                   |
| Verbreitung / Standard    | **De-facto-Standard** im Java-Bereich   | verbreitet, aber deutlich weniger als JUnit | weit verbreitet als Ergänzung zu JUnit/TestNG |
| Einarbeitungsaufwand      | gering–mittel, viele Beispiele im Netz  | mittel, andere Denkweise als JUnit      | gering, wenn man JUnit kennt             |
| Typischer Einsatz         | Unit- und Integrationstests             | komplexere Test-Szenarien, Legacy-Projekte | saubere Unit-Tests ohne echte Abhängigkeiten |
| Eignung für unser Projekt | **empfohlen als Haupt-Framework**       | möglich, aber nicht nötig               | sinnvoll **zusätzlich** zu JUnit, optional |

## KI-Tools 

| Kriterium                 | ChatGPT (Browser / App)                          | GitHub Copilot                               | Tabnine                                      |
|---------------------------|--------------------------------------------------|----------------------------------------------|----------------------------------------------|
| Kosten / Lizenz           | Free-Variante, bezahlte Plus-/Team-Pläne        | kostenpflichtig (Abo, teilweise Education)   | Free-Variante + kostenpflichtige Pläne       |
| Integration               | im Browser/App, kein IDE-Plugin nötig           | direkt in IDE (z.B. IntelliJ, VS Code)       | direkt in IDE (z.B. IntelliJ, VS Code)       |
| Typische Nutzung          | Erklärungen, Code-Beispiele, Reviews, Textdoku  | Code-Vervollständigung während des Tippens   | Code-Vervollständigung, teils lokal          |
| Abhängigkeit von Internet | ja, benötigt in der Regel Online-Zugriff        | ja                                           | teils lokal, teils Cloud                     |
| Datenschutz / Code-Upload | Code wird an den Dienst gesendet (je nach Plan) | Code wird an den Dienst gesendet             | Fokus teils auf lokalem Modell (Plan-abhängig) |
| Einarbeitungsaufwand      | gering, Chat-Oberfläche                         | gering, arbeitet „einfach im Hintergrund“    | gering, ähnliches Prinzip wie Copilot        |
| Nutzen fürs Lernen        | **sehr hoch** (Erklärungen, Feedback, Beispiele)| mittel – eher Produktivitäts-Booster         | mittel – vor allem Code-Vervollständigung    |
| Eignung für unser Projekt | **empfohlen** als Hilfe beim Lernen & Erklären  | optional, falls jemand eine Lizenz hat       | optional, wenn Fokus auf Privacy/Lokalität   |

## Dokumentationstools 

| Kriterium                 | Javadoc                                  | Markdown im Repository                 | GitLab-Wiki                               |
|---------------------------|-------------------------------------------|----------------------------------------|-------------------------------------------|
| Kosten / Lizenz           | kostenlos, Teil des JDK                  | kostenlos, nur Git-Repo nötig          | kostenlos, in GitLab integriert           |
| Einsatzbereich            | API-/Code-Dokumentation (Klassen, Methoden) | Projekt-/Architektur-/Prozessdoku   | Projekt-/Architektur-/Prozessdoku im Web  |
| Erstellung                | Kommentare im Java-Code + Generierung    | `.md`-Dateien im Repo schreiben        | Seiten direkt im Browser bearbeiten       |
| Integration mit Code/Repo | sehr hoch (direkt aus Java)              | hoch (liegt im selben Repo wie der Code) | hoch (an Repo gekoppelt, Versionsverlauf) |
| Strukturierung / Navigation | Paket-/Klassenhierarchie automatisch   | eigene Ordner/Links/TOC nötig         | Seitenstruktur, Menü, Links zwischen Seiten |
| Einarbeitungsaufwand      | gering–mittel (Javadoc-Tags lernen)      | gering (Markdown ist sehr einfach)     | gering (Editor im Browser, Markdown/HTML) |
| Ausgabe / Darstellung     | HTML-Seiten, technisch, Entwicklerfokus  | schön auf GitHub/GitLab gerendert      | Web-Seiten mit Navigation, gut lesbar     |
| Eignung für unser Projekt | **sehr gut für API-Doku**                | **sehr gut für Pflichtenheft/Architektur** | gut für zusätzliche, lesbare Projektseite |

## Obfuscator 

| Kriterium                 | ProGuard                                   | yGuard                                    | DashO                                      |
|---------------------------|--------------------------------------------|-------------------------------------------|--------------------------------------------|
| Kosten / Lizenz           | kostenlos, Open Source                     | kostenlos, Open Source                    | kommerziell, kostenpflichtig               |
| Integration in Build-Tool | gut (Plugins/Config für Maven, Gradle, Ant)| gut (v.a. Ant/Maven-Integration)         | sehr gut, eigene GUI + Build-Integration   |
| Funktionsumfang           | Obfuscation, Shrinking, Optimierung        | Obfuscation, teilweise Shrinking          | umfangreiche Obfuscation + Analyse-Features|
| Konfigurationsaufwand     | mittel – Konfig-Datei nötig                | mittel – Konfig über Build-Skripte        | eher gering – viele Assistenten            |
| Verbreitung / Bekanntheit | **sehr hoch**, Standard im Open-Source-Bereich | bekannt, aber weniger verbreitet        | v.a. in professionellen Projekten           |
| Dokumentation / Beispiele | viele Beispiele & Tutorials im Netz        | solide Doku, weniger Community            | gute Hersteller-Doku, aber hinter Lizenz   |
| Eignung für unser Projekt | **empfohlen**                              | möglich, aber nicht nötig                 | nicht sinnvoll wegen Kosten                 |

## Code Conventions / Coding Style 
| Kriterium                 | Google Java Style Guide                    | Oracle Java Code Conventions                | Checkstyle                                  |
|---------------------------|--------------------------------------------|---------------------------------------------|---------------------------------------------|
| Art                       | modernes Regelwerk für Java-Stil          | älteres, klassisches Java-Regelwerk         | Tool zur automatischen Stil-/Qualitätsprüfung |
| Kosten / Lizenz           | kostenlos, öffentlich zugänglich           | kostenlos, öffentlich zugänglich            | kostenlos, Open Source                       |
| Inhalt                    | viele konkrete Formatierungs- und Namensregeln (Klassen, Methoden, Imports, Zeilenlängen, etc.) | Basis-Regeln (Einrückung, Benennung, Kommentare) | hängt von den konfigurierten Regeln ab (z.B. Google-Style) |
| Aktualität                | relativ aktuell, weit verbreitet           | historisch wichtig, teilweise veraltet      | aktuell gehalten, nutzbar mit verschiedenen Regelsets |
| Einarbeitungsaufwand      | gering–mittel (Dokument kurz durchgehen)   | gering (viele Regeln überschneiden sich mit Google-Style) | mittel (Konfiguration + in IDE/Build einbinden) |
| Automatische Überprüfung  | nicht direkt, aber viele Tools bieten Profile dafür | nicht direkt                               | **ja**, prüft Code automatisch gegen Regeln |
| Eignung für unser Projekt | **empfohlen als Haupt-Styleguide**         | optional, eher Hintergrund                  | **empfohlen als Tool zur Einhaltung der Regeln** |

## Kollaborationstools 

| Kriterium                 | GitHub                                         | Discord                                   | Miro                                  |
|---------------------------|-----------------------------------------------|-------------------------------------------|-----------------------------------------|
| Hauptzweck               | Versionsverwaltung, Issues, Wiki, Reviews     | Chat/Sprachkanäle, schnelle Abstimmung    | Planung  |
| Kosten / Lizenz           | keine      | keine                | keine über Hochschulaccount |
|Nachvollziehbarkeit|10: Projektbezogen im Repo|5: Chats teilweise ohne Zusammenhang|7: Übersichtlich am Board festgehalten
|Struktur & Orga|10: Glasklare Strukturierung|4: Eher schlecht durch konventionellen Chat|10: Top Organisation möglich
|Kommunikation|6: Teilweise gehen Rückmeldungen verloren, etwas unübersichtlich bei z.B. vielen Pull-Requests|10: Einfache, schnelle Chats, auch Anrufe möglich|2: Keine Benachrichtigung, kein richtiger Chat(verlauf), bei vielen Elementen Tendenz zu Unübersichtlichkeit
|Integration|10: Direkt im Repo|1: Keine Integration, nur über Links und Screeshots möglich|4: Teilweise Integration über erstellten Plan möglich, sonst: Links, Screenshots
|Benutzerfreundlichkeit|7: Konzept muss verstanden werden, Einarbeitung gut|10: Sehr einfache Bedienung, wie ein Messenger|8: Einfache Bedienung wie eine große Tafel
|Zuverlässigkeit|10: Professionelle Infrastruktur mit sehr hoher Uptime, Rollbacks möglich|8: Hohe Uptime, indirekter Informationsverlust|6: (Un)absichtliches überschreiben möglich, hohe Uptime (laut Recherche)
|Datenschutz/Sicherheit|10: Fein einstellbare Zugriffsrechte, Privates Repo, Audit Log, Branch-Review System, jede Änderung sichtbar, individuelle Features vorhanden, 2FA etc. |4: Keine End to End Encryption bei normalen Chats, Zugriff über invite Links (missbrauch möglich)|4: Weitergabe von Zugriffslink sowie u.a. Passwort möglich
|Effizienz|8: Projektbezogenes Tracking, gute Struktur|10: Sehr schneller Austausch möglich, einfache Bedienung|2: Manuelle Pflege, hoher Aufwand
|**Gesamt**|**71/80**|**52/80**|**43/80**

**Fazit:** GitHub für Nachvollziehbare, spezifisch bezogene Kommunikation, Discord für kurze Abstimmungen oder andere/generelle Fragen/Diskussionen und Anrufe. Miro bietet für uns keinen Mehrwert, da die Rahmenbedingungen schon stehen und der Aufwand zur Erstellung eines Boards nicht gerechtfertigt ist.


