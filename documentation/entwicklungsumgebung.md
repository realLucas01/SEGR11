
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


### Test-Automatisierung

| Kriterium | JUnit 5 | TestNG | Mockito |
| :--- | :--- | :--- | :--- |
| Verbreitung und Standard | 10: De-facto-Standard im Java-Bereich | 6: Verbreitet, aber deutlich weniger als JUnit | 9: Weit verbreitet als Ergänzung zu JUnit |
| Einarbeitungsaufwand | 9: Gering bis mittel, viele Best Practices im Netz etabliert | 7: Mittel, erfordert teilweise andere Denkweise | 8: Gering, sofern man Architektur pattern kennt |
| Typischer Einsatz | 10: Ideal für Unit- und Integrationstests der Spiellogik | 6: Eher für komplexe Test-Szenarien und Legacy-Projekte | 8: Gut für saubere Unit-Tests wie zum Beispiel Mocking |
| Wartbarkeit und Lesbarkeit | 10: Sehr klare Strukturierung durch moderne Annotationen | 7: Solide, kann bei großen Suites unübersichtlich werden | 9: Ermöglicht lesbare Tests durch eine flüssige Schnittstelle |
| Build-Integration | 10: Nahtlose Integration in Maven und gängige Pipelines | 8: Gute Integration mit etwas mehr Konfigurationsaufwand | 9: Problemlos in bestehende Build-Prozesse integrierbar |
| Eignung für Projekt | 10: Uneingeschränkt empfohlen als Haupt-Framework | 4: Möglich, aber für dieses Projekt nicht nötig | 7: Sinnvoll, aber als Standalone-Lösung ungeeignet |
| **Gesamt** | **59 / 60** | **38 / 60** | **50 / 60** |

Fazit: Unsere Wahl fällt als etablierter Branchenstandard klar auf JUnit 5. Das Framework ermöglicht unserem erfahrenen Team sofortige und strukturierte Tests der Spiellogik ohne jegliche Einarbeitungshürden.

---

### KI-Tools

| Kriterium | ChatGPT Browser | GitHub Copilot | Tabnine |
| :--- | :--- | :--- | :--- |
| Integration | 7: Nur im Browser, kein direktes IDE-Plugin | 10: Hervorragend direkt in der IDE | 10: Hervorragend direkt in der IDE |
| Datenschutz und Internet | 4: Online-Zugriff zwingend, Code wird gesendet | 4: Online-Zugriff zwingend, Code wird gesendet | 8: Besserer Datenschutz durch teils lokales Modell |
| Einarbeitungsaufwand | 10: Sehr intuitiv dank einfacher Chat-Oberfläche | 9: Gering, arbeitet einfach im Hintergrund | 9: Gering, ähnliches Prinzip wie Copilot |
| Architektonischer Nutzen | 10: Starkes Sparring-Tool für komplexe Logik | 5: Limitiert auf reine Code-Vervollständigung | 5: Limitiert auf reine Code-Vervollständigung |
| Fehleranalyse | 10: Exzellent für Stacktraces und tiefe Fehlerbehebung | 6: Hilft primär bei lokalen Syntaxfehlern im Code | 5: Kaum Unterstützung bei komplexen Laufzeitfehlern |
| Eignung für Projekt | 10: Unverzichtbar für konzeptionelle Lösungsansätze | 6: Optional als reine Tipphilfe | 7: Optional bei starkem Fokus auf Privacy |
| **Gesamt** | **51 / 60** | **40 / 60** | **44 / 60** |

Fazit: Unsere Wahl fällt aufgrund der analytischen Tiefe und der vielfältigen Anwendung eindeutig auf ChatGPT. Wir benötigen fundierte Unterstützung für komplexe Architekturfragen, Systemdokumentation und tiefgreifende Fehleranalyse.

---



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

### Obfuscator

| Kriterium | ProGuard | yGuard | DashO |
| :--- | :--- | :--- | :--- |
| Build-Integration | 10: Hervorragende und nahtlose Integration in unser Maven Setup | 8: Solide Integration primär über Ant und Maven Plugins | 9: Sehr gut durch eigene GUI und Build-Integration |
| Funktionsumfang und Optimierung | 10: Exzellente Obfuscation kombiniert mit starkem Shrinking | 7: Beschränkt auf grundlegende Obfuscation und rudimentäres Shrinking | 10: Sehr umfangreiche Features inklusive tiefgehender Analyse |
| Konfigurationsaufwand | 8: Moderat durch gut strukturierte Konfigurationsdateien | 7: Moderat durch Konfiguration direkt über Build-Skripte | 9: Eher gering dank nützlicher Assistenten |
| Verbreitung und Standard | 10: Der unangefochtene Industrie-Standard für Java-Projekte | 6: Bekannt, aber wesentlich weniger verbreitet in der Industrie | 8: Primär in stark kommerzialisierten Großprojekten vertreten |
| Dokumentation und Community | 10: Überragende Community mit unzähligen Best Practices im Netz | 6: Solide Herstellerdokumentation bei sehr kleiner Community | 7: Gute Herstellerdokumentation liegt oft hinter Registrierungsschranken |
| Code-Sicherheit und Schutz | 9: Bietet hohe Sicherheit für unsere klassische Java-Architektur | 6: Solider Basisschutz ohne erweiterte Sicherheitsmechanismen | 10: Höchste Sicherheitsstandards für extrem kritische Software |
| Eignung für Projekt | 10: Uneingeschränkt empfohlen und exakt passend für unsere Architektur | 4: Möglich, bietet aber gegenüber ProGuard keinerlei Vorteile | 2: Kommerzieller Overkill für den geplanten Einsatzbereich |
| **Gesamt** | **67 / 70** | **44 / 70** | **55 / 70** |

Fazit: Unsere Wahl fällt aufgrund der nahtlosen Build-Integration und der hohen technischen Leistungsfähigkeit eindeutig auf ProGuard.

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
