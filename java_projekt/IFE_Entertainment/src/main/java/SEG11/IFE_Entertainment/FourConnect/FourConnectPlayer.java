package SEG11.IFE_Entertainment.FourConnect;

/**
 * Der Vier gewinnt Spieler
 */
public class FourConnectPlayer {
    private Player type;
    private FourConnectBotStrategy strategy;
    private String colour;

    /**
     * Standardkonstruktor
     */
    public FourConnectPlayer(Player type, FourConnectBotStrategy strategy, String colour) {
        this.type = type;
        if(type.equals(Player.BOT)){
            this.strategy = strategy;
        } else {
            this.strategy = null;
        }
        this.colour = colour;
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
     * Wenn vorhanden, gibt es der verwendete Bot Strategy zurück
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
