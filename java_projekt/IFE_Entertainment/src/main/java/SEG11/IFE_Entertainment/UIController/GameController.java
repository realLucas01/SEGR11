package SEG11.IFE_Entertainment.UIController;

import java.io.IOException;

/**
 * Interface für den Gamecontroller
 *
 * <p>Definiert die Funktionen während des Spieles
 */
public interface GameController {
	void restartGame() throws IOException;
	void backToMainMenu() throws IOException;
	void openHelp() throws IOException;
}
