# 7 Vorgehen

Dieses Kapitel beschreibt das Vorgehen zur Umsetzung der Entertainment-Erweiterung „4-Connect“ für das Inflight-Entertainment-System.
Der geplante Projektzeitraum beträgt 16 Wochen.
Das Vorgehen ist so gewählt, dass frühzeitig lauffähige Zwischenstände entstehen und Risiken früh erkannt werden.

---

## 7.1 Vorgehensmodell

Die Entwicklung erfolgt **iterativ und inkrementell**. Anforderungen, Anpassungen und Fehler werden als Aufgaben erfasst, priorisiert und in überschaubaren Teilschritten umgesetzt. Jede Iteration umfasst dabei typischerweise:

- **Planung** (Aufgabenabgrenzung, Priorisierung, Definition „fertig“)
- **Implementierung** (Umsetzung in Feature-Branches)
- **Review** (z. B. über Merge-/Pull-Requests)
- **Test** (insbesondere auf der Zielumgebung/Dev-Kit)
- **Dokumentationspflege** (fortlaufend, nicht ausschließlich am Projektende)

Dieses Vorgehen ermöglicht es, Änderungen kontrolliert einzuarbeiten und die Anwendung früh im vorgesehenen IFE-Kontext zu validieren.

---

## 7.2 Arbeitspakete und Ablauf
Die Umsetzung wird in Arbeitspakete gegliedert, die sich an der Kalkulation und den Anforderungen orientieren. Die folgenden Pakete dienen als Struktur für Planung und Umsetzung:

- **Konzeption**
  - Finalisierung Spielidee und Regeln
  - Berücksichtigung IFE-Rahmenbedingungen (Offline-Betrieb, Eingabe über Touch/Maus)
  - Definition der Spielmodi (PvP / PvE) und grundlegendes Bedienkonzept

- **Prototyp & Spielkern**
  - Technisches Grundgerüst und Projektstruktur
  - Trennung von Spiellogik und UI (nachvollziehbare Zuständigkeiten)
  - Grundlegende UI-Struktur sowie Eingabe-/Zustandsverwaltung

- **Gameplay-Implementierung**
  - Regelkonforme Verarbeitung von Spielzügen
  - Gewinn-/Unentschieden-Erkennung
  - Rundenverwaltung (z. B. Neustart, Abbruch, Rückkehr zur Spielesammlung)

- **Botgegner und optionale Erweiterungen**
  - Implementierung einer Bot-Grundlogik für den Einzelspielermodus
  - **Schwierigkeitsstufen** werden als optionale Erweiterung betrachtet (falls im Rahmen sinnvoll umsetzbar)

- **UI/UX Nutzerführung**
  - Start- und Modusauswahl
  - In-Game UI (Spielbrett, Bedienelemente)
  - Ergebnisdarstellung (Endscreen)


- **Stabilisierung & Integration**
  - Prüfung von Performance und Stabilität auf der Zielumgebung
  - Robustheit bei wiederholter/fehlerhafter Eingabe
  - Packaging als JAR-Datei und Einbindung in die vorgesehene IFE-Start-/Beendenavigation
  - Fehlerbehandlung im Sinne einer stabilen Laufzeit

- **Testphase, Feinschliff & Dokumentation**
  - Funktionstests, Regressionstests und Fehlerkorrekturen (Bugfixes erfolgen fortlaufend)
  - Finalisierung der Dokumentationsartefakte (Admin-/Dev-Doku, ggf. UML, Javadoc)

---

## 7.3 Meilensteine und Zeitplan

Die folgenden Meilensteine beschreiben den geplanten Ablauf über 16 Wochen. Zeiträume sind als Orientierung zu verstehen; Verschiebungen durch technische Randbedingungen oder notwendige Stabilisierung sind möglich.

### M0.5 Projektstart und Setup (Woche 1)
- Repository-/Build-Grundlage und Arbeitsorganisation
- Erste technische Validierung auf der Zielumgebung/Dev-Kit
- Initiale Aufgabenstruktur (Backlog)

**Ergebnis:** lauffähiges Grundgerüst und initiale Planung.

