# 6 Dokumentation

Ziel der Dokumentation ist es, die Nutzung, Integration/Installation sowie Wartung und Weiterentwicklung der Applikation „4-Connect“ im Umfeld des Inflight-Entertainment-Systems (IFE) nachvollziehbar zu beschreiben. Die Dokumentation wird so erstellt, dass sie offline verfügbar ist und strukturiert sowie vollständig für die jeweiligen Zielgruppen aufbereitet wird.

Alle Dokumente werden als PDF im Release bereitgestellt. Die Inhalte werden im Repository zusätzlich in Markdown gepflegt. Für die Entwicklerdokumentation wird eine API-Dokumentation als HTML-Ausgabe (Javadoc) erstellt und im Release abgelegt.


---

## 6.1 Anwenderdokumentation

**Zielgruppe:** Passagiere (Endanwender).

**Inhalte:**
- Beschreibung des Spiels „4-Connect“ und Spielziel
- Start und Navigation im IFE: Hauptmenü, Spielauswahl und Moduswahl für zwei Spieler sowie gegen Computer
- Bedienung über Touch oder Maus, Ausführen eines Spielzugs sowie Hinweise und Feedback während des Spiels
- Spielende mit Gewinn oder Unentschieden und Neustart eines laufenden Spiels
- Umstellen der Sprache
- Anzeige von Hilfe und Regeln innerhalb der Anwendung
- Hinweise zur Bedienbarkeit, insbesondere Erkennbarkeit und Kontrast


**Form & Ablage:**
- PDF: PDF im Release (Dateiname und Pfad werden im Release-Verzeichnis festgelegt)

---

## 6.2 Administratorendokumentation

**Zielgruppe:** Airline-/IFE-Administratoren bzw. Integrations-/Deployment-Verantwortliche.

**Inhalte:**
- Systemvoraussetzungen der IFE-Umgebung und Betrieb ohne externe Dienste
- Installation und Deployment des JAR in der vorgesehenen IFE-Struktur sowie Start- und Rücksprungmechanismus in das IFE-Menü
- Konfiguration von Branding-Assets wie Logos, Farben und UI-Assets
- Verwaltung von Sprachressourcen und Sprachpaketen
- Update- und Release-Prozess durch Austausch des JAR und der Assets sowie Versionskennzeichnung
- Logging und Fehlerdiagnose mit Beschreibung der Ablageorte und typischer Fehlermeldungen
- Datenschutz und Sicherheit mit dem Grundsatz, dass keine personenbezogenen Daten verarbeitet, gespeichert oder extern übertragen werden
- Deinstallation und Rollback durch Rückkehr zu einer vorherigen Version

**Form & Ablage:**
- PDF: - PDF im Release (Dateiname und Pfad werden im Release-Verzeichnis festgelegt)

---

## 6.3 Entwicklerdokumentation

**Zielgruppe:** Entwicklerteam (Weiterentwicklung, Bugfixing, Erweiterung).

**Inhalte:**
- Projektüberblick und Architektur, inklusive Module, Schichten und Verantwortlichkeiten
- Build und Ausführung, inklusive Build-Tool, Build-Kommandos, Erzeugung des JAR und Ablage im Release
- Testkonzept und Testausführung, inklusive Struktur der Tests im Repository
- Erweiterbarkeit, insbesondere Integration neuer Spiele in die Menüführung, Internationalisierung über String-Ressourcen und Branding über austauschbare Assets
- Coding Standards und Konventionen mit Verweis auf die im Repository festgelegten Code Conventions
- UML-Artefakte, darunter Use-Case-Diagramm, Klassendiagramm und weitere Diagramme, inklusive Ablageort im Repository
- API-Dokumentation als Javadoc-HTML-Ausgabe

**Form & Ablage:**
- PDF im Release: `final/entwicklerdoku.pdf`
- Javadoc-HTML im Release: `final/entwicklerdoku/javadoc/`
- UML-Exporte im Release: `final/entwicklerdoku/UML/` (PDF/PNG)


---

## 6.4 Weitere referenzierte Dokumente

Die folgenden Dokumente sind Bestandteil des Repositories und werden im Release mit ausgeliefert bzw. referenziert:

- Lastenheft des Auftraggebers
- Entwicklungsumgebung und Toolfestlegung
- Firmenporträt
- Projektbegleitender Bericht und Protokolle
- UML-Modelle und Diagramme
- Build- und Deployment-Anweisungen
- Code Conventions

**Hinweis:** Die Ablagestruktur orientiert sich an der geforderten Release-/Repository-Abgabeform des Praktikums.
