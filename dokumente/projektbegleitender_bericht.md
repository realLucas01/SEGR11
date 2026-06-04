## Entwicklung einer Entertainment-Erweiterung speziell für IFE
**Stand:** 21.01.2025  

**Auftraggeber:** Novaris Cabin Systems GmbH  
Friedrich-List-Platz 1   
01069 Dresden  
**Ansprechpartner*in:** Lea Wagner  
**E-Mail:** lwagner@novaris-cabinystems.de   
**Telefon:** 0351 4620   

**Auftragnehmer:** Gervithrall Systems GmbH   
Perlickstraße 1   
04103 Leipzig   
**Ansprechpartner*in:** Lucas Rumann   
**E-Mail:** lucasr@gervithrall-systems.de   
**Telefon:** 0351 6482642   

---

# Inhaltsverzeichnis

1. [Einleitung und Projektüberblick](1-einleitung-und-projektüberblick)
2. [Projektplanung](2-projektplanung)
3. [Durchführung seit Projektstart und Stand beim ersten Deployment des Prototypen](3-durchführung-seit-projektstart-und-stand-beim-ersten-deployment-des-prototypen)
4. [Durchführung seit Deployment und Stand bei Projektabschluss](4-durchführung-seit-deployment-und-stand-bei-projektabschluss)
5. [Arbeitsaufwand und Teamverteilung](5-arbeitsaufwand-und-teamverteilung)
6. [Gantt-Diagramm](6-Gantt-Diagramm)

## 1. Einleitung und Projektüberblick  

Dieser projektbegleitende Bericht dokumentiert den aktuellen Stand des Projektes zur Entwicklung einer Entertainment-Erweiterung für ein Inflight-Entertainment-System. Ziel des Berichts ist es, den bisherigen Projektverlauf, die Aufgabenverteilung innerhalb des Teams sowie den aktuellen Entwicklungsstand darzustellen.  

Im Rahmen des Projektes wird eine offlinefähige und modular erweiterbare Spielesammlung entwickelt, die in ein bestehendes Inflight-Entertainment-System integriert werden soll. Als erster konkreter Anwendungsfall wird das Spiel "Vier-Gewinnt" umgesetzt, welches sowohl im Einzelspieler- als auch im lokalen Mehrspielermodus genutzt werden kann.  

## 2. Projektplanung  

Die zeitliche Planung des Projektes erfolgt anhand eines Gantt-Diagramms, welches die einzelnen Arbeitspakete sowie deren zeitliche Abfolge darstellt. Die Arbeitspakete spiegeln hier die Kategorien aus dem Dokument [Kalkulation für die Entwicklung einer Entertainment-Erweiterung speziell für IFE](/final/kalkulation.pdf) wieder.  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Das Gantt-Diagramm selbst ist unter [Gantt-Diagramm](6-Gantt-Diagramm) bzw. in der PDF bzw. Druck-Version, aufgrund seiner Größe, der letzten Seite zu finden.  
<sup> *(und als last-Resort auch hier: `/final/projekt-gantt.png`)* </sup>  

Die Planung orientiert sich an einem iterativen Vorgehen, bei dem die Entwicklung in mehrere Phasen unterteilt wurde. Dazu zählen insbesondere die Konzeption, die Implementierung des Spielkerns, der Botgegner und des UI's sowie die anschließende Test- und Integrationsphase. Ziel dieser Planung war es, frühzeitig eine lauffähige Version der Anwendung zu erreichen, um diese in einer realen Umgebung testen zu können.  

## 3. Durchführung seit Projektstart und Stand beim ersten Deployment des Prototypen

Die bisherige Projektdurchführung umfasste die Konzeption, die Erstellung eines technischen Grundgerüsts sowie die Implementierung zentraler Spielfunktionen. Insbesondere wurde die grundlegende Modularisierung von Spiellogik und Benutzeroberfläche umgesetzt, einschließlich des ersten Spiels in der Sammlung: Vier-Gewinnt.  

Parallel dazu wurde die Benutzeroberfläche entwickelt, um eine intuitive Bedienung über Touch-Eingaben zu gewährleisten. Die Entwicklung erfolgte iterativ, sodass einzelne Funktionen schrittweise implementiert und getestet werden konnten.  

Nach dem aktuellen Stand wurden alle Muss-Kriterien des Pflichtenhefts abgeschlossen, sowie die Kann-Kriterien KK100 "Anzeigesprache" und KK200 "Schwierigkeitsstufen". Das Kann-Kriterium KK101 "CI-Anpassung" wurde zwar begonnen aber konnte aufgrund von Ausfällen eines Teammitgliedes in der Entwicklungsphase nicht fertiggestellt werden.  
→ Siehe [Pflichtenheft](/final/pflichtenheft.pdf)  
<sup> *(auch hier zu finden: `/final/pflichtenheft.pdf`)* </sup>  

