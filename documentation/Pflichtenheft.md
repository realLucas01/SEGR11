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

### 1.1 Muss-Kriterien

### 1.2 Kann-Kriterien

### 1.3 Abgrenzungskriterien


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
 
Im exemplarischen Prozess "FourConnect spielen", interagiert ein Nutzer über die grafische Benutzerschnittstelle mit der Anwendung. Die Benutzereingaben werden durch Controller verarbeitet, welche die Spiellogik des GameCore verwenden. Der Fluggast wählt ein Spiel, konfiguriert den Spielmodus, führt Spielaktionen aus und kann optional die Spielhilfe aufrufen.

Muss Kriterien:  
|AF Nr |Name |Beschreibung |    
|------|-----|-------------|
|AF-01 |Spiel starten/auswählen |Der Fluggast wählt aus der, ihm vorliegendem Spielesammlung ein Spiel aus. Das ausgewählte Spiel wird anschließend gestartet und angezeigt. |
|AF-02 |Spielmodus wählen |Der Fluggast wählt zwischen den Spielmodi: "Spieler gegen Spieler" oder "Spieler gegen Bot". |
|AF-03 |Spielstein setzten |Der Fluggast wählt ein Feld oder eine Reihe im Spielfeld aus, der Spielstein dieses Spielers fällt daraufhin von oben in die Reihe und bleibt auf dem niedrigstem freiem Platz liegen. |
|AF-04 |Neue Runde starten |Nach dem Abschluss eines Spieles ist es dem Fluggast möglich eine neue Runde zu starten durch einen Knopfdruck. |
|AF-05 |Spielhilfe aufrufen |Vor, im Laufe oder nach Beendigung des Spieles, ist es dem Fluggast möglich eine Spielhilfe, mit den Grundlegenden Regeln des Spieles aufzurufen. |
|AF-06 |Spielfeld zurücksetzten|Im Laufe des Spieles, ist es dem Fluggast möglich das Spielfeld zu seinem Ausgangszustand zurückzusetzten.| 

Kann Kriterien:  
|KF Nr|Name|Beschreibung| 
|------|-----|-------------|
|KF-01| Localization| Dem Fluggast ist es möglich, über ein seperates Menü zwischen einer Auswahl an Sprachen auszuwählen|
|KF-02| CI-UI-Anpassung| Den Flugbetreibern ist es möglich die Farben der Spielsteine anzupassen.


#### 3.1.2 Aktivitäten mit Benutzerschnittstelle (UI)

|Anwendungsfall ID | AF-01|
|-------|-------------|
|AF Name| Spiel starten/auswählen   |
|Akteur| Fluggast    |
|Vorbedingungen| Anwendung ist gestartet, Spielmenü wird angezeigt    |
|Auslösendes Ereignis| Auswahl eines Spieles  |
|Nachbedingung Erfolg| Anzeige der Spielmodus Wahl |
|Nachbedingung Fehlschlag| Spiel konnte nicht initialisiert werden, Verbleib im Hauptmenü  |
|Ablauf| Auswahl des Spieles im Hauptmenü    |
|Benutzerschnittstelle| |  

|Anwendungsfall ID| AF-02|
|------|-------------|
|AF Name| Spielmodus wählen  |
|Akteur| Fluggast    |
|Vorbedingungen| Das Spiel "4Connect" wird ausgewählt    |
|Auslösendes Ereignis| Auswahl eines Spielmodus |
|Nachbedingung Erfolg| Spiel wird initialisiert, Spielansicht wird angezeigt  |
|Nachbedingung Fehlschlag| Spiel konnte nicht initialisiert werden, Rückkehr zum Hauptmenü  |
|Ablauf | - Auswahl des Spieles im Hauptmenü   <br/>- Auswahl des Spielmodus( Zwei Spieler oder Bot) <br/>- Initialisierung des Spieles <br/> - Anzeige der Spielansicht |
|Benutzerschnittstelle| |  


|Anwendungsfall ID| AF-03|  
|-----|-------------|
|AF Name| Spielstein setzen   |
|Akteur| Fluggast   |
|Vorbedingungen| Spielansicht geöffnet, Spielstand = laufend   |
|Auslösendes Ereignis| Auswahl einer Spalte durch den Fluggast  |
|Nachbedingung Erfolg| Spielstein platziert, Spielfeld aktualisiert, Spielerwechsel  |
|Nachbedingung Fehlschlag| Ungültige oder volle Spalte, kein Zustandswechsel  |
|Ablauf| - Auswahl einer Spalte  <br/>- Übergabe der Eingabe an den Controller  <br/>- Platzierung des Spielsteins  <br/>- Prüfung auf Spielende (Sieg/Unentschieden)  <br/>- Spielerwechsel      |
|Benutzerschnittstelle| |  

