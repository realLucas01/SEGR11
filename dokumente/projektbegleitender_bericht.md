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

//todo

## 1. Einleitung und Projektüberblick  

Dieser projektbegleitende Bericht dokumentiert den aktuellen Stand des Projekts zur Entwicklung einer Entertainment-Erweiterung für ein Inflight-Entertainment-System. Ziel des Berichts ist es, den bisherigen Projektverlauf, die Aufgabenverteilung innerhalb des Teams sowie den aktuellen Entwicklungsstand darzustellen.  

Im Rahmen des Projekts wird eine offlinefähige und modular erweiterbare Spielesammlung entwickelt, die in ein bestehendes Inflight-Entertainment-System integriert werden soll. Als erster konkreter Anwendungsfall wird das Spiel "4-Gewinnt" umgesetzt, welches sowohl im Einzelspieler- als auch im Mehrspielermodus genutzt werden kann.  

## 2. Projektplanung  

Die zeitliche Planung des Projekts erfolgte anhand eines Gantt-Diagramms, welches die einzelnen Arbeitspakete sowie deren zeitliche Abfolge darstellt. Die Arbeitspakete spiegeln hier die Kategorien aus dem Dokument [Kalkulation für die Entwicklung einer Entertainment-Erweiterung speziell für IFE](/final/kalkulation.pdf) wieder.  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Das Gantt-Diagramm selber ist unter [hier Sektion] bzw. in der PDF-Version, aufgrund seiner Größe, der letzten Seite zu finden.  

Die Planung orientiert sich an einem iterativen Vorgehen, bei dem die Entwicklung in mehrere Phasen unterteilt wurde. Dazu zählen insbesondere die Konzeption, die Implementierung des Spielkerns sowie die anschließende Test- und Integrationsphase. Ziel dieser Planung war es, frühzeitig eine lauffähige Version der Anwendung zu erreichen, um diese in einer realen Umgebung testen zu können.  

## 3. Bisherige Durchführung und aktueller Stand  

Die bisherige Projektdurchführung umfasste die Konzeption, die Erstellung eines technischen Grundgerüsts sowie die Implementierung zentraler Spielfunktionen. Insbesondere wurde die grundlegende Modularisierung von Spiellogik und Benutzeroberfläche umgesetzt, einschließlich des ersten Spiels in der Sammlung: "4-Gewinnt".  

Parallel dazu wurde die Benutzeroberfläche entwickelt, um eine intuitive Bedienung über Touch-Eingaben zu gewährleisten. Die Entwicklung erfolgte iterativ, sodass einzelne Funktionen schrittweise implementiert und getestet werden konnten.  

Nach dem aktuellen Stand wurden alle Muss-Kriterien des Pflichtenhefts abgeschlossen, sowie die Kann-Kriterien KK100 "Anzeigesprache" und KK200 "Schwierigkeitsstufen". Das Kann-Kriterium KK101 "CI-Anpassung" wurde zwar begonnen aber konnte aufgrund von Ausfällen eines Teammitglieds in der Entwicklungsphase nicht fertiggestellt werden.  
→ Siehe [Pflichtenheft](/final/pflichtenheft.pdf)  
<sup> *(auch hier zu finden: `/final/pflichtenheft.pdf`)* </sup>  

## 4. Arbeitsaufwand und Teamverteilung  

Zur Nachvollziehbarkeit des Projektaufwands wurde der zeitliche Einsatz der einzelnen Teammitglieder erfasst und den jeweiligen Projektkategorien zugeordnet. Die Kategorisierung orientiert sich an der zuvor erstellten Kalkulation (z. B. Konzeption, Implementierung, UI/UX, Testphase, usw...).  
→ Siehe [Kalkulation](/final/kalkulation.pdf)  
<sup> *(auch hier zu finden: `/final/kalkulation.pdf`)* </sup>  

Die folgende Tabelle zeigt, welches Teammitglied wie viele Stunden in den jeweiligen Kategorien geleistet hat:  
|Teammitglied/Kategorie nach Kalkulation |Konzeption |Prototyp & Spielkern |Gameplay-Implementierungen |Botgegner &Schwierigkeitsstufen |UI/UX Nutzerf�hrung |Summe |
|--------------------------------------------------|---------------------|---------------------|--------------------------|-------------------------------|---------------------|------|
|Dauer der Phase                                   |16.12.2025-23.01.2026|16.03.2026-08.04.2026|09.04.2026-26.04.2026     |09.04.2026-30.04.2026          |15.04.2026-05.05.2026|      |
|Luca                                              |14h                  |6h                   |10h30                     |10h                            |-                    |40h30 |
|Domenik                                           |9h                   |8h                   |-                         |-                              |5h30                 |22h30 |
|Long                                              |10h                  |7h                   |-                         |-                              |17h                  |34h   |
|Lucas                                             |18h                  |11h45                |14h                       |1h30                           |1h30                 |46h45 |
|Marc                                              |15h                  |6h30                 |-                         |-                              |30min                |22h   |
|Summe                                             |66h                  |39h15                |24h30                     |10h                            |24h30                |164h15|

<sup> *(Es ist zu beachten, dass die bisher erfassten Stunden innerhalb der Tabelle, und in allen folgenden Referenzen auf die Tabelle, lediglich einen Zwischenstand darstellen, da sich das Projekt aktuell noch in der Entwicklungs- und Integrationsphase befindet. Weitere Aufwände, insbesondere im Bereich Testing, Optimierung und Anpassung basierend auf Feedback des Auftraggebers, sind zu erwarten.)* </sup>  

Insgesamt wurden im bisherigen Projektverlauf 164 Stunden und 15 Minuten erfasst. Der größte Anteil entfällt auf die Konzeptionsphase (66h), gefolgt von der Entwicklung des Prototyps und Spielkerns (39h15). Die Gameplay-Implementierungen (24h30) sowie die UI/UX-Entwicklung (24h30) liegen aktuell auf einem ähnlichen Niveau, während die Entwicklung des Botgegners mit 10 Stunden einen vergleichsweise geringeren Anteil einnimmt.  

Auffällig ist, dass ein großer Teil des Aufwands in die frühen Projektphasen investiert wurde. Dies ist darauf zurückzuführen, dass eine solide konzeptionelle und technische Grundlage entscheidend für den weiteren Projektverlauf und vorallem die angestrebte Modularität ist. Die vergleichsweise geringeren Aufwände in den Bereichen Botentwicklung und UI/UX lassen sich dadurch erklären, dass diese Komponenten größtenteils parallel entstanden sind.  

Insgesamt zeigt die Stundenverteilung einen strukturierten Projektverlauf mit einem klaren Fokus auf die schrittweise Erweiterung der Funktionalität.  
