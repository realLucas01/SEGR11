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
Das bestehende Inflight-Entertainment-System (IFE) des Auftraggebers bietet Passagieren bisher nur klassische Medieninhalte wie Filme, Musik und Informationsseiten. Interaktive Spiele sind zwar vorgesehen, jedoch fehlt bislang ein eigenes, integriertes Minispiel.

Im Rahmen der öffentlichen Ausschreibung wurde der Bedarf an einer modernen, leicht verständlichen und stabilen Spielapplikation identifiziert, die ohne Netzwerkverbindung auf Sitzmonitoren genutzt werden kann. 
Das in der Ausschreibung spezifizierte „4-Connect System“ soll diese Lücke schließen und Passagieren ermöglichen, während des Fluges ein unterhaltsames 4-Gewinnt-Spiel zu nutzen. Die Anwendung muss dabei zuverlässig funktionieren, CI-anpassbar sein und sich nahtlos in bestehende IFE-Infrastrukturen integrieren lassen.  

Aktuell existiert jedoch kein funktionsfähiger Prototyp, keine spezifische technische Implementierung und keine dokumentierten Anforderungen für ein solches System. Dieses Lastenheft definiert daher erstmals die fachlichen Rahmenbedingungen für die anschließende technische Umsetzung.
  
---

## 3 Soll-Konzept

### 3.1 Anwendungsbereich
Das System dient der passagierseitigen Unterhaltung während des Fluges.  
Es wird als Applikation innerhalb des bestehenden Inflight-Entertainment-Systems des Auftraggebers ausgeführt und ist vollständig offline nutzbar. Die Anwendung soll auf der vom Auftraggeber vertriebenen Hardware lauffähig sein.

### 3.2 Systemidee
Die Software ermöglicht ein 4-Gewinnt-Spiel („4-Connect“) direkt auf einem einzigen Sitzmonitor. Zwei Passagiere spielen dabei abwechselnd auf demselben Bildschirm gegeneinander.
Um das Spiel auch alleine nutzen zu können, kann das Spiel auch im Einzelspielermodus gegen einen einfachen Computergegner gespielt werden.

Die Anwendung wird über Touch- oder Maussteuerung bedient, benötigt nur geringe Ressourcen und lässt sich optisch an die Corporate Identity verschiedener Airlines anpassen (z. B. Farben, Logo, UI-Elemente).  
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
| **Technik- & Integrationspartner** | Kompatibilität mit IFE-Schnittstellen |
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
Die Software unterstützt keine geschäftlichen oder betrieblichen Abläufe, sondern dient ausschließlich der passagierseitigen Unterhaltung innerhalb des IFE-Systems.  
Für ihre Entwicklung werden die etablierten Entwicklungs- und Qualitätsprozesse des Auftraggebers angewendet, um eine konsistente Vorgehensweise, klare Dokumentation und einen stabilen Betrieb im produktiven Einsatz sicherzustellen.

Im Hintergrund laufen klassische SE-Prozesse:
- Analyse  
- Design  
- Implementierung  
- Integration in IFE-Umgebung  
- Test und Validierung  

### 4.3 Produktumgebung
- Ausführung auf der IFE-Hardware des Herstellers  
- Eingabe über Touchscreen oder physische Bedienelemente  
- Keine Internetverbindung erforderlich

### 4.3 Produktumgebung
Das Softwaresystem wird innerhalb der bestehenden IFE-Infrastruktur des Herstellers betrieben.  
Die Produktumgebung umfasst:

- **Hardware:**  
  Die Anwendung läuft auf der vom Hersteller bereitgestellten IFE-Hardware, bestehend aus Touchpanels oder optionalen physischen Eingabegeräten.

- **Softwarebasis:**  
  Das System nutzt die vorhandene, vom Hersteller vorgegebene Softwareumgebung des IFE-Systems. Diese umfasst ein fest definiertes Betriebssystem sowie die für Anwendungen bereitgestellten Laufzeitkomponenten. Die Umgebung ist offline-orientiert und ermöglicht keine externe Kommunikation.

- **Entwicklungsumgebung:**  
  Für die Entwicklung steht ein Dev-Kit des Auftraggebers zur Verfügung, das einen IFE-Simulator sowie die zugehörige technische Dokumentation umfasst. Die Anwendung wird in Java umgesetzt.

- **Betriebsumgebung:**  
  Die Software wird vollständig offline betrieben. Während des Flugbetriebs besteht keine Netzwerkverbindung. Die Anwendung muss daher autonom funktionieren und darf sich nicht auf externe Server oder Datenquellen verlassen.

- **Organisatorische Rahmenbedingungen:**  
  Die Anwendung soll die internen UI-/UX-Richtlinien des Herstellers berücksichtigen und in bestehende Navigations- und Bedienkonzepte integrierbar sein.

