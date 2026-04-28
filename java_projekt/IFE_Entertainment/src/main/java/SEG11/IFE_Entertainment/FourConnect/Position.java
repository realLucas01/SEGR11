/*
 * 1.0 2026-04-19 Luca Tauscher
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Gervithrall Systems GmbH
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with Gervithrall
 * Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package SEG11.IFE_Entertainment.FourConnect;

import java.util.Objects;

/**
 * Die Position, welche für das Spielfeld genutzt werden, um die Zellen darzustellen
 */
public class Position {
  private final Integer x;
  private final Integer y;

  /**
   * Konstuktor für Position
   *
   * @param x, die x-Achse
   * @param y, die y-Achse
   */
  public Position(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Gibt die X Koordinate zurück
   *
   * @return den Integer Wert
   */
  public Integer getX() {
    return x;
  }

  /**
   * Gibt die Y Koordinate zurück
   *
   * @return den Integer Wert
   */
  public Integer getY() {
    return y;
  }

  /**
   * Funktion um zwei Position Objekte zu vergleichen
   *
   * <p>Überschrieben so, dass die Vergleichsfunktion auch für die Positionen innerhalb der Map
   * verwendbar ist.
   * 
   * @param o, das Referenzobjekt mit dem es verglichen werden soll
   * @return true oder false
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Position position = (Position) o;
    return x.equals(position.x) && y.equals(position.y);
  }

  /**
   * <p>Gibt den HashCode des Objektes zurück
   *
   * @return HashCode
   */
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }


}
