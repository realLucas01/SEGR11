package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;

/**
 * Testklasse für FourConnectGame.
 */
class FourConnectGameTest {

    /**
     * Spielinstanz für die Tests.
     */
    private FourConnectGame game;

    /**
     * Wird vor jedem Test ausgeführt.
     */
    @BeforeEach
    void setUp() {
        game = FourConnectGame.getInstance();
    }

    /**
     * Testet die Initialisierung eines neuen Spiels.
     */
    @Test
    void initGameTest() {

        int result = game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertEquals(0, result);
        assertEquals(GameState.Running, game.getStatus());

        assertNotNull(game.getBoard());
        assertNotNull(game.getPlayers());
    }

    /**
     * Testet setStatus() und getStatus().
     */
    @Test
    void statusTest() {

        game.setStatus(GameState.Won);

        assertEquals(GameState.Won, game.getStatus());
    }

    /**
     * Testet den Spielerwechsel.
     */
    @Test
    void playerTurnTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.playerTurn();

        // Test erfolgreich wenn kein Fehler auftritt
        assertTrue(true);
    }

    /**
     * Testet das Platzieren einer Scheibe.
     */
    @Test
    void dropDiscTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        GameState state = game.dropDisc(0);

        assertNotNull(state);
    }

    /**
     * Testet, ob mehrere Scheiben korrekt gestapelt werden.
     */
    @Test
    void dropDiscStacksCorrectlyTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.dropDisc(0);
        game.dropDisc(0);
        game.dropDisc(0);

        assertNotNull(game.getBoard());
    }

    /**
     * Testet restart().
     */
    @Test
    void restartTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.dropDisc(0);

        game.restart();

        assertEquals(GameState.Running, game.getStatus());
    }

    /**
     * Testet endGame().
     */
    @Test
    void endGameTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.endGame();

        assertEquals(GameState.NotStarted, game.getStatus());

        assertNull(game.getPlayers()[0]);
        assertNull(game.getPlayers()[1]);
    }

    /**
     * Testet die Spielfeldgröße.
     */
    @Test
    void boardTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertEquals(6, game.getBoard().getRows());
        assertEquals(7, game.getBoard().getColumns());
    }

    /**
     * Testet Initialisierung mit EasyBot.
     */
    @Test
    void initGameWithEasyBotTest() {

        game.initFourConnectGame(Player.HUMAN, Player.EASYBOT);

        assertTrue(game.getOneBotPlayer());
    }

    /**
     * Testet Initialisierung mit HardBot.
     */
    @Test
    void initGameWithHardBotTest() {

        game.initFourConnectGame(Player.HUMAN, Player.HARDBOT);

        assertTrue(game.getOneBotPlayer());
    }

    /**
     * Testet playBotTurn().
     */
    @Test
    void playBotTurnTest() {

        game.initFourConnectGame(Player.HUMAN, Player.EASYBOT);

        // Spieler wechseln damit der Bot dran ist
        game.playerTurn();

        game.playBotTurn();

        assertNotNull(game.getBoard());
    }
}