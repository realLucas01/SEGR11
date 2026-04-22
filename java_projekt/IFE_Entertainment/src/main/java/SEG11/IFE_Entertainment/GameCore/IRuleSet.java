package SEG11.IFE_Entertainment.GameCore;

public interface IRuleSet<TIPlayArea,TPlayer> {
	public boolean checkWin(TIPlayArea board,TPlayer player);
	public boolean checkTie(TIPlayArea board,TPlayer player);
}
