# 8 Entwicklungsumgebung

Dieses Kapitel beschreibt die Entwicklungsumgebung und die eingesetzten Werkzeuge, sodass Entwicklung, Build und Übergabe der Applikation „4-Connect“ nachvollziehbar und reproduzierbar erfolgen können. Die Auslieferung erfolgt als lauffähiges Artefakt für den Offline-Betrieb im Inflight-Entertainment-System (IFE).

---

## 8.1 Zielumgebung (IFE) und Rahmenbedingungen
Die Anwendung wird innerhalb des bestehenden IFE betrieben. Der Betrieb erfolgt vollständig offline; externe Dienste und Netzwerkanbindungen werden nicht vorausgesetzt.

Die Anwendung läuft in der vom IFE vorgegebenen Java 21-LTS Runtime.
---

## 8.2 Entwicklungsumgebung

Die Entwicklung erfolgt auf den Entwicklungsrechnern des Projektteams. Für die Implementierung werden folgende IDEs verwendet:

- Eclipse IDE for Enterprise Java and Web Developers (2025-09)
- IntelliJ IDEA (2025.2.6.x)

Für UI/UX und grafische Artefakte kommen zusätzlich spezialisierte Werkzeuge zum Einsatz (siehe Abschnitt 8.3).

Zur Qualitätssicherung wird die Anwendung zusätzlich auf der Zielumgebung bzw. dem bereitgestellten Dev-Kit geprüft.

---

## 8.3 Tooling- und Versionsübersicht

Die folgenden Werkzeuge werden im Projekt eingesetzt. 

### 8.3.1 Implementierung und Laufzeit

| Bereich | Werkzeug | Version / Stand |
|--------|----------|-----------------|
| Programmiersprache / JDK | Java (JDK) | Java 21 (LTS) 21.0.x |
| Ziel-Runtime (IFE) | Java Runtime | Java 21 LTS |
| UI-Framework | JavaFX | 21.0.2 |
| UI-Designer | SceneBuilder | 21.0.0 |
| IDE | Eclipse IDE for Enterprise Java and Web Developers | 2025-09 |
| IDE | IntelliJ IDEA | 2025.2.6.x |

### 8.3.2 Versionsverwaltung und Kollaboration

| Bereich | Werkzeug | Version / Stand |
|--------|----------|-----------------|
| Versionsverwaltung | Git | Git (lokal) |
| Hosting/Collaboration | GitHub | Repository auf GitHub |
| Kommunikation | Discord + persönliche Meetings | projektintern |

### 8.3.3 Diagramme, Modellierung und Doku-Tools

| Bereich | Werkzeug | Version / Stand |
|--------|----------|-----------------|
| Editor (Diagramme/Docs) | Visual Studio Code | 1.108.1|
| Diagramme (PlantUML) | PlantUML Extension (VS Code) | 2.18.1|
| Modellierung/UML | Software Ideas Modeler | 15 |
| Code-Konvention | Oracle Java Code Conventions | Vorgabe |

### 8.3.4 UI/UX, Prototyping und Layout 

| Bereich | Werkzeug | Version / Stand |
|--------|----------|-----------------|
| UI-Grafiken & Icons | Adobe Illustrator (Creative Cloud) | Illustrator 30 |
| Wireframes & Prototypen | Adobe XD (Creative Cloud) | XD 58 |
| Dokumentation/Layout Abgabe | Adobe InDesign (Creative Cloud) | InDesign 21.1 |

### 8.3.5 Build/Obfuscation

| Bereich | Werkzeug | Version / Stand |
|--------|----------|-----------------|
| Build-Tool | Maven | 3.9.12 |
| Obfuscation | ProGuard | 7.8.2 |

---


## 8.4 Modellierung, Diagramme und Ablageorte

Alle Diagramm-Artefakte werden versioniert im Repository abgelegt unter:

- `documentation/diagrams/`

### 8.4.1 Export-Dateien (SVG)

Beispiele für vorhandene Exporte:

- `documentation/diagrams/4C_transparent.svg`
- `documentation/diagrams/FourConnect_Nr2.svg`
- `documentation/diagrams/FourConnect_Nr3.svg`
- `documentation/diagrams/FourConnect_Nr3.2.svg`
- `documentation/diagrams/FourConnect_Nr3.3.svg`
- `documentation/diagrams/FourConnect_Nr3.4.svg`
- `documentation/diagrams/FourConnect_Nr3.5.svg`
- `documentation/diagrams/FourConnect_Nr3.6.svg`

### 8.4.2 Quelldateien

- Modell-/UML-Quelldatei: `documentation/diagrams/PL.mdj` bearbeitet mit Software Ideas Modeler 15
- Textbasierte Diagramme: PlantUML-Quellen werden im Repository versioniert und über VS Code (1.108.1) mit PlantUML Extension (2.18.1) gepflegt. Exporte erfolgen als SVG.

---

## 8.5 Build, Tests und Dokumentation

### 8.5.1 Build / Auslieferung
Die Auslieferung erfolgt als ausführbares JAR für den Offline-Betrieb. Ein verbindliches Build-Tool Maven wird im nächsten Meilenstein eingeführt; die zugehörigen Build-Kommandos und der Artefaktpfad werden dann in diesem Kapitel ergänzt.
### 8.5.2 Tests
Die Qualitätssicherung erfolgt begleitend während der Entwicklung durch:
- Reviews der Änderungen über Pull Requests,
- manuelle, dokumentierte Tests der zentralen Anwendungsfälle,
- Tests auf der Zielumgebung bzw. dem Dev-Kit zur Prüfung von Start/Beenden, Eingaben und Offline-Betrieb.
### 8.5.3 Projektdokumentation
Die Projektdokumentation wird im Repository gepflegt. Zusätzlich kann eine API-Dokumentation als Javadoc erzeugt werden (Tool `javadoc` aus JDK 21).



---

## 8.6 Konventionen und Qualitätssicherung

Für die Codebasis gelten die Oracle Java Code Conventions als Stilrichtlinie. Die Einhaltung wird durch Reviews unterstützt. Änderungen werden nachvollziehbar über GitHub mit Commits, Pull Requests und Issues geführt.
