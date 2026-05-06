package SEG11IFE_Entertainment.FourConnectTest;

import static org.junit.jupiter.api.Assertions.*;

import SEG11.IFE_Entertainment.FourConnect.*;
import org.junit.jupiter.api.Test;

/**
 * Unit Tests für FourConnectRules
 * Fokus: vollständige Abdeckung aller Win-/Tie-Logiken inkl. Edge Cases
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
    void horizontalWin_detected() {
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
    void verticalWin_detected() {
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
    void diagonalDownRightWin_detected() {
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
    void diagonalDownLeftWin_detected() {
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
    void noWin_whenInterruptedLine() {
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
    void noWin_insufficientPieces() {
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
    void tie_detected_whenBoardFull() {
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
    void tie_false_whenBoardNotFull() {
        FourConnectRules rules = new FourConnectRules();
        FourConnectGameBoard board = createBoard();

        assertFalse(rules.checkTie(board));
    }
}