## 4. Durchführung seit Deployment und Stand bei Projektabschluss  

Nach dem ersten Deployment des Prototyps beim Auftraggeber konnte die Anwendung erfolgreich in die Zielumgebung integriert werden. Die Bereitstellung verlief problemlos, da während der Entwicklung kontinuierlich auf dem bereitgestellten Dev-Kit getestet wurde. Im Rahmen der anschließenden Erprobung durch die Mitarbeitenden des Auftraggebers wurden einige kleinere Fehler identifiziert, die während der internen Testphasen nicht aufgefallen waren. Diese wurden dokumentiert, priorisiert und zeitnah behoben. Die Rückmeldungen des Auftraggebers wurden darüber hinaus genutzt, um weitere Optimierungen und Verbesserungen an der Anwendung vorzunehmen.  

Zum Zeitpunkt der Projektabgabe sind sämtliche im Pflichtenheft definierten Muss-Kriterien vollständig umgesetzt. Auch die während der Projektlaufzeit zusätzlich durch den Auftraggeber definierte Anforderung, MK208 "Gewinnkombination anzeigen", wurde erfolgreich umgesetzt und in die Anwendung integriert.  

Das bei Deployment noch unfertige Kann-Kriterium KK101 "CI-Anpassung" ist nun vollständig implementiert und wird mit einigen Dummy-Daten ausgeliefert. Zur Erstellung eigener Themes wird auf die Sektion 6.1 "Branding (CI-Anpassung)" in der [Administratordokumentation](/final/admindoku.pdf) verwiesen. Darüber hinaus konnten die bereits zum Zeitpunkt des ersten Deployments erfüllten Kann-Kriterien weiter stabilisiert und vervollständigt werden. Damit sind alle Kann-Kriterien, bis auf KK102 "Animationen" umgesetzt, dieses wird nach weiterer Evaluation im Rahmen dieses Projektes nicht implementiert.  
→ Siehe [Pflichtenheft](/final/pflichtenheft.pdf)  
<sup> *(auch hier zu finden: `/final/pflichtenheft.pdf`, und `/final/admindoku.pdf` für die Administratordokumentation)* </sup>  

Neben der funktionalen Fertigstellung wurden die abschließenden Arbeiten in den Bereichen Testphase, Feinschliff, Dokumentation und Abnahmevorbereitung durchgeführt. Die Anwendung wurde umfassend getestet, dokumentiert und für die finale Übergabe vorbereitet. Damit sind sämtliche in der Kalkulation vorgesehenen Projektkategorien fachlich und arbeitstechnisch abgeschlossen.  

Mit der erfolgreichen Projektabgabe steht dem Auftraggeber eine vollständig lauffähige, offlinefähige und modular erweiterbare Spielesammlung für den Einsatz innerhalb des Inflight-Entertainment-Systems zur Verfügung. Die entwickelte Architektur ermöglicht dabei die zukünftige Integration weiterer Spiele mit vergleichsweise geringem Entwicklungsaufwand.  


## 5. Arbeitsaufwand und Teamverteilung  

Zur Nachvollziehbarkeit des Projektaufwands wurde der zeitliche Einsatz der einzelnen Teammitglieder erfasst und den jeweiligen Projektkategorien zugeordnet. Die Kategorisierung orientiert sich dafür an der zuvor erstellten Kalkulation.  
→ Siehe [Kalkulation](/final/kalkulation.pdf)  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Die folgende Tabelle zeigt, welches Teammitglied wie viele Stunden in den jeweiligen Kategorien geleistet hat :  
|Teammitglied/Kat. nach Kalkulation |Konzeption           |Prototyp & Spielkern |Gameplay-Impl.       |Botgegner            |UI/UX                |Stabilisierung & Integration|Testphase & Feinschliff|Doku & Abnahme       |Risikomanagement     |Summe    |
|-----------------------------------|---------------------|---------------------|---------------------|---------------------|---------------------|----------------------------|-----------------------|---------------------|---------------------|---------|
|Dauer der Phase                    |16.12.2025-23.01.2026|16.03.2026-08.04.2026|09.04.2026-26.04.2026|09.04.2026-30.04.2026|15.04.2026-07.05.2026|08.05.2026-04.06.2026       |28.04.2026-04.06.2026  |09.04.2026-04.06.2026|26.01.2026-04.06.2026| -       |
|Luca Tauscher                      |14h                  |4h30min              |5h30min              |11h                  |5h                   | 2h                         |17h30min               |21h30min             |3h30min              |84h30min |
|Domenik Schütz                     |9h                   |9h15min              |30min                |30min                |12h                  | -                          |15h                    |8h                   | -                   |54h15min |
|Truong Tan Long Nguyen             |10h                  |7h                   |-                    |-                    |16h30min             | -                          |20h                    |7h30min              | -                   |61h      |
|Lucas Rumann                       |18h                  |15h                  |10h                  |1h45min              |9h45min              | 6h15min                    |16h30min               |15h15min             |25h                  |117h30min|
|Marc Müller                        |8h30min              |9h30min              |-                    |-                    |6h                   | 11h30min                   |2h30min                |22h30min             | -                   |60h30min |
|Summe                              |59h30min             |45h15min             |16h                  |13h15min             |49h15min             | 19h45min                   |71h30min               |74h45min             |28h30min             |377h45min|

