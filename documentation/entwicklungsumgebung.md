
## Versionierung 

| Kriterium                 | Git                                      | Subversion (SVN)                          |  Mercurial (hg)                         |
|---------------------------|------------------------------------------|-----------------------------------------|-------------------------------------------|
| Kosten           | kostenlos, Open Source                   | kostenlos, Open Source                  | kostenlos, Open Source                    |
|Benutzerfreundlichkeit (x0.75) | 6: Viele Befehle und komplexe Konzepte machen den Einstieg schwierig | 8: Einfaches, zentrales System, leicht verständlich für Anfänger | 7: Ähnlich wie Git, aber mit klarerer und einfacherer Bedienung |
| Performance und Architektur (x1.75) | 9: Sehr schnell, da lokal bzw. dezentral gearbeitet wird, und damit auch sehr robust | 6: Langsamer, da viele Aktionen über den Server laufen, von dem man Abhängig ist | 8: Ebenfalls schnell durch dezentrale und unabhängige Struktur |
| Verbreitung (x1.0) | 10: Globaler Standard, riesige Community und viele Ressourcen | 7: Noch verbreitet, aber zunehmend durch Git ersetzt | 5: Deutlich kleinere Community und weniger verbreitet als Git oder SVN |
| Branching und Merging (x1.5) | 10: Sehr leistungsfähig und flexibel bei Branches und Merges | 5: Branching möglich, aber umständlich und fehleranfälliger | 8: Gute Unterstützung, aber etwas weniger flexibel als Git |
| Lernkurve (x0.5) | 5: Steile Lernkurve, viele Konzepte müssen verstanden werden, für Einsteiger sehr unübersichtlich/komplex | 8: Schnell erlernbar durch einfache Struktur | 7: Leichter als Git, aber trotzdem gewisse Komplexität |
| Tools und Integration (x1.25) | 10: Sehr viele Tools, IDE-Integrationen und Plattformen (z. B. GitHub) | 7: Gute Integration, aber weniger modern und umfangreich | 6: Aufgrund geringer Verbreitung weniger Tools und Integrationen verfügbar |
| **Gesamt** | **60.3 / 67.5 = 89.3%** | **43.8 / 67.5 = 64.8%** | **47.3 / 67.5 = 70%** |

**Fazit:** Unsere Wahl fällt aufgrund der technischen Leistungsfähigkeit auf Git. Unter anderem da das Team mit Git bereits eingearbeitet ist, und somit die Einstiegshürden für uns keine Rolle mehr spielen.

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

| Kriterium                    | Ant  |             Maven  |        Gradle     |
|-----------------------------|--------------------------------------------|-------------------------------------------|-----------------------------------------|
| Konfigurationsaufwand (x1.75) |   2: Extrem hoch, die Schritte Kompilieren, Kopieren und Löschen müssen manuell definiert werden.    |               9: Sehr gering, mit minimalem manuellem Setup  |        7: Moderat, die DSL benötigt mehr Einarbeitung als Mavens XML Standard |
| Build Performance (x1.5) |      5: Langsam |           7: Solide, parallele Builds oft komplex zu konfigurieren   |        10: Überragend, mit sehr effizientem Build Cache   |
| Dependency Management (x1.25) |   3: Ursprünglich nicht vorhanden, kann umständlich nachgerüstet werden       |    9: Exzellent, das Maven-Repository ist der Industriestandard   |        10: Hochmodern, unterstützt Maven und Ivy Repositories mit einer besseren Konfliktlösung   |
| Lesbarkeit und Wartbarkeit (x1.5)  | 4: XML-Dateien wachsen bei größeren Projekten stark und sind schwer zu pflegen        |    7: Gut lesbar durch strukturiertes XML, kann bei vielen Plugins leicht unübersichtlich werden  |        8: Sehr kompakt und leserlich, erfordert allerdings Verständnis der Skriptsprache  |
| Standardisierung (x1.0) |       4: Kaum Standards |                10: Goldstandard,  jedes Projekt folgt der gleichen Struktur    |        9: Stark standardisiert, erlaubt allerdings einige Freiheiten  |
| Skalierbarkeit (x0.75) |     4: Stößt bei Multi-Modul Projekten schnell an Grenzen   |          7: Gut für große Projekte, kann aber auch bei vielen Modulen in der Performance einbrechen |        10: Speziell für riesige Projekte entwickelt   |
|**Gesamt** |         **27.75 / 77.5 = 35.8%**    |           **63.25 / 77.5 = 81.6%**       |    **68.25 / 77.5 = 88.1%**             |