### M1 Konzeption abgeschlossen (Woche 2–3)
- Spielregeln, Screenflow und Bedienkonzept abgestimmt
- Definition der Modus- und Zustandslogik

**Ergebnis:** belastbare Grundlage für Umsetzung und UI-Struktur.

### M2 Spielkern spielbar (Woche 4–7)
- Grundlegender Spielablauf (Zuglogik, Sieg/Unentschieden)
- UI-Grundlayout inkl. Eingabe (Touch/Maus)
- Neustart/Abbruch und Rückkehr zur Spielesammlung

**Ergebnis:** „4-Connect“ ist spielbar und technisch integrierbar.

### M3 Funktionsumfang vervollständigt (Woche 8–11)
- Moduswahl (PvP / PvE)
- Bot-Grundlogik für Einzelspieler
- UI-Flows vollständig (Menü, Spiel, Ergebnis)

**Ergebnis:** geplanter Funktionsumfang ist in einem konsolidierten Stand umgesetzt.

### M4 Stabilisierung, Integration und Abnahmevorbereitung (Woche 12–15)
- Stabilitäts- und Belastungsprüfung (z. B. schnelle Eingaben, lange Laufzeit)
- Fehlerkorrekturen und UI-Feinschliff
- Dokumentationsfinalisierung und Abnahmecheck

**Ergebnis:** Release-Kandidat mit geprüfter Auslieferungsstruktur.

### M5 Release/Abgabe (Woche 16)
- Finales JAR-Paket und vollständige Abgabeunterlagen
- Abschließende Prüfung der Start-/Beendenavigation und Offline-Fähigkeit

**Ergebnis:** finale Abgabeversion.



---

## 7.4 Qualitätssicherung und Tests

Die Qualitätssicherung erfolgt begleitend während der Entwicklung durch:

- Reviews der Änderungen (z. B. Merge-/Pull-Requests) zur Sicherstellung von Lesbarkeit und Korrektheit
- Manuelle, dokumentierte Tests der zentralen Anwendungsfälle (insbesondere UI- und Spielabläufe)
- Tests auf der Zielumgebung/Dev-Kit, um IFE-spezifisches Verhalten (Start/Beenden, Eingaben, Offline-Betrieb) zuverlässig zu prüfen

---

## 7.5 Konfigurations- und Änderungsmanagement

Die Versionierung erfolgt über Git. Änderungen werden über Feature-Branches entwickelt und über Pull Requests in den stabilen Hauptzweig integriert. Anforderungen, Anpassungen und Fehler werden als Issues dokumentiert und priorisiert. Releases werden versioniert und mit Release-Notes versehen.

Änderungen an UI, Branding oder Sprachumfang werden als Issue erfasst, hinsichtlich Aufwand und Auswirkungen bewertet und anschließend in die Planung aufgenommen.

---

## 7.6 Kommunikation und Projektdokumentation

Das Team stimmt sich regelmäßig ab und dokumentiert Fortschritt, Entscheidungen, Risiken und Änderungen in Protokollen oder im Projektbericht. Der Projektstatus ist jederzeit über Board, Issues und Milestones nachvollziehbar.

---

## 7.7 Risiken und Gegenmaßnahmen

| Risiko | Auswirkung | Gegenmaßnahme |
|------|------------|---------------|
| Unklare oder sich ändernde IFE-Rahmenbedingungen | Nacharbeit, Verzögerungen | frühe Tests auf Dev-Kit, iterative Umsetzung, Scope-Kontrolle |
| Performance- oder Ressourcenlimits | Instabilität, schlechte Bedienbarkeit | einfache UI, effiziente Logik, frühzeitige Stabilisierung |
| Bot-Implementierung aufwändiger als geplant | Funktionsumfang/Timing gefährdet | Bot zunächst als Grundlogik umsetzen, optionale Erweiterungen (z. B. Schwierigkeitsstufen) nachrangig behandeln |
| Späte Änderungen an UI/Assets | Mehraufwand kurz vor Abgabe | Ressourcenstruktur früh festlegen, Platzhalter nutzen, schrittweise Integration |
