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
