package SEG11.IFE_Entertainment.GameCore;

public interface IRuleSet<TIPlayArea, TPlayer> {
	boolean checkWin(TIPlayArea board, TPlayer player);

	boolean checkTie(TIPlayArea board, TPlayer player);
}
