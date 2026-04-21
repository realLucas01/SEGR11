package SEG11.IFE_Entertainment.FourConnect;

/**
 * The type Four connect player.
 */
public class FourConnectPlayer {
    private Player type;
    private FourConnectBotStrategy strategy;
    private String colour;

    /**
     * Standardkonstruktor
     */
    public FourConnectPlayer() {
        //todo constructor
    }

    /**
     * Gibt den Typ des Spielers zurück
     *
     * @return der Spieler
     */
    public Player getType(){
        return type;
    }

    /**
     * Wenn vorhanden, gibt es die verwendete Bot Strategy zurück
     *
     * @return die Bot Strategy
     */
    public FourConnectBotStrategy getStrategy(){
        return strategy;
    }

    /**
     * Gibt die Farbe für den Spieler zurück
     *
     * @return die Farbe
     */
    public String getColour(){
        return colour;
    }


}
