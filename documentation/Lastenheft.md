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
   - [Zeitlicher Rahmen](#51-zeitlicher-rahmen)
   - [Auftragswert](#52-auftragswert)
   - [Technische Einschränkungen](#53-technische-einschränkungen)
   - [Projektplan und Projektmanagement](#54-projektplan-und-projektmanagement)
   - [Angebotserstellung](#55-angebotserstellung)
6. [Anforderungen](#6-anforderungen)
7. [Lieferumfang](#7-lieferumfang)
   - [Prototyp](#71-prototyp)
   - [Release](#72-release)
   - [Wiederverwendbare Komponenten](#73-wiederverwendbare-komponenten)
   - [Funktionstest](#74-funktionstest)
   - [Inbetriebnahme und Abnahme](#75-inbetriebnahme-und-abnahme)
   - [Schulung](#76-schulung)
   - [Support und Wartung](#77-support-und-wartung)
   - [Dokumentation](#78-dokumentation)
8. [Glossar](#8-glossar)  

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

### 7.1 Prototyp
Im Rahmen des Prototyps wird die grundlegende Menüführung einschließlich Sprachunterstützung und Designkonzept implementiert. Das erste Spiel („4 Gewinnt“) wird in einem statischen Ausgangszustand bereitgestellt, jedoch ohne funktionale Spiellogik. Ziel des Prototyps ist die Überprüfung der Navigationsstruktur, der Bedienbarkeit sowie des visuellen Auftretens.

### 7.2 Release
Das finale Release umfasst die vollständig implementierte Softwareversion inklusive aller vereinbarten Funktionen.
Zum Lieferumfang gehört ein versioniertes Repository mit Quellcode, Build-Anweisungen, Konfigurationsdateien sowie sämtlichen für den Betrieb erforderlichen Ressourcen. Die Bereitstellung erfolgt in einer für die bestehende IFE-Hardware lauffähigen Form.

### 7.3 Wiederverwendbare Komponenten
Die Menüführung wird modular aufgebaut, sodass sie für zukünftige Spiele innerhalb des IFE-Systems wiederverwendet werden kann. Dies beinhaltet insbesondere Navigationselemente, UI-Komponenten, Sprachlogik und Layoutstrukturen.

### 7.4 Funktionstest
Vor Abschluss des Projekts wird ein Funktionstest durchgeführt, der folgende Punkte umfasst:
- Prüfung aller implementierten Funktionen gemäß Anforderungen des Lastenhefts
- Validierung der Kompatibilität mit der bestehenden IFE-Hardware
- Test der Benutzerführung und Bedienbarkeit
- Erstellung einer Testdokumentation einschließlich Fehlerprotokollen

### 7.5 Inbetriebnahme und Abnahme
Die Inbetriebnahme erfolgt auf der vorgesehenen IFE-Hardware unter Begleitung des Auftragnehmers.
Die Abnahme erfolgt durch den Auftraggeber anhand der in diesem Lastenheft definierten Kriterien. Identifizierte Abweichungen werden dokumentiert und in enger Abstimmung nachbearbeitet.

### 7.6 Schulung
Sollte eine Schulung erforderlich sein, wird der Auftragnehmer eine entsprechende Einweisung für das zuständige Personal durchführen. Diese kann sowohl die Bedienung als auch technische Grundlagen oder Administrationsaufgaben umfassen.

### 7.7 Support und Wartung
Der Auftragnehmer verpflichtet sich Support- und Wartungsleistungen bereitzustellen. Dazu gehören Fehlerbehebungen, kleinere Anpassungen und nötige Performanceoptimierungen unmittelbar nach Release/Deployment.

### 7.8 Dokumentation
Der Auftragnehmer liefert eine Anwenderdokumentation sowie eine technische Entwicklerdokumentation.
Diese beinhalten insbesondere:
- Beschreibung der Menüführung und Bedienlogik
- Hinweise zur Integration zusätzlicher Spiele
- technische Schnittstellen- und Architekturinformationen
- Anleitungen zu Build-, Test- und Deployment-Prozessen

---

## 8 Glossar
**AG** – Auftraggeber  
**Praktika** – Betreute Doppelstunde  
**SE** – Software Engineering  
**WS2019/20** – Wintersemester 2019/2020  
