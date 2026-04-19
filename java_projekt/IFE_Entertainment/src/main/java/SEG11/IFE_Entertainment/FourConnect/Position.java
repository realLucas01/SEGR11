/*
 * 1.0 2026-04-19 Luca Tauscher
 *
 * Copyright (c) 2025-2026 Gervithrall Systems GmbH. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Gervithrall Systems GmbH ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Gervithrall Systems GmbH.
 *
 * GERVITHRALL SYSTEMS GMBH MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 * THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. GERVITHRALL SYSTEMS GMBH
 * SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package SEG11.IFE_Entertainment.FourConnect;

import java.util.Objects;

/**
 * Die Position, welche für das Spielfeld genutzt werden umd die Zellen darzustellen
 */
public class Position {
    private final Integer x;
    private final Integer y;

    /**
     * Instantiates a new Position.
     *
     * @param x the x
     * @param y the y
     */
    public Position(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    /**
     * Get x integer.
     *
     * @return the integer
     */
    public Integer getX(){
        return x;
    }

    /**
     * Get y integer.
     *
     * @return the integer
     */
    public Integer getY(){
        return y;
    }

    /**
     * Ich musste die diese beiden Funktionen überschreiben, um die die Positionen des Spielfeldes vergleichen zu können
     * @param o   the reference object with which to compare.
     * @return true oder false
     */
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x.equals(position.x) && y.equals(position.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


}