|Anwendungsfall ID| AF-04|
|------|-------------|
|AF Name| Neue Runde starten   |
|Akteur| Fluggast   |
|Vorbedingungen| Spielrunde ist beendet    |
|Auslösendes Ereignis| Bestätigung des "Neue Runde" Schaltstelle |
|Nachbedingung Erfolg| Neue Runde startet mit leerem Spielfeld  |
|Nachbedingung Fehlschlag| Neue Runde konnte nicht gestartet werden  |
|Ablauf| - Anzeige des Endzustands <br/>- Bestätigung der Schaltfläche "Neue Runde"    |
|Benutzerschnittstelle| |  

|Anwendungsfall ID| AF-05|
|-----|-------------|
|AF Name| Spielhilfe aufrufen   |
|Akteur| Fluggast    |
|Vorbedingungen| Spiel oder Hauptmenü ist geöffnet    |
|Auslösendes Ereignis| Auswahl "Spielhilfe"  |
|Nachbedingung Erfolg| Spielhilfe mit Regeln wird angezeigt  |
|Nachbedingung Fehlschlag| Spielhilfe kann nicht angezeigt werden  |
|Ablauf| - Auswahl der Spielhilfe <br/>- Anzeige der grundlegenden Spielregeln      |
|Benutzerschnittstelle| |  

|Anwendungsfall ID| AF-06|
|-----|-------------|
|AF Name| Spielfeld zurücksetzten   |
|Akteur| Fluggast    |
|Vorbedingungen| Ein Spiel ist in Betrieb    |
|Auslösendes Ereignis| Auswahl Schaltfläche "Zurücksetzten"  |
|Nachbedingung Erfolg| Das Spielfeld wird zurückgesetzt auf seinen Ausgangszustand  |
|Nachbedingung Fehlschlag| Spielfeld wird nicht zurückgesetzt  |
|Ablauf| - Auswahl der Schaltfläche "Zurücksetzten" <br/>- Übergabe an den GameController <br/>- Spielfläche wird von den Spielsteinen geleert <br/>- Anzeige des neuen leeren Spielfeldes       |
|Benutzerschnittstelle| |  

#### 3.1.3 Fachliches Klassendiagramm (Domain Model) / Produktdaten

### 3.2 Nichtfunktionale Anforderungen

#### 3.2.1 Benutzbarkeit
**NF-B1 Benutzung**  
Die Anwendung soll Ausschließlich über eien grafische Benutzoberfläche bedient werden. Alle Funktionen müssen über eindeutig beschriftete Bedienelemente erreichbar sein. Die Bedienung soll zudem ohne zusätzliche Schulung möglich sein.

#### 3.2.2 Zuverlässigkeit
**NF-Z1 Zuverlässiger Betrieb**  
Die Anwendung muss während der Nutzung stabil laufen. Ungültige Benutzereingaben dürfen nicht zum Absturz der Anwendung führen. Auch Fehlerhalfte Spielzüge müsse abgefangen werden.

#### 3.2.3 Effizienz
**NF-E1 Effizienz**  
Die Verarbeitung von Benutzereingaben und die Aktualisierung der Benutzoberfläche sollen unmittelbar erfolgen. Spielzüge müssen ohne wahrnehmbare Verzögerung dargestellt werden. Menüwechsel und Anzeigen müssen direkt erfolgen.

#### 3.2.4 Softwarewartung
**NF-W1 Softwarewartung**  
Die Anwendung soll so aufgebaut sein, dass zukünftige Erweiterungen mit geringem Aufwand möglich sind. Erweiterungen an den Sprachen und des Designs sollen ohne grundlegende Änderungen an der Spiellogik möglich sein. Erweiterungen an der Spielesammlung, soll die Logik der anderen Spiele nicht beeinträchtigen oder verändern.

#### 3.2.5 Sicherheit
**NF-S1 Sicherheit**  
Für die Anwendung liegen keine besinderen Sicherheitsanforderungen vor. Es werden zudem keine personenbezogenen Daten dauerhaft gespeichert. Für die Fluggäste ist keine besondere Authentifizierung oder Autorisierung erforderlich.

#### 3.2.6 Normen
**NF-N1 Normen**   
Die Anwendungen ist als Unterhaltungssoftware für Fluggäste konzipiert und ist nicht Bestandteil sicherheitskritischer Flugzeugsysteme. Es besteht keinerlei Anbindung an Flugsteuerungs-, Navigations- oder Kommunikationssysteme. Die Anwenung muss sonst keine gesetzliche Vorgaben erfüllen.


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

