**Fazit:** Auch wenn Gradle mit einem knappen Vorsprung Maven schlägt, fällt die interne Wahl für dieses Projekt auf Maven. Dies ist nach wie vor die sicherste Wahl mit seiner Standardstruktur für unser geplantes Projekt.


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
|Kosten / Lizenz             |     Kostenlos unter Community Edition      |      Kostenlos, Open Source               |    Kostenlos     |
|Code Intelligence (x2.0)          |      10: Branchenführende Analyse und vorausschauende Autovervollständigung                                       |               7: Solide Assistenz, aber oft etwas weniger intuitiv als IntelliJ                             |            7: Gut durch "Language Support" Plugins, aber weniger tiefgreifend       |
|Navigation (x1.25)                 |         9: Sehr starke Suchfunktionen "Search Everywhere"                                     |            7: Klassische Projektstruktur, Suchfunktonen sind funktional   |           8: Sehr schnell und effizient         |
|Performance (x1.5) |        7: Hoher RAM Verbrauch, benötigt bei großen Projekten stärkere Hardware |              7: Bei vielen installierten Plugins steigende Instabilität und Hardwareanforderungen   |           9: Sehr leichtgewichtig und schnell startend, bei steigender Anzahl installierter Plugins ebenfalls Performance Einbrüche         |
|Plugin-Erweiterbarkeit (x1.25) |   8: Qualitativ und hochwertige Plugins   |             7: Riesiges Ökosystem, Plugins allerdings oft veraltet oder nicht weitergeführt    |           10: Eine riesige Auswahl für alles mitsamt einer sehr einfachen Installation         |
|Built-in Features (x1.5) |       9: Standardmäßig geliefert mitsamt GUI für Git und Build Tools  |             7: Viele Funktionen enthalten, aber oft in Untermenüs begraben |           4: Minimalistisch, die meisten gewünschten Funktionen müssen per Plugin nachträglich installiert werden          |
| Debugging und Testing (x1.75) |    10: Erstklassiger Debugger und exzellente JUnit-Integration  |             8: Sehr mächtiger Debugger |           6: Grundfunktionen vorhanden, aber weniger Komfort bei komplexeren Projekten         |
|Scene Builder und JavaFX-Integration (x1.25) | 9: Hervorragende Integration mitsamt einer einfachen Einbindung         |        8: Gute Unterstützung und Anbindung    |           4: Erfordert viel manuelle Konfiguration, sowie keinen visuellen Editor        |
| **Gesamt** |        **94 / 105 = 89.5%**    |              **76.5 / 105 = 72.9%**    |           **71.7 / 105 = 68.3%**          |

**Fazit:** Da es sich hierbei um ein Projekt überschaubarer Größe handelt, mitsamt einem eng genähten Zeitablauf, steht es den einzelnen Entwicklern frei, welche IDE sie verwenden. Ein forcierter Wechsel, und die somit einhergehende Eingewöhnung in neue Entwicklungstools würden zu einer Verzögerung im Zeitplan führen.



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
| Lesbarkeit (x1.25) | 9: Sehr klare und moderne Struktur für gut lesbaren Code | 8: Verständlich, aber teilweise veraltet | 9: Einheitliche Formatierung sorgt für sehr gute Lesbarkeit |
| Detailgrad (x1.5) | 9: Sehr detailliert und umfassend | 6: Eher grundlegende Regeln | 7: Fokus eher auf Formatierung als auf komplette Richtlinien |
| Verständlichkeit/Einstieg (x1.0) | 7: Viele Regeln, aber relativ gut dokumentiert | 9: Einfach und leicht verständlich, viele Code-Beispiele | 8: Einfach nutzbar durch automatische Formatierung |
| Verbreitung (x0.75) | 9: Sehr verbreitet in der Praxis | 7: Früher Standard, heute weniger genutzt | 8: Stark verbreitet im Spring-Ökosystem |
| Tool-Unterstützung (x1.25) | 9: Gute Integration in viele Tools | 6: Weniger direkte Tool-Unterstützung | 10: Stark auf automatische Formatierung ausgelegt |
| Flexibilität (x1.0) | 6: Relativ strikt | 7: Mehr Spielraum | 5: Sehr strikt durch festen Formatter |
| Konsistenz im Code (x1.5) | 10: Sehr einheitlicher Code | 7: Abhängig vom Team da nur grundlegendere Regeln | 10: Konsistenz wird automatisch erzwungen |
| **Gesamt** | **70.8 / 82.5 = 85.8%** | **58.3 / 82.5 = 70.1%** | **68.3 / 82.5 = 82.7%** |

**Fazit:** Aufgrund dessen, dass wir eine Basis für ein modular erweiterbares Programm erstellen, haben wir uns für den Google Java Style Guide entschieden. Dieser ist modern, weitverbreitet und erzeugt aufgrund strikterer Regeln sehr einheitlichen Code.

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


