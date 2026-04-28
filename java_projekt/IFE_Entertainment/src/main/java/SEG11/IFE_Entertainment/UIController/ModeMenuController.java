package SEG11.IFE_Entertainment.UIController;

import SEG11.IFE_Entertainment.App;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.UIGameController.FourConnectGameController;
import javafx.fxml.FXML;
import java.io.IOException;

/**
 * Controller für die Modusauswahl.
 *
 * <p>Ermöglicht die Auswahl des Spielmodus und startet das Spiel
 * mit den entsprechenden Spielertypen.
 */
public class ModeMenuController {

    /**
     * Startet ein Spiel im Zwei-Spieler-Modus.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGame() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HUMAN);
    }

    /**
     * Startet ein Spiel gegen den einfachen Bot.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGameEasyBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.EASYBOT);
    }

    /**
     * Startet ein Spiel gegen den schweren Bot.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void startGameHardBot() throws IOException {
        FourConnectGameController controller = App.setRootAndGetController("FourConnectGame");
        controller.handlePlayMode(Player.HUMAN, Player.HARDBOT);
    }

    /**
     * Navigiert zurück zum Hauptmenü.
     *
     * @throws IOException falls die FXML-Datei nicht geladen werden kann
     */
    @FXML
    public void backToMainMenu() throws IOException {
        App.setRoot("MainMenu");
    }
}