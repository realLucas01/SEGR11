
## Versionierung 

| Kriterium                 | Git                                      | Subversion (SVN)                          |  Mercurial (hg)                         |
|---------------------------|------------------------------------------|-----------------------------------------|-------------------------------------------|
| Kosten           | kostenlos, Open Source                   | kostenlos, Open Source                  | kostenlos, Open Source                    |
|Benutzerfreundlichkeit | 6: Viele Befehle und komplexe Konzepte machen den Einstieg schwierig | 8: Einfaches, zentrales System, leicht verständlich für Anfänger | 7: Ähnlich wie Git, aber mit klarerer und einfacherer Bedienung |
| Performance und Architektur | 9: Sehr schnell, da lokal bzw. dezentral gearbeitet wird, und damit auch sehr robust | 6: Langsamer, da viele Aktionen über den Server laufen, von dem man Abhängig ist | 8: Ebenfalls schnell durch dezentrale und unabhängige Struktur |
| Verbreitung | 10: Globaler Standard, riesige Community und viele Ressourcen | 7: Noch verbreitet, aber zunehmend durch Git ersetzt | 5: Deutlich kleinere Community und weniger verbreitet als Git oder SVN |
| Branching und Merging | 10: Sehr leistungsfähig und flexibel bei Branches und Merges | 5: Branching möglich, aber umständlich und fehleranfälliger | 8: Gute Unterstützung, aber etwas weniger flexibel als Git |
| Lernkurve | 5: Steile Lernkurve, viele Konzepte müssen verstanden werden, für Einsteiger sehr unübersichtlich/komplex | 8: Schnell erlernbar durch einfache Struktur | 7: Leichter als Git, aber trotzdem gewisse Komplexität |
| Tools und Integration | 10: Sehr viele Tools, IDE-Integrationen und Plattformen (z. B. GitHub) | 7: Gute Integration, aber weniger modern und umfangreich | 6: Aufgrund geringer Verbreitung weniger Tools und Integrationen verfügbar |
| Gesamt | 50/60 | 41/60 | 41/60 |

**Fazit:** Unsere Wahl fällt aufgrund der technischen Leistungsfähigkeit auf Git. Unter anderem weil das Team mit Git auch bereits eingearbeitet ist, und uns somit die Einstiegshürden nicht weiter interessieren.

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
| Kriterium                 | Google Java Style Guide                    | Oracle Java Code Conventions                | Spring Java Format                                  |
|---------------------------|--------------------------------------------|---------------------------------------------|---------------------------------------------|
| Kosten | kostenlos, öffentlich zugänglich | kostenlos, öffentlich zugänglich | kostenlos, öffentlich zugänglich |
| Lesbarkeit | 9: Sehr klare und moderne Struktur für gut lesbaren Code | 8: Verständlich, aber teilweise veraltet | 9: Einheitliche Formatierung sorgt für sehr gute Lesbarkeit |
| Detailgrad | 9: Sehr detailliert und umfassend | 6: Eher grundlegende Regeln | 7: Fokus eher auf Formatierung als auf komplette Richtlinien |
| Verständlichkeit/Einstieg | 7: Viele Regeln, aber relativ gut dokumentiert | 9: Einfach und leicht verständlich, viele Code-Beispiele | 8: Einfach nutzbar durch automatische Formatierung |
| Verbreitung | 9: Sehr verbreitet in der Praxis | 7: Früher Standard, heute weniger genutzt | 8: Stark verbreitet im Spring-Ökosystem |
| Tool-Unterstützung | 9: Gute Integration in viele Tools | 6: Weniger direkte Tool-Unterstützung | 10: Stark auf automatische Formatierung ausgelegt |
| Flexibilität | 6: Relativ strikt | 7: Mehr Spielraum | 5: Sehr strikt durch festen Formatter |
| Konsistenz im Code | 10: Sehr einheitlicher Code | 7: Abhängig vom Team da nur grundlegendere Regeln | 10: Konsistenz wird automatisch erzwungen |
| Gesamt | 59/70 | 50/70 | 57/70 |

**Fazit:** Aufgrund dessen das wir eine Basis für ein modular erweiterbares Programm erstellen haben wir uns für den Google Java Style Guide entschieden. Dieser ist modern, weitverbreitet und erzeugt aufgrund strikterer Regeln sehr einheitlichen Code.

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

