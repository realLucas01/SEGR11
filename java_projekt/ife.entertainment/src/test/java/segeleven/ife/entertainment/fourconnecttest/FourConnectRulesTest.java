package segeleven.ife.entertainment.fourconnecttest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit Tests für FourConnectRules Fokus: vollständige Abdeckung aller
 * Win-/Tie-Logiken inkl. Edge Cases
 */
class FourConnectRulesTest {

  private FourConnectGameBoard createBoard() {
    return new FourConnectGameBoard();
  }

  private FourConnectPlayer human() {
    return new FourConnectPlayer(Player.HUMAN, null, null);
  }

  private FourConnectPlayer bot() {
    return new FourConnectPlayer(Player.HARDBOT, null, null);
  }

  private void place(FourConnectGameBoard board, int x, int y, FourConnectPlayer p) {
    board.setCellValue(new Position(x, y), p);
  }

  // ---------------------------
  // WIN TESTS
  // ---------------------------

  @Test
  void horizontalWinDetected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();

    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);
    place(board, 3, 0, p);

    assertTrue(rules.checkWin(board, p));
  }

  @Test
  void verticalWinDetected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();

    place(board, 0, 0, p);
    place(board, 0, 1, p);
    place(board, 0, 2, p);
    place(board, 0, 3, p);

    assertTrue(rules.checkWin(board, p));
  }

  @Test
  void diagonalDownRightWinDetected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();

    place(board, 0, 0, p);
    place(board, 1, 1, p);
    place(board, 2, 2, p);
    place(board, 3, 3, p);

    assertTrue(rules.checkWin(board, p));
  }

  @Test
  void diagonalDownLeftWinDetected() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();

    place(board, 3, 0, p);
    place(board, 2, 1, p);
    place(board, 1, 2, p);
    place(board, 0, 3, p);

    assertTrue(rules.checkWin(board, p));
  }

  // ---------------------------
  // NEGATIVE CASES
  // ---------------------------

  @Test
  void noWinWhenInterruptedLine() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();
    FourConnectPlayer enemy = bot();

    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, enemy); // blockiert
    place(board, 3, 0, p);

    assertFalse(rules.checkWin(board, p));
  }

  @Test
  void noWinInsufficientPieces() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer p = human();

    place(board, 0, 0, p);
    place(board, 1, 0, p);
    place(board, 2, 0, p);

    assertFalse(rules.checkWin(board, p));
  }

  // ---------------------------
  // TIE TESTS
  // ---------------------------

  @Test
  void tieDetectedWhenBoardFull() {
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

  @Test
  void tieFalseWhenBoardNotFull() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();

    assertFalse(rules.checkTie(board));
  }
}