### 4.4 Schnittstellen
Die Anwendung ist in das bestehende Inflight-Entertainment-System eingebettet und nutzt die dort bereitgestellten Mechanismen zum Starten und Beenden der Software. Darüber hinaus erfolgt keine Kommunikation mit externen Systemen oder Diensten.

Es werden keine dauerhaften Daten gespeichert. Die Anwendung verwaltet ausschließlich temporäre Informationen, die nur während der aktiven Nutzung benötigt werden und beim Beenden vollständig verworfen werden.

Eine Interaktion mit sicherheitsrelevanten Systemen des Flugzeugs findet nicht statt.

### 4.5 Benutzerschnittstelle
Die Benutzerschnittstelle orientiert sich an den bestehenden UI-/UX-Richtlinien des Herstellers und soll eine klare, intuitive und barrierearme Bedienung gewährleisten. Sie umfasst:

- **Spieloberfläche:**  
  Ein übersichtlich gestaltetes 2D-Spielbrett, das die aktuelle Spielsituation klar darstellt und deutlich erkennbare Spielsteine verwendet.

- **Bedienung:**  
  Touch-optimierte Eingabeelemente bzw. Mausbedienung in der Entwicklungsumgebung, mit klaren Rückmeldungen bei Interaktionen.

- **Menüstruktur:**  
  Eine einfache und verständliche Navigation für Spielstart, Moduswahl, Regelanzeige und Rücksprung zum Hauptmenü.

- **Gestaltung & Farben:**  
  Eine klare Farbgebung mit hohem Kontrast zur guten Erkennbarkeit, unabhängig von Umgebungslicht und Blickwinkel.

- **CI-Anpassung:**  
  Austauschbare visuelle Elemente (z. B. Farben, Logo) zur Anpassung an die Corporate Identity der jeweiligen Airline.

- **Informationselemente:**  
  Eine optionale Anzeige der Spielregeln sowie kurze Hinweise zur Bedienung.

- **Konsistenz:**  
  Ein einheitliches Layout und wiederverwendbare UI-Komponenten, die sich harmonisch in das übrige IFE-Design einfügen.

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
| ID   | Beschreibung |
|------|--------------|
| F1   | Das System stellt ein Hauptmenü mit Spielauswahl bereit. |
| F2   | Nach Auswahl von „4-Connect“ wird ein Modusmenü mit den Optionen „Zwei Spieler“ und „Gegen Computer“ angezeigt. |
| F3   | Zwei Passagiere können auf einem Sitzmonitor abwechselnd gegeneinander spielen. |
| F4   | Der Einzelspielermodus ermöglicht ein Spiel gegen einen einfachen Computergegner (Bot). |
| F5   | Das System verarbeitet Spielzüge und platziert Spielsteine regelkonform. |
| F6   | Das System erkennt automatisch einen Gewinn. |
| F7   | Das System erkennt ein Unentschieden, wenn keine weiteren Züge möglich sind. |
| F8   | Ein Hilfebildschirm zeigt die Spielregeln an. |
| F9   | Verschiedene Sprachen können ausgewählt werden. |
| F10  | Ein laufendes Spiel kann jederzeit neu gestartet werden. |
| F11  | Die Anwendung kann korrekt in das IFE-Hauptmenü zurückkehren. |
| F12  | Das System unterstützt Airline-Branding. |

### 6.2 Nicht-funktionale Anforderungen
| ID   | Kategorie            | Beschreibung |
|------|----------------------|--------------|
| NF1  | Performance          | Eingaben sollen flüssig und reaktionsschnell verarbeitet werden. |
| NF2  | Stabilität           | Die Anwendung soll zuverlässig laufen und auch bei schneller Eingabe nicht abstürzen. |
| NF3  | Ressourcen           | Speicherverbrauch und CPU-Last müssen gering bleiben. |
| NF3  | Usability            | Die Bedienung soll über große, gut erkennbare Touchflächen intuitiv möglich sein. |
| NF4  | Internationalisierung| Die Benutzeroberfläche soll in mehreren Sprachen verfügbar sein. |
| NF5  | Kompatibilität       | Die Anwendung soll auf der vom Auftraggeber bereitgestellten IFE-Hardware lauffähig sein. |
| NF6  | Datensicherheit      | Es werden keine personenbezogenen Daten erfasst, gespeichert oder übertragen. |
| NF7  | Branding             | Die Benutzeroberfläche soll durch austauschbare UI-Assets gemäß der Airline-CI anpassbar sein. |
| NF8  | Barrierearmut        | Die Gestaltung soll ausreichende Farbkontraste und klar erkennbare Elemente verwenden. |
| NF9  | Offline-Betrieb      | Die Anwendung muss vollständig ohne Netzwerkverbindung funktionieren. |

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
