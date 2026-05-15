# Gervithrall - Entertainment-Erweiterung für IFE-Systeme

## Projektübersicht

„4-Connect“ ist eine offlinefähige Entertainment-Erweiterung für bestehende Inflight-Entertainment-Systeme (IFE).  
Das Projekt wird im Auftrag der Novaris Cabin Systems GmbH durch die Gervithrall Systems GmbH(Entwicklungsgruppe 11) entwickelt.  

Ziel des Projekts ist die Konzeption und prototypische Umsetzung eines leicht verständlichen und intuitiv bedienbaren Spiels für Passagiere während des Fluges. Als erste Umsetzung dient eine digitale Variante des klassischen Spiels „Vier Gewinnt“ unter dem Projektnamen 4-Connect.

Neben einem lokalen Mehrspielermodus unterstützt die Anwendung ebenfalls einen Einzelspielermodus gegen einen Botgegner.

## Für die Entwicklung werden folgende Technologien und Werkzeuge eingesetzt:

- Java 21 LTS
- JavaFX
- Maven
- Git / GitHub
- PlantUML
- Adobe XD / Illustrator
- ProGuard

Die Anwendung wird als ausführbares JAR-Paket bereitgestellt und ist für den Offline-Betrieb innerhalb einer Java-21-LTS-Laufzeitumgebung vorgesehen.  
Weiter Informationen zur Entwicklung, Tools und dem Projektaufbau ist hier zu finden: [Dev Doku](/final/entwicklerdoku.pdf)  
<sup> *(alternativ auch hier zu finden: `/final/entwicklerdoku.pdf`)* </sub>

## JavaDoc, Test-Report und Pages
Der aktuelle Stand der JavaDoc und des Test-Coverage Report auf dem main branch, werden nach jedem Commit auf einen eigenen Branch *`(JavaDoc-and-TestCoverage)`* gepusht, und dann auf jeweils eigene Github Pages deployed.  
So kann man diese Dokumente einfacher öffnen und nutzen, ohne das man die Dokuemente manuell erzeugen muss, und dann bei einem Commit innerhalb der hunderten Dateien die Übersicht verliert. Ebenfalls muss bei einem Release so nicht mehr eine extrem unübersichtliche PR stattfinden, sondern man kann den Branch ohne Bedenken einfach auf main Mergen und hat den aktuellsten Stand.

**JavaDoc Page:** https://reallucas01.github.io/SEGR11/javadoc  
**Test-Report Page:** https://reallucas01.github.io/SEGR11/coverage

## Automatische überprüfung auf unseren Code Standart

Es wird nun in jeder PR die eine Änderung im Ordner **`java_projekt`** beeinhaltet, automatisch über eine Github Action überprüft ob der Goolge Java Style Guide korrekt eingehalten wurde. Den Fortschritt kann man dabei ganz unten im Repo sehen.  
Sobald der Check abgeschlossen ist, und Fehler gefunden wurden, werden diese ein paar Sekunden nach Abschluss als Alert direkt in der PR angezeigt:  
<img width="865" height="297" alt="image" src="https://github.com/user-attachments/assets/9bd6e582-436e-4a37-b722-02787620d3eb" />

Die Analyse erfolgt über [Checkstyle](https://github.com/checkstyle/checkstyle) und [ReviewDog](https://github.com/reviewdog).

## Wichtigste Befehle

Start des Programms aus der Konsole:
```
java -jar IFE_Entertainment-[Versionsnummer]-obfuscated.jar
```

Das Programm ist mit einem automatischen Buildscript ausgestattet, das automatisch alte Builds löscht und die .jar, so wie alle 
dazugehörigen Dokumente (JavaDoc und Test-Coverage Report) generiert. Die genauere Funktionsweise dieses Scriptes  erklärt.  
Es wird mit folgendem Befehl eingesetzt:  
```
mvn clean site install
```

Nur die Tests ausführen:
```
mvn test
```

Starten des Programmes aus dem Quellcode:
```
mvn clean javafx:run
```

## Ordnerstruktur

```
├── dokumente/                           - Alle Dokumente zum Projekt in .md
│   ├── diagramme/                       - Speicherort für Diagramme zum Einbinden in die Markdowns
│   └── img/                             - Speicherort für Bilder zum Einbinden in die Markdowns
├── final/                               - Ort aller Wichtige Dokumente zum Programm als .pdf
│   ├── Coverage/                        - Testbericht von JaCoCo
│   └── JavaDoc/                         - JavaDoc des aktuellen Standes
├── java_projekt/                        - Projekt Ordner des Java-Maven Projektes
├── prototyp/                            - Bilder des UI-Prototypen
├── uml_projekt/                      -  - Projektdateien für die PlantUML Diagramme
└── README.md                            - ReadMe Datei des Repositories
```
