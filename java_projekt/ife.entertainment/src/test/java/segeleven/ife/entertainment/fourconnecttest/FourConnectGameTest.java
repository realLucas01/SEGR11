package segeleven.ife.entertainment.fourconnecttest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import segeleven.ife.entertainment.fourconnect.FourConnectGame;
import segeleven.ife.entertainment.fourconnect.Player;
import segeleven.ife.entertainment.gamecore.GameState;

/** Testklasse für FourConnectGame. */
public class FourConnectGameTest {

  /** Spielinstanz für die Tests. */
  private FourConnectGame game;

  /** Wird vor jedem Test ausgeführt. */
  @BeforeEach
  public void setUp() {
    game = FourConnectGame.getInstance();
    game.endGame();
  }

  /** Testet die Initialisierung eines neuen Spiels. */
  @Test
  public void initGameTest() {
    int result = game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    assertEquals(0, result);
    assertEquals(GameState.RUNNING, game.getStatus());
    assertNotNull(game.getBoard());
    assertNotNull(game.getPlayers());
  }

  /** Testet setStatus() und getStatus(). */
  @Test
  public void statusTest() {
    game.setStatus(GameState.WON);
    assertEquals(GameState.WON, game.getStatus());
  }

  /** Testet den Spielerwechsel. */
  @Test
  public void playerTurnTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.playerTurn();
    assertTrue(true);
  }

  /** Testet das Platzieren einer Scheibe. */
  @Test
  public void dropDiscTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    GameState state = game.dropDisc(0);
    assertNotNull(state);
  }

  /** Testet ob mehrere Scheiben korrekt gestapelt werden. */
  @Test
  public void dropDiscStacksCorrectlyTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    assertNotNull(game.getBoard());
  }

  /** Testet dass dropDisc einen Sieg erkennt. */
  @Test
  public void dropDiscWinTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    GameState state = game.dropDisc(0);
    assertEquals(GameState.WON, state);
  }

  /** Testet restart(). */
  @Test
  public void restartTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);
    game.restart();
    assertEquals(GameState.RUNNING, game.getStatus());
  }

  /** Testet endGame(). */
  @Test
  public void endGameTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.endGame();
    assertEquals(GameState.NOT_STARTED, game.getStatus());
    assertNull(game.getPlayers()[0]);
    assertNull(game.getPlayers()[1]);
  }

  /** Testet die Spielfeldgröße. */
  @Test
  public void boardTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    assertEquals(6, game.getBoard().getRows());
    assertEquals(7, game.getBoard().getColumns());
  }

  /** Testet Initialisierung mit EasyBot. */
  @Test
  public void initGameWithEasyBotTest() {
    game.initFourConnectGame(Player.HUMAN, Player.EASYBOT);
    assertTrue(game.getOneBotPlayer());
  }

  /** Testet Initialisierung mit HardBot. */
  @Test
  public void initGameWithHardBotTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HARDBOT);
    assertTrue(game.getOneBotPlayer());
  }

  /** Testet playBotTurn(). */
  @Test
  public void playBotTurnTest() {
    game.initFourConnectGame(Player.HUMAN, Player.EASYBOT);
    game.playerTurn();
    game.playBotTurn();
    assertNotNull(game.getBoard());
  }

  /** Testet getCurrentPlayerIndex() am Anfang. */
  @Test
  public void getCurrentPlayerIndexInitiallyZeroTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    assertEquals(0, game.getCurrentPlayerIndex());
  }

  /** Testet getCurrentPlayerIndex() nach Spielerwechsel. */
  @Test
  public void getCurrentPlayerIndexAfterPlayerTurnTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.playerTurn();
    assertEquals(1, game.getCurrentPlayerIndex());
  }

  /** Testet getWinningPositions() nach einem Sieg. */
  @Test
  public void getWinningPositionsAfterWinTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    assertEquals(4, game.getWinningPositions().size());
  }

  /** Testet dass getWinningPositions() nach endGame() leer ist. */
  @Test
  public void getWinningPositionsEmptyAfterEndGameTest() {
    game.initFourConnectGame(Player.HUMAN, Player.HUMAN);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    game.dropDisc(0);
    game.endGame();
    assertEquals(0, game.getWinningPositions().size());
  }
}