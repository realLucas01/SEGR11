# Inhaltsverzeichnis

1. [Zielbestimmung](#1-zielbestimmung)  
   1.1 [Muss-Kriterien](#11-muss-kriterien)  
   1.2 [Kann-Kriterien](#12-kann-kriterien)  
   1.3 [Abgrenzungskriterien](#13-abgrenzungskriterien)  

2. [Produkteinsatz](#2-produkteinsatz)  
   2.1 [Anwendungsbereich](#21-anwendungsbereich)  
   2.2 [Zielgruppen](#22-zielgruppen)  
   2.3 [Produktumgebung](#23-produktumgebung)  
   &nbsp;&nbsp;&nbsp;&nbsp;2.3.1 [Architektur](#231-architektur)  
   &nbsp;&nbsp;&nbsp;&nbsp;2.3.2 [Technologie](#232-technologie)  
   &nbsp;&nbsp;&nbsp;&nbsp;2.3.3 [Komponenten](#233-komponenten)  
   &nbsp;&nbsp;&nbsp;&nbsp;2.3.4 [Schnittstellen](#234-schnittstellen)  
   2.4 [Betriebsbedingungen](#24-betriebsbedingungen)  

3. [Produktfunktionen / Anforderungen](#3-produktfunktionen--anforderungen)  
   3.1 [Funktionale Anforderungen](#31-funktionale-anforderungen)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.1.1 [Beschreibung der FA mit Rollen innerhalb der Geschäftsprozesse](#311-beschreibung-der-fa-mit-rollen-innerhalb-der-geschäftsprozesse)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.1.2 [Aktivitäten mit Benutzerschnittstelle (UI)](#312-aktivitäten-mit-benutzerschnittstelle-ui)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.1.3 [Fachliches Klassendiagramm (Domain Model) / Produktdaten](#313-fachliches-klassendiagramm-domain-model--produktdaten)  
   3.2 [Nichtfunktionale Anforderungen](#32-nichtfunktionale-anforderungen)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.1 [Benutzbarkeit](#321-benutzbarkeit)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.2 [Zuverlässigkeit](#322-zuverlässigkeit)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.3 [Effizienz](#323-effizienz)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.4 [Softwarewartung](#324-softwarewartung)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.5 [Sicherheit](#325-sicherheit)  
   &nbsp;&nbsp;&nbsp;&nbsp;3.2.6 [Normen](#326-normen)  

4. [Testung](#4-testung)  

5. [Monitoring / Support bei Übergabe oder ähnliche Leistungen](#5-monitoring--support-bei-übergabe-oder-ähnliche-leistungen)  

6. [Dokumentation](#6-dokumentation)  
   6.1 [Anwenderdokumentation](#61-anwenderdokumentation)  
   6.2 [Administratorendokumentation](#62-administratorendokumentation)  
   6.3 [Entwicklerdokumentation](#63-entwicklerdokumentation)  
   6.4 [Weitere referenzierte Dokumente](#64-weitere-referenzierte-dokumente)  

7. [Vorgehen](#7-vorgehen)  

8. [Entwicklungsumgebung](#8-entwicklungsumgebung)  

9. [Glossar](#9-glossar)






# Projektdokumentation

## 1 Zielbestimmung

Ziel dieses Projekts ist die Konzeption und Umsetzung einer offlinefähigen Spieleapplikation zur Erweiterung eines bestehenden Inflight-Entertainment-Systems. Die Applikation soll Passagieren während des Fluges ein leicht verständliches und unterhaltsames Spielangebot bereitstellen und sich dabei nahtlos in die vorhandene Systemlandschaft integrieren.

Im Rahmen dieses Pflichtenhefts werden die funktionalen und nicht-funktionalen Eigenschaften des zu entwickelnden Produkts konkretisiert. Die Zielbestimmung dient als verbindliche Grundlage für Entwicklung, Test, Abnahme und Übergabe des Systems.

### 1.1 Muss-Kriterien
| ID  | Name | Beschreibung |
| :-- | :--: | :-- |
| MK100 | Eingabe | Die Bedienung erfolgt über Touch- oder Maussteuerung. |
| MK101 | UI-Aufbau | Wiederverwendbare UI- und Navigationskomponenten müssenn bereitgestellt werden. |
| MK102 | Modusauswahl | Es gibt einen Auswahlbildschirm für die Modusauswahl(Bot/1v1). |
| MK103 | End-Screen | Es gibt einen Endbildschirm um den Ausgang des Spiels anzuzeigen. |
| MK104 | Spielregeln | Die Anwendung muss eine verständliche Darstellung der Spielregeln bereitstellen. |
| MK201 | Programmiersprache | Die Anwendung muss in der Programmiersprache Java implementiert und auf der vom Auftraggeber bereitgestellten IFE-Hardware lauffähig sein. |
| MK202 | Offlinezwang | Die Nutzung der Anwendung muss vollständig offline möglich sein. |
| MK203 | Testspiel | Es ist möglich das Spiel 4-Gewinnt zu spielen. |
| MK204 | Multiplayer | Das System muss einen Mehrspielermodus für zwei Passagiere auf einem gemeinsamen Sitzmonitor bereitstellen. |
| MK205 | Singleplayer | Das System muss einen Einzelspielermodus gegen einen Computergegner unterstützen. |
| MK206 | Spielzüge | Spielzüge müssen regelkonform verarbeitet und umgesetzt werden. |
| MK207 | Win-Condition | Das System muss erkennen wann ein Spieler gewonnen hat. |
| MK208 | Unentschieden | Das System muss erkennen wenn keine weiteren Spielzüge mehr möglich sind und das Spiel als "Unentschieden" beenden. |
| MK209 | Neustart | Ein laufendes Spiel muss jederzeit neu gestartet werden können. |
| MK210 | Rückkehr |Die Anwendung muss jederzeit korrekt in das IFE-Hauptmenü zurückkehren können. |
| MK300 | Datenverarbeitung | Es dürfen keine personenbezogenen Daten erfasst, gespeichert oder übertragen werden. |
| MK301 | Modularität | Die Architektur ist modular aufgebaut, damit zukünftige Erweiterungen um weitere Spiele mit geringem Aufwand möglich sind. |



### 1.2 Kann-Kriterien
| ID | Kann-Kriterium                                                                                                                   |
| -- | -------------------------------------------------------------------------------------------------------------------------------- |
| KK-IO-01  | Die Sprache der Benutzeroberfläche kann an verschiedene Sprachen angepasst werden. |
| KK-IO-02 | Die Benutzeroberfläche kann an die Corporate Identity verschiedener Airlines angepasst werden (z. B. Farben, Logos, UI-Assets). |
| KK-IO-03 | Visuelles Feedback oder einfache Animationen bei Spielzügen können implementiert werden. |
| KK-IMPL-01 | Der Computergegner kann optional in unterschiedlichen Schwierigkeitsstufen angeboten werden. |


### 1.3 Abgrenzungskriterien
| ID | Abgrenzung                                                                                            |
| -- | ----------------------------------------------------------------------------------------------------- |
| AK-SYS-01 | Funktionen, die eine Netzwerk- oder Internetverbindung erfordern sind nicht Bestandteil des Systems. |
| AK-SYS-02 | Es erfolgt keine Anbindung an sicherheitskritische oder avionische Systeme. |
| AK-SYS-03 | Die Speicherung von Spielständen, Statistiken oder Nutzerdaten ist ausgeschlossen. |
| AK-IMPL-01 | Eine Mehrspielerfunktion über mehrere Sitzplätze hinweg wird nicht umgesetzt. |
| AK-IO-01 | Werbung oder Monetarisierung sind nicht vorgesehen. |

## 2 Produkteinsatz

### 2.1 Anwendungsbereich

### 2.2 Zielgruppen

### 2.3 Produktumgebung

#### 2.3.1 Architektur

#### 2.3.2 Technologie

#### 2.3.3 Komponenten

#### 2.3.4 Schnittstellen

### 2.4 Betriebsbedingungen


## 3 Produktfunktionen / Anforderungen

### 3.1 Funktionale Anforderungen

#### 3.1.1 Beschreibung der funktionalen Anforderungen mit Rollen innerhalb der Geschäftsprozesse

#### 3.1.2 Aktivitäten mit Benutzerschnittstelle (UI)

#### 3.1.3 Fachliches Klassendiagramm (Domain Model) / Produktdaten

### 3.2 Nichtfunktionale Anforderungen

#### 3.2.1 Benutzbarkeit

#### 3.2.2 Zuverlässigkeit

#### 3.2.3 Effizienz

#### 3.2.4 Softwarewartung

#### 3.2.5 Sicherheit

#### 3.2.6 Normen


## 4 Testung


## 5 Monitoring / Support bei Übergabe oder ähnliche Leistungen


## 6 Dokumentation

### 6.1 Anwenderdokumentation

### 6.2 Administratorendokumentation

### 6.3 Entwicklerdokumentation

### 6.4 Weitere referenzierte Dokumente


## 7 Vorgehen


## 8 Entwicklungsumgebung


## 9 Glossar

















