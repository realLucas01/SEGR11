package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGame;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.Infrastructure.BrandingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the central game controller FourConnectGame.
 *
 * Tests:
 * - Initialization
 * - Status handling
 * - Player switching
 * - Moves
 * - Restart / EndGame
 */
class FourConnectGameTest {

  private FourConnectGame game;

  @BeforeEach
  void setUp() {
    game = new FourConnectGame();
  }

  /**
   * Verifies correct game initialization.
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
   * Tests status getter and setter.
   */
  @Test
  void statusTest() {
    game.setStatus(GameState.Won);
    assertEquals(GameState.Won, game.getStatus());
  }

  /**
   * Verifies player switching behavior.
   */
  @Test
  void playerTurnTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

    game.playerTurn();

    assertDoesNotThrow(() -> game.dropDisc(0));
  }

  /**
   * Verifies that a valid move can be executed.
   */
  @Test
  void dropDiscTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

    GameState state = game.dropDisc(0);

    assertNotNull(state);
  }

  /**
   * Verifies restart functionality.
   */
  @Test
  void restartTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);

    assertDoesNotThrow(() -> game.restart());
    assertEquals(GameState.Running, game.getStatus());
  }

  /**
   * Verifies end game reset behavior.
   */
  @Test
  void endGameTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

    game.endGame();

    assertEquals(GameState.NotStarted, game.getStatus());
  }

  /**
   * Verifies board accessibility and dimensions.
   */
  @Test
  void boardTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);

    assertNotNull(game.getBoard());
    assertEquals(6, game.getBoard().getRows());
    assertEquals(7, game.getBoard().getColumns());
  }
}