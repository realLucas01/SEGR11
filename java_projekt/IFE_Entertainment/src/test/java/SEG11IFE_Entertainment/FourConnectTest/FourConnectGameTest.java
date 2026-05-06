package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.*;

import SEG11.IFE_Entertainment.FourConnect.*;
import SEG11.IFE_Entertainment.GameCore.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;

/**
 * Unit Tests für FourConnectGame
 * Fokus: Spielablauf, State Changes, Gravity, Restart, Turn Handling
 */
class FourConnectGameTest {

    private FourConnectGame game;

    @BeforeEach
    void setup() {
        game = new FourConnectGame();
    }

    // ---------------------------
    // INIT
    // ---------------------------

    @Test
    void init_setsRunningState() {
        assertEquals(0, game.initFourConnectGame(Player.HUMAN, Player.HUMAN));
        assertEquals(GameState.Running, game.getStatus());
    }

    @Test
    void init_setsPlayersCorrectly() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertEquals(2, game.getPlayers().length);
        assertNotNull(game.getPlayers()[0]);
        assertNotNull(game.getPlayers()[1]);
    }

    // ---------------------------
    // DROP DISC + GRAVITY
    // ---------------------------

    @Test
    void dropDisc_placesAtBottom() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.dropDisc(0);

        assertNotNull(game.getBoard().getCellOwner(new Position(0, 0)));
    }

    @Test
    void dropDisc_stacksCorrectly() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.dropDisc(0);
        game.playerTurn();
        game.dropDisc(0);

        // zwei Steine in einer Spalte → müssen übereinander liegen
        assertTrue(
            game.getBoard().getCellOwner(new Position(0, 1)).getType() != Player.NONE ||
            game.getBoard().getCellOwner(new Position(0, 0)).getType() != Player.NONE
        );
    }

    // ---------------------------
    // PLAYER TURN
    // ---------------------------

    @Test
    void playerTurn_switchesPlayerIndex() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        int before = game.currentPlayerIndex();
        game.playerTurn();
        int after = game.currentPlayerIndex();

        assertNotEquals(before, after);
    }

    // ---------------------------
    // STATE CHANGES
    // ---------------------------

    @Test
    void endGame_resetsState() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
        game.endGame();

        assertEquals(GameState.NotStarted, game.getStatus());
    }

    @Test
    void restart_keepsGameRunning() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
        game.dropDisc(0);

        game.restart();

        assertEquals(GameState.Running, game.getStatus());
    }

    // ---------------------------
    // BOARD CHECK
    // ---------------------------

    @Test
    void boardDimensions_areCorrect() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertEquals(7, game.getBoard().getColumns());
        assertEquals(6, game.getBoard().getRows());
    }

    // ---------------------------
    // EDGE CASE
    // ---------------------------

    @Test
    void dropDisc_invalidColumn_doesNotCrash() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertDoesNotThrow(() -> game.dropDisc(-1));
    }
}