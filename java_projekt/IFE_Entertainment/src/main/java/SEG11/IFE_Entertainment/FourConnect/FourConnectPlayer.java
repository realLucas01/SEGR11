package SEG11.IFE_Entertainment.FourConnect;

public class FourConnectPlayer {
    private Player type;
    private FourConnectBotStrategy strategy;
    private String colour;

    public FourConnectPlayer() {
        //todo constructor
    }

    public Player getType(){
        return type;
    }

    public FourConnectBotStrategy getStrategy(){
        return strategy;
    }

    public String getColour(){
        return colour;
    }


}
