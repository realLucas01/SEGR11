package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGameBoard;
import SEG11.IFE_Entertainment.FourConnect.FourConnectPlayer;
import SEG11.IFE_Entertainment.FourConnect.FourConnectRules;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.FourConnect.Position;

import org.junit.jupiter.api.Test;

/**
 * Test class for FourConnectRules.
 */
class FourConnectRulesTest {

    /**
     * Creates a standard game board.
     */
    private FourConnectGameBoard createBoard() {
        return new FourConnectGameBoard(); // FIX: kein Konstruktor mit Parametern
    }

    /**
     * Hilfsmethode zum Setzen einer Scheibe
     */
    private void place(FourConnectGameBoard board, int x, int y, FourConnectPlayer player) {
        board.setCellValue(new Position(x, y), player); // FIX: richtige Methode
    }

    /**
     * Horizontal win condition test.
     */
    @Test
    void testHorizontalWin() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer(Player.HUMAN, null, null);

        place(board, 0, 0, player);
        place(board, 1, 0, player);
        place(board, 2, 0, player);
        place(board, 3, 0, player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * Vertical win condition test.
     */
    @Test
    void testVerticalWin() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer(Player.HUMAN, null, null);

        place(board, 0, 0, player);
        place(board, 0, 1, player);
        place(board, 0, 2, player);
        place(board, 0, 3, player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * Diagonal win (↘)
     */
    @Test
    void testDiagonalWinLeftToRight() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer(Player.HUMAN, null, null);

        place(board, 0, 0, player);
        place(board, 1, 1, player);
        place(board, 2, 2, player);
        place(board, 3, 3, player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * Diagonal win (↙)
     */
    @Test
    void testDiagonalWinRightToLeft() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer(Player.HUMAN, null, null);

        place(board, 3, 0, player);
        place(board, 2, 1, player);
        place(board, 1, 2, player);
        place(board, 0, 3, player);

        assertTrue(rules.checkWin(board, player));
    }

    /**
     * No win condition.
     */
    @Test
    void testNoWin() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();
        FourConnectPlayer player = new FourConnectPlayer(Player.HUMAN, null, null);

        place(board, 0, 0, player);
        place(board, 1, 0, player);
        place(board, 2, 0, player);

        assertFalse(rules.checkWin(board, player));
    }

    /**
     * Tie condition (board full).
     */
    @Test
    void testTie() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();

        FourConnectPlayer player1 = new FourConnectPlayer(Player.HUMAN, null, null);
        FourConnectPlayer player2 = new FourConnectPlayer(Player.HARDBOT, null, null);

        // Board komplett füllen
        for (int x = 0; x < board.getColumns(); x++) {
            for (int y = 0; y < board.getRows(); y++) {
                if ((x + y) % 2 == 0) {
                    place(board, x, y, player1);
                } else {
                    place(board, x, y, player2);
                }
            }
        }

        assertTrue(rules.checkTie(board));
    }
}