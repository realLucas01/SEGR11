package SEG11.IFE_Entertainment.FourConnectTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testklasse für FourConnectRules
 */
class FourConnectRulesTest {

    /**
     * Hilfsmethode zum Erstellen eines Standard-Spielbretts (7x6)
     */
    private FourConnectGameBoard createBoard() {
        return new FourConnectGameBoard(7, 6);
    }

    /**
     * Test: Horizontaler Gewinn
     */
    @Test
    void testHorizontalWin() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer("X");

        // 4 nebeneinander (horizontal)
        board.setCellOwner(new Position(0, 0), player);
        board.setCellOwner(new Position(1, 0), player);
        board.setCellOwner(new Position(2, 0), player);
        board.setCellOwner(new Position(3, 0), player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * Test: Vertikaler Gewinn
     */
    @Test
    void testVerticalWin() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer("X");

        // 4 untereinander
        board.setCellOwner(new Position(0, 0), player);
        board.setCellOwner(new Position(0, 1), player);
        board.setCellOwner(new Position(0, 2), player);
        board.setCellOwner(new Position(0, 3), player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * Test: Diagonal (links oben → rechts unten)
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
     * Test: Diagonal (rechts oben → links unten)
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
     * Test: Kein Gewinn
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
     * Test: Unentschieden (Board voll)
     */
    @Test
    void testTie() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player1 = new FourConnectPlayer("X");
        FourConnectPlayer player2 = new FourConnectPlayer("O");

        // Brett komplett füllen (abwechselnd)
        for (int x = 0; x < board.getColumns(); x++) {
            for (int y = 0; y < board.getRows(); y++) {
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
```
