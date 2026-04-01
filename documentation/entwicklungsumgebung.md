
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

| Kriterium (Gewichtung)              | Papyrus (Eclipse-Plugin)            | StarUML                                   | PlantUML                                   |
|-------------------------------------|-------------------------------------|-------------------------------------------|--------------------------------------------|
| Kosten / Lizenz (x1.25)             | 10: Kostenlos und Open Source       | 5: Kostenpflichtig, Testversion verfügbar | 10: Kostenlos und Open Source              |
| Plattformen (x1.0)                  | 9: Läuft überall mit Eclipse        | 9: Win / macOS / Linux                    | 10: Plattformunabhängig                    |
| UML2-Unterstützung (x1.5)           | 10: Vollständige UML2-Unterstützung | 8: Gute UML-Unterstützung                 | 8: Gute UML-Unterstützung                  |
| Code-Generierung (x0.75)            | 7: Möglich über Plugins             | 6: Eingeschränkt                          | 4: Kaum vorhanden                          |
| Integration in IDE (x1.5)           | 10: Direkt in Eclipse integriert    | 6: Eigenständiges Tool                    | 9: Sehr gut mit VS Code integrierbar       |
| Bedienbarkeit (x1.0)                | 6: Etwas komplex und altmodisch     | 8: Moderne und intuitive Oberfläche       | 7: Textbasiert, erfordert Eingewöhnung     |
| Wartbarkeit / Versionierung (x1.25) | 7: Eingeschränkt über Eclipse       | 6: Schwer versionierbar                   | 10: Perfekt für Git geeignet (textbasiert) |
| **Gesamt**                          | **71.5 / 82.5 = 86.7%**             | **56.25 / 82.5 = 68.2%**                  | **70.5 / 82.5 = 85.5%**                    |

**Fazit:** PlantUML wird im Projekt bevorzugt eingesetzt, da es eine sehr gute Integration in den bestehenden Entwicklungsworkflow bietet, besonders effizient für Versionierung über Git ist und eine schnelle, reproduzierbare Erstellung von UML-Diagrammen ermöglicht.

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

| Kriterium (Gewichtung)        | Figma                              | Balsamiq                    | Adobe XD                         |
|-------------------------------|------------------------------------|-----------------------------|----------------------------------|
| Kosten / Lizenz (x1.25)       | 9: Kostenloser Free-Plan verfügbar | 5: Kostenpflichtig          | 7: Teil der Adobe Creative Cloud |
| Zugriff / Installation (x1.0) | 10: Browser + Desktop-App          | 7: Nur Desktop              | 8: Desktop + Cloud-Anbindung     |
| Zusammenarbeit (x1.5)         | 10: Echtzeit-Kollaboration         | 4: Kaum vorhanden           | 8: Gute Cloud-Zusammenarbeit     |
| Bedienbarkeit (x1.0)          | 9: Intuitiv und modern             | 9: Sehr einfach             | 9: Sehr intuitiv                 |
| Funktionsumfang (x1.5)        | 10: Sehr umfangreich               | 6: Stark reduziert          | 9: Umfangreich                   |
| Export / Dokumentation (x1.0) | 9: Sehr guter Export               | 8: Gute Exportmöglichkeiten | 9: Sehr guter Export             |
| Performance (x1.0)            | 9: Stabil und performant           | 8: Stabil                   | 9: Stabil                        |
| **Gesamt**                    | **78.25 / 82.5 = 94.8%**           | **53.25 / 82.5 = 64.5%**    | **69.25 / 82.5 = 83.9%**         |

**Fazit:** Obwohl Figma die höchste Gesamtbewertung erzielt, wird im Projekt Adobe XD eingesetzt, da bereits umfangreiche Erfahrung im Team vorhanden ist und es Teil der bestehenden Adobe Creative Cloud ist.

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