<sup> *(es ist zu beachten das aufgrund der begrenzten Größe des Tabellenkopfes einige Kategorien im Namen etwas eingekürzt werden mussten)* </sup>  

Insgesamt wurden im Projektverlauf **377 Stunden und 45 Minuten** erfasst. Der größte Anteil entfiel auf die Bereiche **Dokumentation & Abnahme (74h45min)** sowie **Testphase & Feinschliff (71h30min)**. Dies verdeutlicht den hohen Aufwand, der gegen Ende des Projektes für Qualitätssicherung, Fehlerbehebung, Optimierungen sowie die Vorbereitung der Projektübergabe erforderlich war.

Auch die frühen Projektphasen nahmen einen bedeutenden Anteil ein. Für die **Konzeption (59h30min)** sowie den Bereich **Prototyp & Spielkern (45h15min)** wurden zusammen über 100 Arbeitsstunden aufgewendet. Dies unterstreicht die Bedeutung einer fundierten Planung und einer stabilen technischen Grundlage für den weiteren Projektverlauf.

Die Stundenverteilung orientiert sich insgesamt an den ursprünglich definierten Rollen aus der Kalkulation. 
- **Lucas Rumann (Projektmanager)** übernahm mit **117h30min** den größten Anteil und war insbesondere für Konzeption, Projektkoordination, Risikomanagement sowie technische Unterstützung verantwortlich.
- **Luca Tauscher (Senior Software Engineer)** leistete mit **84h30min** den größten Beitrag zur technischen Umsetzung und war maßgeblich an Entwicklung, Testing und Dokumentation beteiligt.
- **Truong Tan Long Nguyen (Junior UX Engineer)** konzentrierte sich mit **61h** vor allem auf die Benutzerführung und die Testphase.
- **Marc Müller (Designer)** brachte mit **60h30min** insbesondere gestalterische Leistungen sowie Beiträge zur Integration und Dokumentation ein.
- **Domenik Schütz (Finances & Software Engineer)** unterstützte mit **54h15min** vor allem die technische Umsetzung sowie die Test- und Dokumentationsphase.

Insgesamt zeigt die Stundenverteilung, dass die Aufgaben größtenteils entsprechend der jeweiligen Projektrollen bearbeitet wurden. Die Unterschiede im zeitlichen Aufwand ergeben sich dabei aus verschiedenen Gründen, aber vorallem aus den unterschiedlichen Verantwortungsbereichen innerhalb des Projektes, sowie dem unterschiedlichen Erfahrungsstand der Projektmitglieder und den daraus resultierenden zusätzlichen Koordinations- und Unterstützungsaufgaben einzelner Teammitglieder.


## 6 Gantt-Diagramm

![Gantt-Diagramm](/final/projekt-gantt.png)

**Hinweis:** Das Gantt wurde mithilfe folgender Website erstellt: https://www.onlinegantt.com/#/gantt.  

*Ursprünglich war das Diagramm auch interaktiv, so dass z.B.: auch mit der Maus über die Balken gehovert werden konnte, um genauere Informationen, wie das exakte Start- und Enddatum zu sehen. Diese Interaktivität und auch Übersichtlichkeit ist leider beim Export in eine .png verloren gegangen. Um sich das Diagramm dennoch interaktiv anschauen zu können befindet sich die Projektdatei des Gantt unter folgendem Pfad: `/final/projekt-gantt.gantt`.  
Diese kann auf der Website über zwei simple Klicks auf den Button `Open(.gantt file)` und das anschließende Auswählen der `projekt-gantt.gantt` schnell und einfach geladen werden.*
