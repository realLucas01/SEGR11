package SEG11.IFE_Entertainment.GameCore;

public interface IGame {
	public void setStatus(GameState state);
	public void restart();
	public GameState getStatus();
	public IPlayArea getBoard();
}
