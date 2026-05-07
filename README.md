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
