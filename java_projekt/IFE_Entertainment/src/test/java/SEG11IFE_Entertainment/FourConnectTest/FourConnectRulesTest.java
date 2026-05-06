package SEG11.IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGameBoard;
import SEG11.IFE_Entertainment.FourConnect.FourConnectPlayer;
import SEG11.IFE_Entertainment.FourConnect.FourConnectRules;
import SEG11.IFE_Entertainment.FourConnect.Position;
import org.junit.jupiter.api.Test;

/**
 * Test class for FourConnectRules.
 */
class FourConnectRulesTest {

  /**
   * Creates a standard game board (7x6).
   */
  private FourConnectGameBoard createBoard() {
    return new FourConnectGameBoard(7, 6);
  }

  /**
   * Horizontal win condition test.
   */
  @Test
  void testHorizontalWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player = new FourConnectPlayer("X");

    // 4 in a row horizontally
    board.setCellOwner(new Position(0, 0), player);
    board.setCellOwner(new Position(1, 0), player);
    board.setCellOwner(new Position(2, 0), player);
    board.setCellOwner(new Position(3, 0), player);

    assertTrue(rules.checkWin(board, player));
  }

  /**
   * Vertical win condition test.
   */
  @Test
  void testVerticalWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player = new FourConnectPlayer("X");

    // 4 in a column
    board.setCellOwner(new Position(0, 0), player);
    board.setCellOwner(new Position(0, 1), player);
    board.setCellOwner(new Position(0, 2), player);
    board.setCellOwner(new Position(0, 3), player);

    assertTrue(rules.checkWin(board, player));
  }

  /**
   * Diagonal win (top-left to bottom-right).
   */
  @Test
  void testDiagonalWinLeftToRight() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player = new FourConnectPlayer("X");

    board.setCellOwner(new Position(0, 0), player);
    board.setCellOwner(new Position(1, 1), player);
    board.setCellOwner(new Position(2, 2), player);
    board.setCellOwner(new Position(3, 3), player);

    assertTrue(rules.checkWin(board, player));
  }

  /**
   * Diagonal win (top-right to bottom-left).
   */
  @Test
  void testDiagonalWinRightToLeft() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player = new FourConnectPlayer("X");

    board.setCellOwner(new Position(3, 0), player);
    board.setCellOwner(new Position(2, 1), player);
    board.setCellOwner(new Position(1, 2), player);
    board.setCellOwner(new Position(0, 3), player);

    assertTrue(rules.checkWin(board, player));
  }

  /**
   * No win condition.
   */
  @Test
  void testNoWin() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player = new FourConnectPlayer("X");

    board.setCellOwner(new Position(0, 0), player);
    board.setCellOwner(new Position(1, 0), player);
    board.setCellOwner(new Position(2, 0), player);

    assertFalse(rules.checkWin(board, player));
  }

  /**
   * Tie condition (full board).
   */
  @Test
  void testTie() {
    FourConnectRules rules = new FourConnectRules();
    FourConnectGameBoard board = createBoard();
    FourConnectPlayer player1 = new FourConnectPlayer("X");
    FourConnectPlayer player2 = new FourConnectPlayer("O");

    // Fill board alternately
    for (int x = 0; x < board.getColumns(); x++) {
      for (int y = 0; y < board.getRows(); y++) {

        // Simple alternating pattern for deterministic fill
        if ((x + y) % 2 == 0) {
          board.setCellOwner(new Position(x, y), player1);
        } else {
          board.setCellOwner(new Position(x, y), player2);
        }
      }
    }

    assertTrue(rules.checkTie(board));
  }
}