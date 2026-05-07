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
3. [Bisherige Durchführung und aktueller Stand](3-bisherige-durchführung-und-aktueller-stand)
4. [Arbeitsaufwand und Teamverteilung](4-arbeitsaufwand-und-teamverteilung)
5. [Gantt-Diagramm](5-Gantt-Diagramm)

## 1. Einleitung und Projektüberblick  

Dieser projektbegleitende Bericht dokumentiert den aktuellen Stand des Projekts zur Entwicklung einer Entertainment-Erweiterung für ein Inflight-Entertainment-System. Ziel des Berichts ist es, den bisherigen Projektverlauf, die Aufgabenverteilung innerhalb des Teams sowie den aktuellen Entwicklungsstand darzustellen.  

Im Rahmen des Projekts wird eine offlinefähige und modular erweiterbare Spielesammlung entwickelt, die in ein bestehendes Inflight-Entertainment-System integriert werden soll. Als erster konkreter Anwendungsfall wird das Spiel "Vier-Gewinnt" umgesetzt, welches sowohl im Einzelspieler- als auch im Mehrspielermodus genutzt werden kann.  

## 2. Projektplanung  

Die zeitliche Planung des Projekts erfolgt anhand eines Gantt-Diagramms, welches die einzelnen Arbeitspakete sowie deren zeitliche Abfolge darstellt. Die Arbeitspakete spiegeln hier die Kategorien aus dem Dokument [Kalkulation für die Entwicklung einer Entertainment-Erweiterung speziell für IFE](/final/kalkulation.pdf) wieder.  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Das Gantt-Diagramm selber ist unter [Gantt-Diagramm](5-Gantt-Diagramm) bzw. in der PDF-Version, aufgrund seiner Größe, der letzten Seite zu finden.  
<sup> *(und als last-Resort auch hier: `/final/projekt-gantt.png`)* </sup>  

Die Planung orientiert sich an einem iterativen Vorgehen, bei dem die Entwicklung in mehrere Phasen unterteilt wurde. Dazu zählen insbesondere die Konzeption, die Implementierung des Spielkerns, der Botgegner und des UI's sowie die anschließende Test- und Integrationsphase. Ziel dieser Planung war es, frühzeitig eine lauffähige Version der Anwendung zu erreichen, um diese in einer realen Umgebung testen zu können.  

## 3. Bisherige Durchführung und aktueller Stand  

Die bisherige Projektdurchführung umfasste die Konzeption, die Erstellung eines technischen Grundgerüsts sowie die Implementierung zentraler Spielfunktionen. Insbesondere wurde die grundlegende Modularisierung von Spiellogik und Benutzeroberfläche umgesetzt, einschließlich des ersten Spiels in der Sammlung: "Vier-Gewinnt".  

Parallel dazu wurde die Benutzeroberfläche entwickelt, um eine intuitive Bedienung über Touch-Eingaben zu gewährleisten. Die Entwicklung erfolgte iterativ, sodass einzelne Funktionen schrittweise implementiert und getestet werden konnten.  

Nach dem aktuellen Stand wurden alle Muss-Kriterien des Pflichtenhefts abgeschlossen, sowie die Kann-Kriterien KK100 "Anzeigesprache" und KK200 "Schwierigkeitsstufen". Das Kann-Kriterium KK101 "CI-Anpassung" wurde zwar begonnen aber konnte aufgrund von Ausfällen eines Teammitglieds in der Entwicklungsphase nicht fertiggestellt werden.  
→ Siehe [Pflichtenheft](/final/pflichtenheft.pdf)  
<sup> *(auch hier zu finden: `/final/pflichtenheft.pdf`)* </sup>  

## 4. Arbeitsaufwand und Teamverteilung  

