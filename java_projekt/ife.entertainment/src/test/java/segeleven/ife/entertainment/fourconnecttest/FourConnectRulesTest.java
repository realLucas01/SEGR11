package segeleven.ife.entertainment.fourconnecttest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;
import segeleven.ife.entertainment.fourconnect.FourConnectGameBoard;
import segeleven.ife.entertainment.fourconnect.FourConnectPlayer;
import segeleven.ife.entertainment.fourconnect.FourConnectRules;
import segeleven.ife.entertainment.fourconnect.Player;
import segeleven.ife.entertainment.fourconnect.Position;

/** Unit Tests für FourConnectRules. */
public class FourConnectRulesTest {

  /** Erstellt ein neues leeres Spielbrett. */
  private FourConnectGameBoard createBoard() {
    return new FourConnectGameBoard();
  }

  /** Erstellt einen menschlichen Spieler. */
  private FourConnectPlayer human() {
    return new FourConnectPlayer(Player.HUMAN, null, null);
  }

  /** Erstellt einen Bot-Spieler. */
  private FourConnectPlayer bot() {
    return new FourConnectPlayer(Player.HARDBOT, null, null);
  }

  /** Platziert einen Spielstein auf dem Brett. */
  private void place(FourConnectGameBoard board, int x, int y, FourConnectPlayer p) {
    board.setCellValue(new Position(x, y), p);
  }

  /** Testet ob ein horizontaler Sieg erkannt wird. */
  @Test
  public void horizontalWin_detected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);
    place(board, 3, 0, p);
    assertTrue(rules.checkWin(board, p));
  }

  /** Testet ob ein vertikaler Sieg erkannt wird. */
  @Test
  public void verticalWin_detected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 0, 1, p);
    place(board, 0, 2, p);
    place(board, 0, 3, p);
    assertTrue(rules.checkWin(board, p));
  }

  /** Testet ob eine Diagonale links oben nach rechts unten erkannt wird. */
  @Test
  public void diagonalDownRightWin_detected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 1, p);
    place(board, 2, 2, p);
    place(board, 3, 3, p);
    assertTrue(rules.checkWin(board, p));
  }

  /** Testet ob eine Diagonale rechts oben nach links unten erkannt wird. */
  @Test
  public void diagonalDownLeftWin_detected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 3, 0, p);
    place(board, 2, 1, p);
    place(board, 1, 2, p);
    place(board, 0, 3, p);
    assertTrue(rules.checkWin(board, p));
  }

  /** Testet dass kein Sieg erkannt wird wenn eine Linie unterbrochen ist. */
  @Test
  public void noWin_whenInterruptedLine() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    FourConnectPlayer enemy = bot();
    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, enemy);
    place(board, 3, 0, p);
    assertFalse(rules.checkWin(board, p));
  }

  /** Testet dass kein Sieg erkannt wird wenn zu wenig Steine gesetzt sind. */
  @Test
  public void noWin_insufficientPieces() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);
    assertFalse(rules.checkWin(board, p));
  }

  /** Testet ob Unentschieden erkannt wird wenn das Brett voll ist. */
  @Test
  public void tie_detected_whenBoardFull() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p1 = human();
    FourConnectPlayer p2 = bot();
    for (int x = 0; x < board.getColumns(); x++) {
      for (int y = 0; y < board.getRows(); y++) {
        place(board, x, y, (x + y) % 2 == 0 ? p1 : p2);
      }
    }
    assertTrue(rules.checkTie(board));
  }

  /** Testet dass kein Unentschieden erkannt wird wenn das Brett nicht voll ist. */
  @Test
  public void tie_false_whenBoardNotFull() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    assertFalse(rules.checkTie(board));
  }

  /** Testet getLastWinningPositions nach einem horizontalen Sieg. */
  @Test
  public void getLastWinningPositions_horizontalWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);
    place(board, 3, 0, p);
    rules.checkWin(board, p);
    assertEquals(4, rules.getLastWinningPositions().size());
  }

  /** Testet getLastWinningPositions nach einem vertikalen Sieg. */
  @Test
  public void getLastWinningPositions_verticalWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 0, 1, p);
    place(board, 0, 2, p);
    place(board, 0, 3, p);
    rules.checkWin(board, p);
    assertEquals(4, rules.getLastWinningPositions().size());
  }

  /** Testet getLastWinningPositions nach einer Diagonale links oben nach rechts unten. */
  @Test
  public void getLastWinningPositions_diagonalDownRight() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 1, p);
    place(board, 2, 2, p);
    place(board, 3, 3, p);
    rules.checkWin(board, p);
    assertEquals(4, rules.getLastWinningPositions().size());
  }

  /** Testet getLastWinningPositions nach einer Diagonale rechts oben nach links unten. */
  @Test
  public void getLastWinningPositions_diagonalDownLeft() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 3, 0, p);
    place(board, 2, 1, p);
    place(board, 1, 2, p);
    place(board, 0, 3, p);
    rules.checkWin(board, p);
    assertEquals(4, rules.getLastWinningPositions().size());
  }

  /** Testet dass getLastWinningPositions leer ist wenn kein Sieg vorliegt. */
  @Test
  public void getLastWinningPositions_emptyWhenNoWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);
    rules.checkWin(board, p);
    assertEquals(0, rules.getLastWinningPositions().size());
  }
}