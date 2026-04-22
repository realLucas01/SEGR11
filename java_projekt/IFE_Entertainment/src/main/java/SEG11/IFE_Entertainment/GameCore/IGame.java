package SEG11.IFE_Entertainment.GameCore;

public interface IGame {
	void setStatus(GameState state);

	void restart();

	GameState getStatus();

	IPlayArea getBoard();
}
