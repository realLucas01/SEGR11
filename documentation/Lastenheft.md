# Lastenheft  
## Entwicklung einer Hello-world-Anwendung in Java  
**Stand:** 14.11.2024  
**Auftraggeber:** Hochschule für Technik und Wirtschaft Dresden  
Friedrich-List-Platz 1, 01069 Dresden  
**Ansprechpartner:** Prof. Dr.-Ing. habil. Dirk Müller  

---

## Inhaltsverzeichnis
1. [Einleitung](#1-einleitung)  
2. [Ausgangssituation (Ist-Zustand)](#2-ausgangssituation-ist-zustand)  
3. [Soll-Konzept](#3-soll-konzept)  
   - [Anwendungsbereich](#31-anwendungsbereich)  
   - [Systemidee](#32-systemidee)  
   - [Ziele](#33-ziele)  
   - [Zielgruppen](#34-zielgruppen)  
4. [Projektgegenstand](#4-projektgegenstand)  
   - [Problemdomäne](#41-problemdomäne)  
   - [Prozesse](#42-prozesse)  
   - [Produktumgebung](#43-produktumgebung)  
   - [Schnittstellen](#44-schnittstellen)  
   - [Benutzerschnittstelle](#45-benutzerschnittstelle)  
5. [Projektbedingungen](#5-projektbedingungen)
   - [Zeitlicher Rahmen](#51-rahmen)
   - [Auftragswert](#52-auftragswert)
   - [Technische Einschränkungen](#53-einschraenkungen)
   - [Projektplan und Projektmanagement](#54-plan_und_management)
   - [Angebotserstellung](#55-angebot)
7. [Anforderungen](#6-anforderungen)  
8. [Lieferumfang](#7-lieferumfang)  
9. [Glossar](#8-glossar)  

---

## 1 Einleitung
Um den steigenden Ansprüchen der Passagiere an moderne Bordunterhaltung gerecht zu werden, soll das bestehende Inflight-Entertainment-System (IFE) unseres Unternehmens um eine eigene Spiele-Sektion erweitert werden. Der Markt zeigt deutlich, dass interaktive Inhalte zunehmend an Bedeutung gewinnen und einen wesentlichen Beitrag zur Verbesserung des Reiseerlebnisses leisten.

Ziel dieses Projekts ist es, den Passagieren ein attraktives, intuitives und abwechslungsreiches Spieleangebot bereitzustellen, das sowohl technisch zuverlässig funktioniert als auch optimal in die bestehende IFE-Umgebung integriert werden kann.

Dieses Lastenheft beschreibt aus Sicht des Auftraggebers die grundlegenden Anforderungen, Erwartungen und Rahmenbedingungen, die für die Planung, Entwicklung und Implementierung der neuen Spiele-Sektion maßgeblich sind. Es bildet damit die verbindliche Grundlage für die anschließende Erstellung des Pflichtenhefts durch den Auftragnehmer.

## 2 Ausgangssituation (Ist-Zustand)
Derzeit existiert kein exemplarisches System [...].

## 3 Soll-Konzept

### 3.1 Anwendungsbereich
Das System hat nur beispielhaften Charakter [...].

### 3.2 Systemidee
Eine einfache Java-Konsolenanwendung [...].

### 3.3 Ziele
Der Softwareentwicklungsprozess soll anhand des Systems veranschaulicht werden.

### 3.4 Zielgruppen
| Anforderungsbeitragende | Anforderungen |
|-------------------------|---------------|
| Studierende | Der Softwareentwicklungsprozess soll veranschaulicht werden. |
| Nutzer | Ausgabe „hello world“, Exit-Code, Hilfetext. |
| Hochschulmitarbeiter | Analyse objektorientiert, UML2, Java-Implementierung. |

---

## 4 Projektgegenstand

### 4.1 Problemdomäne
Das Projekt ist selbstreferenziell [...].

### 4.2 Prozesse
Der Prozess des Software Engineerings soll veranschaulicht werden.

### 4.3 Produktumgebung
Java-Konsolenanwendung, Ausführung auf Laborrechnern [...].

### 4.4 Schnittstellen
Keine Schnittstellen zu Drittanbietern. Keine Datenspeicherung.

### 4.5 Benutzerschnittstelle
Ausgabe in englischer Sprache. Spätere Erweiterung möglich.

---

## 5 Projektbedingungen

### 5.1 Zeitlicher Rahmen
Die geforderte Lestung ist innerhalb einer Gesamtdauer von 12 Wochen zu erbringen. Innerhalb dieses Zeitraums sind sämtliche Projektphasen – Analyse, Konzeption, Implementierung, Integration, Test sowie Abnahme – durchzuführen.

Nach 8 Wochen ist ein funktionsfähiger Prototyp bereitzustellen, der dem Auftraggeber im Rahmen eines Abstimmungsmeetings vorgestellt wird. Der detaillierte Meilensteinplan wird im Zuge der Projektinitialisierung finalisiert und bedarf der gemeinsamen Abstimmung zwischen Auftraggeber und Auftragnehmer.

### 5.2 Auftragswert
Der maximale Auftragswert für die Umsetzung des Projekts beträgt 130.000 €. Dieser Betrag umfasst sämtliche projektbezogenen Leistungen, einschließlich Planung, Entwicklung, Qualitätssicherung, Dokumentation, Schulung (falls erforderlich) sowie projektbegleitende Managementaufwände. Eine Überschreitung des festgelegten Auftragswertes ist ausgeschlossen, sofern keine zusätzlichen, schriftlich freigegebenen Leistungsumfänge durch den Auftraggeber beauftragt werden.

### 5.3 Technische Einschränkungen
Die im Rahmen des Projekts zu entwickelnde Software hat den technischen und betrieblichen Rahmenbedingungen des bestehenden Inflight-Entertainment-Systems zu entsprechen. Hierzu zählen insbesondere:

- Kompatibilität mit der vorhandenen IFE-Hardware und den eingesetzten Betriebssystemen
- Ressourceneffizienz hinsichtlich Speicherbedarf, Prozessorlast und Energieverbrauch
- Offline-Funktionalität, da während des Flugbetriebs keine stabile Internetverbindung gewährleistet werden kann
- Einhaltung sicherheitsrelevanter Vorgaben, Richtlinien und Zertifizierungsanforderungen gemäß IFE- und luftfahrtspezifischen Standards
- Konformität mit bestehenden UI/UX-Richtlinien sowie der Designarchitektur des IFE-Systems
- Unterstützung mehrerer Sprachen entsprechend der internationalen Ausrichtung des Systems

Um die fachgerechte Umsetzung der oben genannten Punkte sicherzustellen wird vom Auftraggeber ein Dev-Kit zur Verfügung gestellt.

Weitere technische Rahmenbedingungen können im Zuge der detaillierten Anforderungsabstimmung präzisiert werden.

### 5.4 Projektplan und Projektmanagement
Der Auftragnehmer verpflichtet sich zur Erstellung eines strukturierten Projektplans, der alle wesentlichen Phasen und Meilensteine beschreibt. Das anzuwendende Vorgehensmodell (z. B. klassisch, hybrid oder agil) wird zu Projektbeginn gemeinsam mit dem Auftraggeber verbindlich festgelegt.

Das Projektmanagement umfasst insbesondere:
- regelmäßige Statusberichte sowie Dokumentation relevanter Arbeitspakete und Änderungen

- Identifikation und Bewertung projektrelevanter Risiken sowie Umsetzung geeigneter Gegenmaßnahmen

- kontinuierliche Qualitätssicherungsmaßnahmen über alle Projektphasen hinweg

- transparente Kommunikation über Abweichungen hinsichtlich Zeit, Kosten oder Qualität

Ziel ist eine strukturierte, nachvollziehbare und planbare Projektdurchführung.

### 5.5 Angebotserstellung
Auf Grundlage der in diesem Lastenheft definierten Anforderungen erstellt der Auftragnehmer ein verbindliches Angebot. Dieses enthält:
- eine detaillierte Leistungsbeschreibung
- eine Aufschlüsselung der Kosten im Rahmen des maximalen Auftragswerts
- Angaben zur geplanten Projektdauer entsprechend des vereinbarten Zeitrahmens
- Darstellung der Zahlungsbedingungen und vertraglichen Modalitäten

Das Angebot dient als Grundlage für die Beauftragung und die anschließende Umsetzung des Projekts.

---

## 6 Anforderungen

### 6.1 Funktionale Anforderungen
| ID | Beschreibung |
|----|--------------|
| F1 | Ausgabe von „hello world“. |
| F2 | Ausgabe eines Hilfetextes. |

### 6.2 Nicht-funktionale Anforderungen
| ID | Beschreibung |
|----|--------------|
| NF1 | Nutzung in der Konsole. |
| NF2 | Ausgabe erfolgt unmittelbar. |
| NF3 | Internationale Ausgabe vorgesehen. |
| NF4 | Keine Sicherheitsanforderungen. |
| NF5 | Keine Normanforderungen. |

---

## 7 Lieferumfang
- Prototyp  
- Beta-Version  
- Release (inkl. Repository)  
- Wiederverwendbare Komponenten  
- Funktionstest  
- Inbetriebnahme, Abnahme  
- Monitoring  
- Schulung  
- Support  
- Wartung  
- Anwender- und Entwicklerdokumentation  

---

## 8 Glossar
**AG** – Auftraggeber  
**Praktika** – Betreute Doppelstunde  
**SE** – Software Engineering  
**WS2019/20** – Wintersemester 2019/2020  
