# 6 Dokumentation

Ziel der Dokumentation ist es, **Nutzung**, **Integration/Installation** sowie **Wartung/Weiterentwicklung** der Applikation „4-Connect“ im Umfeld des Inflight-Entertainment-Systems (IFE) nachvollziehbar zu beschreiben. Die Dokumentation wird so erstellt, dass sie **offline verfügbar**, **leicht verständlich** und für die jeweiligen Zielgruppen (Passagier/Anwender, Airline/Integration, Entwicklerteam) geeignet ist.

Alle Dokumente werden als **PDF** im Release bereitgestellt und zusätzlich **teilweise** im Repository als **Markdown** versioniert. Die Entwicklerdokumentation enthält **optional** HTML-Ausgaben (z. B. **Javadoc**).

---

## 6.1 Anwenderdokumentation

**Zielgruppe:** Passagiere (Endanwender).

**Inhalte (Mindestumfang):**
- Kurze Beschreibung des Spiels „4-Connect“ und Ziel des Spiels
- Start/Navigation im IFE: Hauptmenü → Spielauswahl → Moduswahl (**Zwei Spieler** / **Gegen Computer**)
- Bedienung (Touch/Maus), Spielzug ausführen, Hinweise/Feedback
- Spielende: Gewinn/Unentschieden, Neustart eines laufenden Spiels
- Sprache umstellen (Mehrsprachigkeit)
- Hilfe/Regelanzeige (entspricht der In-App-Regelansicht)
- Barrierearme Bedienhinweise (z. B. Kontrast/Erkennbarkeit)

**Form & Ablage:**
- PDF: `TODO (finaler Dateiname/Pfad im Release)`

---

## 6.2 Administratorendokumentation

**Zielgruppe:** Airline-/IFE-Administratoren bzw. Integrations-/Deployment-Verantwortliche.

**Inhalte (Mindestumfang):**
- Systemvoraussetzungen (IFE-Umgebung, Offline-Betrieb; keine externen Dienste)
- Installation/Deployment des JAR in der vorgesehenen IFE-Struktur (inkl. Start-/Rücksprungmechanismus ins IFE-Menü)
- Konfiguration:
  - Einbindung/Wechsel von **Branding-Assets** (Logos/Farben/UI-Assets)
  - Sprachpakete / Ressourcen
- Update/Release-Prozess (Austausch der JAR + Assets, Versionskennzeichnung)
- Logging/Fehlerdiagnose (wo Logs liegen / wie Fehlermeldungen aussehen)
- Datenschutz/Sicherheit: keine personenbezogenen Daten, keine Persistenz, keine externe Kommunikation
- Deinstallation/Rollback (Rückkehr zu vorheriger Version)

**Form & Ablage:**
- PDF: `TODO (finaler Dateiname/Pfad im Release)`

---

## 6.3 Entwicklerdokumentation

**Zielgruppe:** Entwicklerteam (Weiterentwicklung, Bugfixing, Erweiterung).

**Inhalte (Mindestumfang):**
- Projektüberblick & Architektur
- Build & Run (Build-Tool, Kommandos, JAR-Erzeugung/Release)
- Tests (Teststrategie, Ausführung, Teststruktur)
- Erweiterbarkeit (neue Spiele, i18n, Branding)
- Coding Standards (Verweis auf Code Conventions)
- UML-Artefakte + Ablageort
- API-Doku/Kommentierung (z. B. Javadoc)

> **TEAM-NOTE:** Bitte echte Tools/Pfade bescheid geben, sobald final:
> - Build: (Maven/Gradle) + Kommandos + Datei (`pom.xml`/`build.gradle`)
> - Tests: (JUnit 5?) + Pfad (`src/test/java`)
> - UML: Tool + Pfad (Quellen/Exports)
> - API-Doku: (Javadoc?) + Output-Pfad

**Form & Ablage:**
- PDF: `final/entwicklerdoku.pdf` *(Release)*
- (optional) API-Doku: `final/entwicklerdoku/javadoc/`
- (optional) UML-Exports: `final/entwicklerdoku/UML/`

---

## 6.4 Weitere referenzierte Dokumente

Die folgenden Dokumente sind Bestandteil des Repositories und werden im Release mit ausgeliefert bzw. referenziert:

- Lastenheft des Auftraggebers (Anforderungen & Rahmenbedingungen)
- Tool-/Entwicklungsumgebungsfestlegung (Versionierung, UML-Tool, Build-Tool, Tests, Dokumentation, Coding Style etc.)
- Firmenporträt (Kontext Auftraggeber)
- Projektbegleitender Bericht / Protokolle (Fortschritt, Entscheidungen, Nachweise)
- UML-Modelle/Diagramme (Quellen + Exporte)
- Build-/Deployment-Anweisungen (z. B. README/BUILD.md)
- Code Conventions (Styleguide + ggf. Checkstyle-Konfiguration, falls genutzt)

**Hinweis:** Die Ablagestruktur orientiert sich an der geforderten Release-/Repository-Abgabeform des Praktikums.
