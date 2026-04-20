package SEG11.IFE_Entertainment.FourConnect;

import java.util.ArrayList;
import java.util.List;

public class FourConnectGame {
    //private GameState State;
    private List<FourConnectPlayer> players = new ArrayList<>();
    private Integer currentPlayerIndex ;
    private FourConnectRules Rules;
    private FourConnectGameBoard gameBoard;

    /**
     * Die Logik dahinter, wenn vom UI kommt welche Spalte ausgewählt wurde, das unterste Feld der Spalte wird mit dem Token
     * des Spielers gespeichert welcher gerade an der Reihe ist
     * @param Column
     * @return
     */
    public Integer dropDisc(Integer Column){
        //todo
        return 0;
    }

    /**
     * Die Funktion wird aufgerufen, wenn der Zug eines Spielers vorbei ist
     * über den currentPlayerIndex, ist der aktuelle Spieler ermittelbar, dies muss so gesetzt werden, dass
     * der nächste Spieler an der Reihe ist
     *
     */
    public void playerTurn(){
        //todo
    }

    /**
     * Init des Spieles, Spielfeldes, Spieler und Botlogik, und was sonst noch dazu gehört
     * @param playerOne
     * @param playerTwo
     * @return
     */
    public Integer initFourConnectGame(Player playerOne, Player playerTwo){
        //todo
        return 0;
    }











}