Zur Nachvollziehbarkeit des Projektaufwands wurde der zeitliche Einsatz der einzelnen Teammitglieder erfasst und den jeweiligen Projektkategorien zugeordnet. Die Kategorisierung orientiert sich dafür an der zuvor erstellten Kalkulation.  
→ Siehe [Kalkulation](/final/kalkulation.pdf)  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Die folgende Tabelle zeigt, welches Teammitglied wie viele Stunden in den jeweiligen Kategorien geleistet hat, es ist zu beachten das aufgrund der begrenzten größe des Tabellenkopfes einige Kategorien im Namen etwas eingekürzt werden mussten:  
|Teammitglied/Kat. nach Kalkulation |Konzeption           |Prototyp & Spielkern |Gameplay-Impl.       |Botgegner            |UI/UX                |Stabilisierung & Integration|Testphase & Feinschliff|Doku & Abnahme       |Risikomanagement     |Summe   |
|-----------------------------------|---------------------|---------------------|---------------------|---------------------|---------------------|----------------------------|-----------------------|---------------------|---------------------|--------|
|Dauer der Phase                    |16.12.2025-23.01.2026|16.03.2026-08.04.2026|09.04.2026-26.04.2026|09.04.2026-30.04.2026|15.04.2026-05.05.2026| -                          |28.04.2026-07.05.2026  |09.04.2026-07.05.2026|26.01.2026-07.05.2026| -      |
|Luca Tauscher                      |14h                  |4h30min              |5h30min              |11h                  |4h30min              | -                          |8h30min                |16h30min             |2h30min              |67h     |
|Domenik Schütz                     |9h                   |9h15min              |30min                |30min                |12h                  | -                          |10h                    |2h                   | -                   |43h15min|
|Truong Tan Long Nguyen             |10h                  |7h                   |-                    |-                    |16h                  | -                          |10h30min               |3h30                 | -                   |47h     |
|Lucas Rumann                       |18h                  |15h                  |10h                  |1h45min              |9h45min              | -                          |4h30min                |11h                  |16h45min             |86h45min|
|Marc Müller                        |8h30min              |9h30min              |-                    |-                    |6h                   | -                          |2h                     |8h                   | -                   |34h     |
|Summe                              |66h                  |45h15min             |16h                  |13h15min             |48h15min             | -                          |35h30min               |41h                  |19h15min             |278h    |

<sup> *(Es ist zu beachten, dass die bisher erfassten Stunden innerhalb der Tabelle, und in allen folgenden Referenzen auf die Tabelle, lediglich einen Zwischenstand darstellen, da sich das Projekt aktuell noch in der Entwicklungs- und Integrationsphase befindet. Weitere Aufwände, insbesondere im Bereich Testing, Optimierung und Anpassung basierend auf Feedback des Auftraggebers, sind zu erwarten.)* </sup>  

Insgesamt wurden im bisherigen Projektverlauf 278 Arbeitsstunden erfasst.  

Der größte Anteil entfällt aktuell auf die Konzeptionsphase (66h) sowie auf den Bereich Prototyp & Spielkern (45h15min). Dies zeigt, dass in den bisherigen Projektphasen insbesondere die technische Grundlage sowie die Projektstruktur im Fokus standen.  

Für die Bereiche UI/UX Nutzerführung (48h15min), Testphase & Feinschliff (35h30min) sowie Dokumentation & Abnahme (41h) wurde ebenfalls bereits ein signifikanter Aufwand investiert. Die vergleichsweise geringeren Aufwände in den Bereichen Gameplay-Implementierungen (16h) und Botgegner (13h15min) ergeben sich daraus, dass diese Funktionen schrittweise iterativ erweitert werden.  

Die Stundenverteilung orientiert sich dabei weitgehend an den zuvor definierten Rollen aus der Kalkulation:

- **Lucas Rumann (Projektmanager):** übernimmt mit 86h45min den größten Anteil und ist hauptsächlich für konzeptionelle, organisatorische sowie koordinierende Aufgaben verantwortlich. Zusätzlich unterstützt er mehrere technische Bereiche.  
- **Luca Tauscher (Senior Software Engineer):** leistet mit 67h einen wesentlichen Beitrag zur technischen Umsetzung der Spiellogik sowie der Kernfunktionen.  
- **Truong Tan Long Nguyen (Junior UX Engineer):** ist mit 47h überwiegend in den Bereichen UI/UX & Benutzerführung sowie Testing tätig.
- **Domenik Schütz (Finances & Software Engineer):** unterstützt mit 43h15min insbesondere in den Bereichen Prototypentwicklung, UI/UX sowie Testing.
- **Marc Müller (Designer):** bringt mit 34h hauptsächlich gestalterische und konzeptionelle Leistungen in das Projekt ein.

Insgesamt entspricht die bisherige Aufgabenverteilung weitgehend der ursprünglich geplanten Rollenverteilung aus der Kalkulation.

## 5 Gantt-Diagramm

![Gantt-Diagramm](/final/projekt-gantt.png)

**Hinweis:** Das Gantt wurde mithilfe folgender Website erstellt: https://www.onlinegantt.com/#/gantt.  

*Ursprünglich war das Diagramm auch interaktiv, so dass z.B.: auch mit der Maus über die Balken gehovert werden konnte, um genauere Informationen, wie das exakte Start- und Enddatum zu sehen. Diese Interaktivität und auch Übersichtlichkeit ist leider beim Export in eine .png verloren gegangen. Um sich das Diagramm dennoch interaktiv anschauen zu können befindet sich die Projektdatei des Gantt unter folgendem Pfad: `/final/projekt-gantt.gantt`.  
Diese kann auf der Website über zwei simple Klicks auf den Button `Open(.gantt file)` und das anschließende Auswählen der `projekt-gantt.gantt` schnell und einfach geladen werden.*
