# 6 Dokumentation

Ziel der Dokumentation ist es, die Nutzung, Integration/Installation sowie Wartung und Weiterentwicklung der Applikation „4-Connect“ im Umfeld des Inflight-Entertainment-Systems (IFE) nachvollziehbar zu beschreiben. Die Dokumentation wird so erstellt, dass sie offline verfügbar ist und strukturiert sowie vollständig für die jeweiligen Zielgruppen aufbereitet ist.

Die Dokumentationsartefakte werden in folgenden Formaten bereitgestellt:
- Inhaltliche Dokumente: PDF
- README: Markdown
- API-Dokumentation: HTML (Javadoc)
- Diagramme / UML-Exporte: PDF und/oder SVG


---

## 6.1 Anwenderdokumentation

Eine separate Anwenderdokumentation für Passagiere wird nicht erstellt, da die Bedienung sowie Spielregeln und Abläufe vollständig innerhalb der Anwendung vermittelt werden.

Stattdessen wird für die Demo eine kurze README bereitgestellt, die ausschließlich den Start und die Inbetriebnahme der Anwendung beschreibt.

**Zielgruppe:** Abnahme-/Testpersonal (AG) sowie Projektbeteiligte für den Demo-Betrieb  

**Form:** README als Markdown

## 6.2 Administratorendokumentation

**Zielgruppe:** Airline-/IFE-Administratoren bzw. Integrations-/Deployment-Verantwortliche.

**Inhalte:**
- Systemvoraussetzungen / Offline-Betrieb:Es wird lediglich eine lokale Java-Runtime benötigt; es werden keine externen Dienste vorausgesetzt.
- Installation / Deployment: Die Auslieferung erfolgt als JAR-Datei die in der vorgesehenen IFE-Ordnerstruktur abgelegt wird; der Start erfolgt über den vorgesehenen IFE-Startmechanismus.
- Rücksprung zum IFE-Menü: Der Rücksprung erfolgt über eine in der Anwendung bereitgestellte Navigation (z. B. „Zurück“-Button), die zurück in das übergeordnete IFE-Menü führt.
- Update / Release: Ein Update erfolgt durch Austausch der JAR-Datei; die Version ist im Dateinamen und/oder in der Anwendung ersichtlich.
- Fehlerausgabe : Laufzeitfehler werden als Meldung ausgegeben (z. B. Konsole/Standardausgabe); ein separates Logging-/Monitoring-System ist nicht vorgesehen.
- Datenschutz / Sicherheit: Es werden keine personenbezogenen Daten verarbeitet, gespeichert oder extern übertragen.

**Form**
- PDF

---

## 6.3 Entwicklerdokumentation

**Zielgruppe:** Entwicklerteam (Weiterentwicklung, Bugfixing, Erweiterung).

**Inhalte:**
- Projektüberblick und Architektur, inklusive Module, Schichten und Verantwortlichkeiten
- Build und Ausführung, inklusive Build-Tool, Build-Kommandos, Erzeugung des JAR
- Teststrategie und Testausführung: dokumentierte manuelle Tests
- Erweiterbarkeit, insbesondere Integration neuer Spiele in die Menüführung, Internationalisierung über String-Ressourcen und Branding über austauschbare Assets
- Coding Standards und Konventionen mit Verweis auf die im Repository festgelegten Code Conventions
- UML-Artefakte, darunter Use-Case-Diagramm, Klassendiagramm und weitere Diagramme,
- API-Dokumentation als Javadoc-HTML-Ausgabe

**Form**
- PDF
- HTML (Javadoc)
- PDF/SVG (UML-Exporte)

---

## 6.4 Weitere referenzierte Dokumente

Die folgenden Dokumente sind Bestandteil des Repositories und werden im Release mit ausgeliefert bzw. referenziert:

- Lastenheft des AG
- Entwicklungsumgebung und Toolfestlegung
- Firmenporträt AG
- Firmenporträt AN
- projektbegleitender Bericht und Protokolle
- UML-Modelle und Diagramme
- Build- und Deploymentanweisungen
- Code Conventions
