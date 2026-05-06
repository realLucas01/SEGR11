package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.*;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Tests für die zentrale Spielsteuerung FourConnectGame
 *
 * Tests:
 * - Initialisierung
 * - Statusverwaltung
 * - Spielerwechsel
 * - Spielzüge
 * - Restart / EndGame
 */
class FourConnectGameTest {

    private FourConnectGame game;

    @BeforeEach
    void setup() {
        game = new FourConnectGame();
    }

    /**
     * Prüft ob das Spiel korrekt initialisiert wird
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
     * Prüft Status Getter / Setter
     */
    @Test
    void statusTest() {
        game.setStatus(GameState.Won);
        assertEquals(GameState.Won, game.getStatus());
    }

    /**
     * Prüft ob Spielerwechsel funktioniert
     */
    @Test
    void playerTurnTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        // erster Spieler
        game.playerTurn();

        // kein direkter Getter für Index -> indirekt testbar über Spielzug
        assertDoesNotThrow(() -> game.dropDisc(0));
    }

    /**
     * Prüft ob ein gültiger Spielzug ausgeführt werden kann
     */
    @Test
    void dropDiscTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        GameState state = game.dropDisc(0);

        // Nach erstem Zug darf Spiel nicht abstürzen
        assertNotNull(state);
    }

    /**
     * Prüft Restart Funktion
     */
    @Test
    void restartTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
        game.dropDisc(0);

        assertDoesNotThrow(() -> game.restart());
        assertEquals(GameState.Running, game.getStatus());
    }

    /**
     * Prüft EndGame Reset
     */
    @Test
    void endGameTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        game.endGame();

        assertEquals(GameState.NotStarted, game.getStatus());
    }

    /**
     * Prüft ob das Board zugreifbar ist
     */
    @Test
    void boardTest() {
        game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

        assertNotNull(game.getBoard());
        assertEquals(6, game.getBoard().getRows());
        assertEquals(7, game.getBoard().getColumns());
    }
}