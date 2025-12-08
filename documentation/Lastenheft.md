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

---

## 2 Ausgangssituation (Ist-Zustand)
Das bestehende Inflight-Entertainment-System (IFE) des Auftraggebers Novaris Cabin Systems bietet Passagieren bisher nur klassische Medieninhalte wie Filme, Musik und Informationsseiten. Interaktive Spiele sind zwar vorgesehen, jedoch fehlt bislang ein eigenes, integriertes Multiplayer-Minispiel.

Im Rahmen der öffentlichen Ausschreibung wurde der Bedarf an einer modernen, leicht verständlichen und stabilen Spielapplikation identifiziert, die ohne Netzwerkverbindung auf Sitzmonitoren genutzt werden kann. 
Das in der Ausschreibung spezifizierte „4-Connect System“ soll diese Lücke schließen und Passagieren ermöglichen, während des Fluges ein unterhaltsames 4-Gewinnt-Spiel zu nutzen. Die Anwendung muss dabei zuverlässig funktionieren, CI-anpassbar sein und sich nahtlos in bestehende IFE-Infrastrukturen integrieren lassen.  

Aktuell existiert jedoch kein funktionsfähiger Prototyp, keine spezifische technische Implementierung und keine dokumentierten Anforderungen für ein solches System. Dieses Lastenheft definiert daher erstmals die fachlichen Rahmenbedingungen für die anschließende technische Umsetzung.
  
---

## 3 Soll-Konzept

### 3.1 Anwendungsbereich
Das System dient der passagierseitigen Unterhaltung während des Fluges.  
Es wird als Applikation innerhalb des bestehenden Inflight-Entertainment-Systems ausgeführt und ist vollständig offline nutzbar. Die Anwendung soll auf allen Sitzmonitoren lauffähig sein, unabhängig von Netzwerk- oder Flugzeugtyp.

### 3.2 Systemidee
Die Idee des Systems besteht darin, ein digitales 4-Gewinnt-Spiel („4-Connect“) bereitzustellen, das sowohl Passagier-gegen-Passagier (abwechselnde Eingabe am selben Monitor) als auch optional Passagier-gegen-KI unterstützt.

Die Anwendung wird über Touch- oder Tastensteuerung bedient, benötigt nur geringe Ressourcen und lässt sich optisch an die Corporate Identity verschiedener Airlines anpassen (z. B. Farben, Logo, UI-Elemente).  
Dies entspricht den in der Ausschreibung definierten Anforderungen an Branding-Fähigkeit und Plattformkompatibilität.  

### 3.3 Ziele
- Bereitstellung eines leicht verständlichen, intuitiven Unterhaltungsspiels  
- Erhöhung des Nutzungskomforts und der Attraktivität des IFE-Systems  
- Minimale Integrationsanforderungen für Airlines  
- Hohe Stabilität und zuverlässige Funktion im Offline-Betrieb  
- Möglichkeit zur CI-Anpassung für Airline-Branding  
- Grundlage schaffen für zukünftige Erweiterungen (weitere Spiele)

### 3.4 Zielgruppen
| Anforderungsbeitragende | Anforderungen / Interessen |
|-------------------------|----------------------------|
| **Passagiere** | Einfach bedienbares, unterhaltsames Spiel während des Flugs |
| **Airlines** | CI-Anpassbarkeit, Stabilität, Integration ohne Hardwareänderungen |
| **Novaris Cabin Systems** | Erweiterung des IFE-Portfolios, Mehrwert für Kunden |
| **Technik- & Integrationspartner** | Kompatibilität mit IFE-Schnittstellen (Panasonic, Thales, Wireless IFE) |
| **Entwicklerteam** | Klare Anforderungen für Implementierung und Test |

---

## 4 Projektgegenstand

### 4.1 Problemdomäne
Das Projekt bewegt sich im Bereich der digitalen Bordunterhaltung.  
Passagiere verbringen oft mehrere Stunden ohne stabile Internetverbindung und benötigen leicht zugängliche, ressourcenschonende Entertainment-Angebote.  
4-Gewinnt ist als einfaches, bekanntes Spiel optimal geeignet, um ohne Erklärungsaufwand genutzt zu werden.

Die Applikation ist ausschließlich im Non-Safety-Bereich angesiedelt und besitzt keinerlei Verbindung zu avionischen Systemen.  
Dies entspricht den sicherheitstechnischen Anforderungen der Airline-Industrie.  

### 4.2 Prozesse
Die Software unterstützt keine geschäftlichen oder betrieblichen Prozesse, sondern dient ausschließlich der Unterhaltung.  
Jedoch muss ihre Entwicklung bestimmten aviation-üblichen Qualitätsstandards entsprechen (z. B. stabiler Betrieb, definiertes Fehlerverhalten).

Im Hintergrund laufen klassische SE-Prozesse:
- Analyse  
- Design  
- Implementierung  
- Integration in IFE-Umgebung  
- Test und Validierung  

