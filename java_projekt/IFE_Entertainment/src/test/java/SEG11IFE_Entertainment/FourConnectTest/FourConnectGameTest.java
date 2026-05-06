package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.*;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for FourConnectGame.
 */
class FourConnectGameTest {

    private FourConnectGame game;

    @BeforeEach
    void setUp() {
        game = new FourConnectGame();
    }

    /**
     * Initialization test
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
     * Status getter/setter
     */
    @Test
    void statusTest() {
        game.setStatus(GameState.Won);
        assertEquals(GameState.Won, game.getStatus());
    }

    /**
     * Player switching
     */
    @Test
    void playerTurnTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.playerTurn();

        assertDoesNotThrow(() -> game.dropDisc(0));
    }

    /**
     * Valid move execution
     */
    @Test
    void dropDiscTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        GameState state = game.dropDisc(0);

        assertNotNull(state);
    }

    /**
     * Restart test
     */
    @Test
    void restartTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
        game.dropDisc(0);

        game.restart();

        assertEquals(GameState.Running, game.getStatus());
    }

    /**
     * End game test
     */
    @Test
    void endGameTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.endGame();

        assertEquals(GameState.NotStarted, game.getStatus());
    }

    /**
     * Board dimensions test
     */
    @Test
    void boardTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertNotNull(game.getBoard());
        assertEquals(6, game.getBoard().getRows());
        assertEquals(7, game.getBoard().getColumns());
    }
}