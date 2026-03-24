
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

| Kriterium                    | Ant  |					Maven 	|			Gradle 	| 
|-----------------------------|--------------------------------------------|-------------------------------------------|-----------------------------------------|
| Konfigurationsaufwand |	2: Extrem hoch, die Schritte Kompilieren, Kopieren und Löschen müssen manuell definiert werden.    |		 			9: Sehr gering, mit minimalem manuellem Setup 	|			7: Moderat, die DSL benötigt mehr Einarbeitung als Mavens XML Standard	|
| Build Performance |		5: Langsam	|				7: Solide, parallele Builds oft komplex zu konfigurieren	|			10: Überragend, mit sehr effizienten Build Cache	|
| Dependency Management |	3	: Ursprünglich nicht vorhanden, kann umständlich nachgerüstet werden 		 |		9: Exellent, das Maven Repository ist der Industriestandard	|			10: Hochmodern, Unterstützt Maven und Ivy Repositories mit einer besseren Konfliktlösung  	|							
| Lesbarkeit und Wartbarkeit  |	4: XML Dateien wachsen bei größeren Projekten start und sind schwer zu Pflegen			 |		7: Gut lesbar durch strukturiertes XML, kann bei vielen Plugins leicht unübersichtlich werden	|			8: Sehr kompakt und leserlich, erfordert allerdings Verständnis der Skriptsprache	|							
| Standardisierung |		4: Kaum Standards |					10: Goldstandard, Jedes Projekt folgt der gleichen Struktur	|			9: Stark standardisiert, erlaubt allerdings einige Freiheiten	|
| Skalierbarkeit |		4: Stößt bei Multi Modul Projekten schnell an Grenzen 	 |				7: Gut für große Projekte, kann aber auch bei vielen Modulen in der Performance einbrechen	|			10: Speziell für riesige Projekte entwickelt	|
|**Gesamtpunkte** |	 		22 / 60	|				49 / 60		|		54 / 60				|

Auch wenn Gradle mit einem knappen Vorsprung Maven schlägt, fällt die interne Wahl auf Maven für dieses Projekt. Dies ist nach wievor die sicherste Wahl mit seiner Standard Struktur für unserer geplantes Projekt.


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
|Kosten/ Lizenz             |		Kostenlos unter Community Edition      |		Kostenlos, Open Source               |		Kostenlos		|
|Code Intelligence          |		10:  Branchenführende Analyse und vorausschauende Autovollständigung	                                   |					7:	Solide Assistenz, aber oft etwas weniger intuitiv als IntelliJ                             |				7: Gut durch "Language Support" Plugins, aber weniger tiefgreifend			|
|Navigation                 |			9: Sehr starke Suchfunktionen "Search Everywhere"	                                   |				7: Klassische Projeektstruktur, Suchfunktonen sind funktional 	|				8: Sehr schnell und effizent  			|
|Performance |			7: Hoher RAM Verbrauch, benötigt bei großen Projekten stärkere Hardware |					7: Bei vielen installierten Plugins steigende instabilität und Hardwareanforderungen	|				9: Sehr leichtgewichtigt und schnell startend, bei steigender Anzahl installierter Plugins, ebenfalls Performance Einbrüche			|
|Plugin Erweiterbarkeit |	8: Qualitativ und hochwertige Plugins	 |					7: Riesiges Ökosystem, Plugins allerdings oft veraltet oder nicht weitergeführt	|				10: Eine riesige Auswahl für alles mitsamt einer sehr einfachen Installation 			|
|Built in Features |		9: Standardmäßig geliefert mitsamt GUI für Git und Build Tools	 |					7: Viele Funktionen enthalten, aber oft unter Untermenüs begraben	|				4: Minimalistisch, die meisten gewünschten Funktionen müssen per Plugin nachträglich installiert werden			|
|Debuggin und Testing |	 	10: Erstklassiger Debugger und exellente JUnit Integration	 |					8: Sehr mächtiger Debugger	|				6: Grundfunktionen vorhanden, aber weniger Komfort bei komplexeren Projekten			|
|Scene Builder und JavaFX Integration | 9: Hervorragende Integration mitsamt einer einfachen Einbindung        	|			8: Gute Unterstützung und Anbindung. 	|				4: Erfordert viel manuelle KOnfiguration, sowie kein visueller Editor			|	 
| **Gesamtpunkte** |	 		62 / 70	|					51/ 70	|				48 / 70			|

Da es sich hierbei um ein projekt überschaulicher Größe handelt, mitsamt einem enggenähtem Zeitablauf, steht es den einzelnen Entwicklern frei zur Auswahl welche IDE diese verwenden. Ein forcierter Wechsel, und der somit eingehenden Eingewöhnung in neue Entwicklungstools würde zu einer Verzögerung im Zeitplan führen. 


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

