package SEG11.IFE_Entertainment.FourConnect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.GameCore.IGame;
import SEG11.IFE_Entertainment.GameCore.IPlayArea;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;

public class FourConnectGame implements IGame {
    private GameState State;
    private FourConnectPlayer[] players;
    private int currentPlayerIndex ;
    private FourConnectRules Rules;
    private FourConnectGameBoard gameBoard;
    
    public FourConnectGame() {
    	State = GameState.NotStarted;
    	players = new FourConnectPlayer[2];
    	currentPlayerIndex = 0;
    }

	@Override
	public GameState getStatus() {
		return State;
	}
	
	@Override
	public void setStatus(GameState state) {
		State = state;
	}

	@Override
	public IPlayArea getBoard() {
		return gameBoard;
	}

	@Override
	public void restart() {
		initFourConnectGame(players[0].getType(),players[1].getType());
	}
	
	public void endGame() {
		State = GameState.NotStarted;
    	players[0] = null;
    	players[1] = null;
    	currentPlayerIndex = 0;
    	gameBoard = null;
	}
	
    /**
     * Die Logik dahinter, wenn vom UI kommt welche Spalte ausgewählt wurde, das unterste Feld der Spalte wird mit dem Token
     * des Spielers gespeichert welcher gerade an der Reihe ist
     * @param Column
     * @return
     */
    public GameState dropDisc(Integer Column){
    	for (int rows = 0 ; rows <= gameBoard.getRows() ; rows++) {
        	if(gameBoard.getCellOwner(new Position(rows,Column)).getType() != Player.NONE) {
        		gameBoard.setCellValue(new Position(rows+1,Column), players[currentPlayerIndex]);
        		break;
        	}
        }
    	if (Rules.checkTie(gameBoard)) {State = GameState.Tied;}
    	if (Rules.checkWin(gameBoard)) {State = GameState.Won;}
		return State;
    }

    /**
     * Die Funktion wird aufgerufen, wenn der Zug eines Spielers vorbei ist.
     * Sie invertiert den Wert von currentPlayerIndex so das nun der andere Spieler über die Liste "players" auffindbar ist
     *
     */
    public void playerTurn(){
    	if (currentPlayerIndex == 0) {
    		currentPlayerIndex = 1;
    	} else {
    		currentPlayerIndex = 0;
    	}
    }

    /**
     * Init des Spieles, Spielfeldes, Spieler und Botlogik, und was sonst noch dazu gehört
     * @param playerOne
     * @param playerTwo
     * @return
     */
    public Integer initFourConnectGame(Player playerOne, Player playerTwo){
        
    	gameBoard = new FourConnectGameBoard();
        
        FourConnectPlayer player1 = new FourConnectPlayer();
        players[0] = player1;
        
        FourConnectPlayer player2 = new FourConnectPlayer();
        players[1] = player2;
        
        currentPlayerIndex = 0;
    	
        State = GameState.Running;
    	return 0;
    }
}