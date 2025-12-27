# 7 Vorgehen

Dieses Kapitel beschreibt das Vorgehen zur Umsetzung der Entertainment-Erweiterung „4-Connect“ für das Inflight-Entertainment-System. Das Vorgehen stellt sicher, dass nach acht Wochen ein funktionsfähiger Prototyp und nach zwölf Wochen das finale Release inklusive Dokumentation und Qualitätssicherung vorliegt.

---

## 7.1 Vorgehensmodell

Wir arbeiten iterativ und inkrementell in kurzen Zyklen. Anforderungen werden als Issues erfasst, priorisiert und in Iterationen umgesetzt. Jede Iteration umfasst Planung, Implementierung, Test und Review sowie die Aktualisierung der Projektdokumentation.

Das iterative Vorgehen ermöglicht frühe, sichtbare Ergebnisse, reduziert Risiken durch frühe Validierung und erlaubt kontrollierte Anpassungen, falls Anforderungen präzisiert oder erweitert werden.

---

## 7.2 Arbeitspakete und Ablauf

Die Umsetzung wird in Arbeitspakete gegliedert und über das Repository-Board mit Issues und Milestones geplant. Die Arbeitspakete umfassen:

- Anforderungs- und UI-Konkretisierung: Spielregeln, Spielmodi, UI-Layout für Touch und Maus, Menüführung, Sprachkonzept und Branding
- Architektur und Grundgerüst: Projektstruktur, klare Trennung zwischen Spiellogik und Benutzeroberfläche, grundlegende Komponenten für Spielablauf und Zustände
- Implementierung in Iterationen: vollständiger Spielablauf, Modus gegen Computer, Sprachumschaltung und Ressourcenverwaltung, Einbindung austauschbarer Assets
- Integration und Stabilisierung: Offline-Betrieb, Fehlerbehandlung und Logging, Packaging als JAR sowie Vorbereitung der Release-Struktur
- Dokumentation und Abgabe: Anwender-, Administrator- und Entwicklerdokumentation, UML-Exporte und API-Dokumentation, Erstellung des Release-Pakets gemäß Abgabevorgaben

---

## 7.3 Meilensteine und Zeitplan

Die Wochenangaben beziehen sich auf Projektwoche 1 bis 12.

### M0.5 Projektstart und Setup, Woche 1
- Repository-Struktur und Arbeitsregeln eingerichtet
- Grundstruktur für Build und Run erstellt, erste UI-Skizzen und Mockups
- Architekturentscheidungen dokumentiert

Ergebnis: lauffähiges Grundgerüst und aktuelles Board mit initialer Planung.

### M1 Kernfunktionalität, Woche 2 bis 4
- Spiellogik umgesetzt, inklusive Zuglogik, Gewinn- und Unentschieden-Erkennung sowie Neustart
- UI-Grundlayout und Eingabe über Touch und Maus integriert
- erste automatisierte Tests für zentrale Logik

Ergebnis: „4-Connect“ lokal spielbar mit stabiler Basisfunktion.

### M2 Erweiterungen, Woche 5 bis 7
- Moduswahl für zwei Spieler sowie gegen Computer umgesetzt
- BOT-Gegner implementiert
- Internationalisierung über Sprachressourcen vorbereitet und integriert
- Branding über austauschbare Assets vorgesehen und eingebunden

Ergebnis: Feature-Stand kurz vor Prototyp-Abgabe.

### M3 Prototyp-Abgabe, Ende Woche 8
- Funktionsfähiger Prototyp gemäß Lastenheft
- Stabilität und Bedienbarkeit geprüft, bekannte Einschränkungen dokumentiert
- grundlegende Release- und Dokumentationsstruktur vorbereitet

Ergebnis: Prototypversion mit vollständigem spielbaren Kernumfang.

### M4 Finalisierung und Qualität, Woche 9 bis 11
- Fehlerkorrekturen und UI-Feinschliff, Performance-Verbesserungen
- Erweiterung der Tests, insbesondere Randfälle und Regression
- Fertigstellung der Dokumentation

Ergebnis: Release Candidate.

### M5 Release und Abnahme, Woche 12
- Finale JAR-Version und vollständiges Release-Paket inklusive Dokumente und Struktur
- Abnahmecheckliste durchgeführt und Ergebnis dokumentiert

Ergebnis: finale Abgabeversion.

---

## 7.4 Qualitätssicherung und Tests

Die Qualitätssicherung erfolgt durch Code Reviews über Pull Requests, automatisierte Unit-Tests und manuelle UI-Tests. Zusätzlich wird das Packaging geprüft, indem die Startfähigkeit des JAR sowie die Vollständigkeit der Ressourcen und die Offline-Fähigkeit verifiziert werden.

Ein Arbeitseintrag gilt als abgeschlossen, wenn die Umsetzung lauffähig ist, passende Tests vorhanden sind, ein Review erfolgt ist und relevante Dokumentation oder Protokolle aktualisiert wurden.

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
| Unklare oder ändernde IFE-Vorgaben | Nacharbeit und Verzögerung | frühe Abstimmung, Anforderungen als Issues dokumentieren, Scope kontrollieren |
| Performance- oder Ressourcenlimits | eingeschränkte Bedienbarkeit oder Instabilität | frühzeitige Tests, einfache UI, effiziente Logik und Datenstrukturen |
| Höherer Aufwand für KI oder UI | Prototyp-Termin gefährdet | Kernfunktion priorisieren, KI zunächst einfach halten, Erweiterungen nach Prototyp |
| Fehlende oder verspätete Assets für Branding oder Sprachen | UI nicht final | Platzhalter-Assets nutzen, Ressourcenstruktur früh festlegen |
