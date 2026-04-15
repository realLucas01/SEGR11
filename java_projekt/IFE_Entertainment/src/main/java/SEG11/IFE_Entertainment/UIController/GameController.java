package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

public interface GameController {
	public void restartGame() throws IOException;
	public void backToMainMenu() throws IOException;
	public void openHelp() throws IOException;
}