### 4.3 Produktumgebung
- Ausführung auf IFE-Sitzmonitoren verschiedener Hersteller  
- Eingabe über Touchscreen oder physische Bedienelemente  
- Keine Internetverbindung erforderlich  
- Ressourcenbegrenzte Umgebung (begrenzter RAM/CPU)  
- UI muss Airline-CI-tauglich sein  
- Kompatibilität mit marktüblichen IFE-Systemen: Panasonic, Thales, Wireless IFE  

### 4.4 Schnittstellen
- **IFE-Launcher API**: Starten und Beenden der Anwendung  
- **Ressourcen-/UI-Framework API** der jeweiligen Plattform  
- **Logging API** (non-critical)  
- Keine externen Netzwerk- oder Datenbankschnittstellen  
- Keine Anbindung an sicherheitsrelevante Avioniksysteme  

### 4.5 Benutzerschnittstelle
- 2D-Spielbrett (7×6 Raster)  
- Touch-/Tastenbedienung  
- Menüstruktur (Start, Spielmodi, Hilfe, Neustart)  
- Klare Farbgebung, hoher Kontrast  
- Optische CI-Anpassung je Airline (Logo, Farben)  
- Optionale Anzeige der Spielregeln  

---

## 5 Projektbedingungen

### 5.1 Zeitlicher Rahmen
Die geforderte Leistung ist innerhalb einer Gesamtdauer von 12 Wochen zu erbringen. Innerhalb dieses Zeitraums sind sämtliche Projektphasen – Analyse, Konzeption, Implementierung, Integration, Test sowie Abnahme – durchzuführen.

Nach 8 Wochen ist ein funktionsfähiger Prototyp bereitzustellen, der dem Auftraggeber im Rahmen eines Abstimmungsmeetings vorgestellt wird. Der detaillierte Meilensteinplan wird im Zuge der Projektinitialisierung finalisiert und bedarf der gemeinsamen Abstimmung zwischen Auftraggeber und Auftragnehmer.

### 5.2 Auftragswert
Der maximale Auftragswert für die Umsetzung des Projekts beträgt 200.000 €. Dieser Betrag umfasst sämtliche projektbezogenen Leistungen, einschließlich Planung, Entwicklung, Qualitätssicherung, Dokumentation, Schulung (falls erforderlich) sowie projektbegleitende Managementaufwände. Eine Überschreitung des festgelegten Auftragswertes ist ausgeschlossen, sofern keine zusätzlichen, schriftlich freigegebenen Leistungsumfänge durch den Auftraggeber beauftragt werden.

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
| F1 | Das System stellt ein Startmenü mit Modusauswahl bereit. |
| F2 | Ein 7×6-Spielbrett wird dargestellt. |
| F3 | Passagiere können abwechselnd Spielsteine setzen (PvP). |
| F4 | Das System erkennt Gewinne (horizontal, vertikal, diagonal). |
| F5 | Das System erkennt ein Unentschieden bei vollem Spielfeld. |
| F6 | Ein einfaches KI-Gegnerverhalten kann aktiviert werden (optional). |
| F7 | Ein Hilfebildschirm zeigt Regeln und Steuerung. |
| F8 | Spielneustart ist jederzeit möglich. |
| F9 | Die Applikation kehrt korrekt zum IFE-Hauptmenü zurück. |
| F10 | Das System unterstützt Airline-Branding (anpassbare UI-Assets). |
| F11 | Die Anwendung funktioniert vollständig offline. |

### 6.2 Nicht-funktionale Anforderungen
| ID | Kategorie | Beschreibung |
|----|-----------|--------------|
| NF1 | Performance | Reaktionszeit unter 150 ms pro Eingabe |
| NF2 | Stabilität | Kein Absturz, auch bei schneller Eingabe |
| NF3 | Ressourcen | Speicherverbrauch und CPU-Last müssen gering bleiben |
| NF4 | Usability | Große Touchflächen, intuitive Bedienung |
| NF5 | Internationalisierung | Englische UI als Standard, weitere Sprachen optional |
| NF6 | Sicherheit | Keine Speicherung personenbezogener Daten |
| NF7 | Kompatibilität | Funktion auf marktüblichen IFE-Systemen |
| NF8 | Branding | Austauschbare UI-Assets gemäß Airline-CI |
| NF9 | Barrierearmut | Ausreichende Farbkontraste, klare Hervorhebungen |
| NF10 | Offline-Betrieb | Keine Netzwerkverbindung erforderlich |

---

## 7 Lieferumfang

### 7.1 Prototyp
Im Rahmen des Prototyps wird die grundlegende Menüführung einschließlich unterstützung mehrer Sprachen und das Designkonzept implementiert. Das erste Spiel („4 Gewinnt“) wird in einem statischen Ausgangszustand bereitgestellt, jedoch ohne funktionale Spiellogik. Ziel des Prototyps ist die Überprüfung der Navigationsstruktur, der Bedienbarkeit sowie des visuellen Auftretens.

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
