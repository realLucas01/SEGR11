
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

| Kriterium                   | Papyrus (Eclipse-Plugin)                      | StarUML                                | PlantUML                                |
|-----------------------------|-----------------------------------------------|----------------------------------------|-----------------------------------------|
| Kosten / Lizenz             | kostenlos, Open Source (10/10)                | kostenpflichtig (5/10)                 | kostenlos, Open Source (10/10)          |
| Plattformen                 | Eclipse-basiert (9/10)                        | Win / macOS / Linux (9/10)             | plattformunabhängig (10/10)             |
| UML2-Unterstützung          | vollständig (10/10)                           | gut (8/10)                             | gut (8/10)                              |
| Code-Generierung nach Java  | möglich über Eclipse-Plugins (7/10)           | eingeschränkt (6/10)                   | kaum vorhanden (4/10)                   |
| Integration in IDE          | direkt in Eclipse (10/10)                     | eigenständig (6/10)                    | sehr gut mit VS Code (9/10)             |
| Bedienbarkeit / Lernaufwand | etwas komplex (6/10)                          | modern, einfach (8/10)                 | textbasiert, mittel (7/10)              |
| **Gesamt**                  | **52/60**                                     | **42/60**                              | **48/60**

**Fazit:** PlantUML wird im Projekt eingesetzt, da es eine schnelle, textbasierte Erstellung von Diagrammen ermöglicht, sich gut in Visual Studio Code und Eclipse integrieren lässt und besonders effizient für Versionierung über Git geeignet ist.

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

| Kriterium                 | Figma | Balsamiq | Adobe XD |
|---------------------------|------:|---------:|---------:|
| Kosten / Lizenz           | 9     | 5        | 7        |
| Zugriff / Installation    | 10    | 7        | 8        |
| Zusammenarbeit im Team    | 10    | 4        | 8        |
| Bedienbarkeit             | 9     | 9        | 9        |
| Funktionsumfang           | 10    | 6        | 9        |
| Export / Dokumentation    | 9     | 8        | 9        |
| Performance / Stabilität  | 9     | 8        | 9        |
| Eignung für Projekt       | 10    | 6        | 9        |
| **Gesamtbewertung**       | **9.5** | **6.6**  | **8.5**  |

Obwohl Adobe XD nicht die höchste Gesamtbewertung erzielt, wird es im Projekt eingesetzt, da bereits Erfahrung im Team mit der Software besteht und sie Teil der vorhandenen Adobe Creative Cloud ist.

## UI-Prototyping-Tool (Bewertung)

| Kriterium                 | Figma                                      | Balsamiq                                 | Adobe XD                                 |
|---------------------------|--------------------------------------------|------------------------------------------|-------------------------------------------|
| Kosten / Lizenz           | kostenloser Free-Plan (9/10)               | kostenpflichtig (5/10)                   | Teil der Adobe CC (7/10)                  |
| Zugriff / Installation    | Browser + Desktop-App (10/10)              | Desktop-App (7/10)                       | Desktop-App (8/10)                        |
| Zusammenarbeit im Team    | **sehr gut**, Echtzeit (10/10)             | kaum vorhanden (4/10)                    | gut, Cloud-basiert (8/10)                 |
| Bedienbarkeit             | modern, intuitiv (9/10)                    | sehr einfach (9/10)                      | sehr intuitiv (9/10)                      |
| Funktionsumfang           | sehr umfangreich (10/10)                   | stark reduziert (6/10)                   | umfangreich (9/10)                        |
| Export in Doku (PNG/PDF)  | sehr gut (9/10)                            | gut (8/10)                               | sehr gut (9/10)                           |
| Performance / Stabilität  | stabil (9/10)                              | stabil (8/10)                            | stabil (9/10)                             |
| **Gesamt**                | **9.5** | **6.6**  | **8.5**  |


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

| Kriterium                 | GitLab                                         | Discord                                   | E-Mail                                  |
|---------------------------|-----------------------------------------------|-------------------------------------------|-----------------------------------------|
| Hauptzweck               | Versionsverwaltung, Issues, Wiki, Reviews     | Chat/Sprachkanäle, schnelle Abstimmung    | formelle Nachrichten, offizielle Infos  |
| Kosten / Lizenz           | kostenlos (Hochschul- / GitLab-Instanz)      | kostenlos (Basisfunktionen)               | kostenlos (über Hochschul-/Privat-Account) |
| Zusammenarbeit im Team    | **sehr gut**, alles projektbezogen im Repo    | sehr gut, aber eher „chaotisch“           | begrenzt, Antworten verteilen sich über Threads |
| Nachvollziehbarkeit       | hoch (Issues, Commits, Merge Requests, Wiki)  | mittel (viel Chat, schwer zu durchsuchen) | niedrig–mittel (Mails gehen verloren)   |
| Integration mit Code      | **sehr hoch** (Git, CI/CD, Code-Reviews)      | keine direkte Integration, nur Links      | keine direkte Integration               |
| Typische Nutzung          | Aufgabenplanung, Bugtracking, Doku, Reviews   | Absprachen, Meetings, spontane Fragen     | Infos von Dozenten, Ankündigungen       |
| Einarbeitungsaufwand      | mittel, aber sinnvoll für Softwareprojekte    | gering, wie „Gaming-/Gruppenchat“         | sehr gering                              |
| Eignung für unser Projekt | **zentrales Projekt-Tool**                    | gut als Ergänzung für schnellen Austausch | nur ergänzend für „offizielle“ Kommunikation |

