package SEG11.IFE_Entertainment.FourConnect;

/**
 * Die Position, welche für das Spielfeld genutzt werden umd die Zellen
 * darzustellen
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
	public Position(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get x integer.
	 *
	 * @return the integer
	 */
	public Integer getX() {
		return x;
	}

	/**
	 * Get y integer.
	 *
	 * @return the integer
	 */
	public Integer getY() {
		return y;
	}

}
