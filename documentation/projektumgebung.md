# 8 Entwicklungsumgebung

Dieses Kapitel beschreibt die Entwicklungsumgebung und die verwendeten Werkzeuge, damit die Entwicklung nachvollziehbar durchgeführt und das Produkt reproduzierbar gebaut, getestet und ausgeliefert werden kann. Die Auslieferung erfolgt als lauffähiges Artefakt für den Offline-Betrieb im Inflight-Entertainment-System.

---

## 8.1 Voraussetzungen

Für die Entwicklung wird ein Standard-Entwicklungsrechner verwendet. Die Entwicklung ist plattformunabhängig und kann unter Windows, macOS oder Linux erfolgen.

Die Zielumgebung ist ein Inflight-Entertainment-System. Der Betrieb erfolgt offline. Alle benötigten Dateien wie Bilder werden zusammen mit dem Programm mitgeliefert.

---

## 8.2 Programmiersprache und Auslieferung

Die Implementierung erfolgt in Java. Das Produkt wird als ausführbares JAR ausgeliefert. Die im Projekt verwendete Java-Version und die Build-Konfiguration werden im Repository dokumentiert.

---

## 8.3 Versionsverwaltung und Zusammenarbeit

Die Versionierung erfolgt mit Git über ein zentrales Repository. Aufgaben werden als Issues erfasst und priorisiert. Die Planung erfolgt über Milestones. Änderungen werden in Branches umgesetzt und über Pull Requests mit Review in den stabilen Hauptzweig integriert. Die Nachvollziehbarkeit wird durch Verknüpfung von Issues, Commits und Pull Requests sichergestellt.

---

## 8.4 Modellierung und UI-Entwürfe

Für die Systemmodellierung werden UML-Diagramme erstellt und im Repository abgelegt. Die Diagramme werden für die Entwicklerdokumentation exportiert.

Für die Gestaltung der Benutzeroberfläche werden UI-Entwürfe erstellt. Relevante Entwürfe oder Verweise darauf werden im Repository dokumentiert.

---

## 8.5 Build, Tests und Dokumentation

Der Build-Prozess erzeugt das auslieferbare JAR und stellt sicher, dass benötigte Abhängigkeiten und Ressourcen enthalten sind. Die Testausführung erfolgt reproduzierbar über die im Repository festgelegte Build- und Testkonfiguration. Tests werden strukturiert im Repository abgelegt und im Entwicklungsprozess regelmäßig ausgeführt.

Die Projektdokumentation wird im Repository gepflegt und im Release als PDF bereitgestellt. Zusätzlich wird für die Codebasis eine API-Dokumentation erzeugt und im Release abgelegt.

---

## 8.6 Konventionen und Qualitätssicherung

Für die Codebasis gelten die im Repository festgehaltenen Code Conventions. Die Einhaltung wird durch Reviews sichergestellt. Bei Bedarf werden automatisierte Prüfungen für Stil und Qualität in den Entwicklungsprozess integriert.

---

## 8.7 Festlegung und Pflege der Tooling-Details

Die konkret eingesetzten Werkzeuge, Versionen und Pfade für Build, Tests, Modellierung und Dokumentationsausgabe werden im Repository in der Entwicklungsumgebungs-Dokumentation festgehalten und bei Änderungen aktualisiert.
