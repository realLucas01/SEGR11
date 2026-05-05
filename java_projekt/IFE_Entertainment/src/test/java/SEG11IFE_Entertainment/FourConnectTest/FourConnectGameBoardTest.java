package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.FourConnectGameBoard;
import SEG11.IFE_Entertainment.FourConnect.FourConnectPlayer;
import SEG11.IFE_Entertainment.FourConnect.Player;
import SEG11.IFE_Entertainment.FourConnect.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourConnectGameBoardTest {

    private FourConnectGameBoard board;

    /**
     * Hilfsmethode: setzt eine Scheibe direkt auf eine Position
     */
    private void placeAt(int col, int row, Player type) {
        board.setCellValue(new Position(col, row),
                new FourConnectPlayer(type, null, null));
    }

    /**
     * Hilfsmethode: füllt das gesamte Board mit einem Spieler
     */
    private void fillBoard(Player type) {
        for (int col = 0; col < board.getColumns(); col++) {
            for (int row = 0; row < board.getRows(); row++) {
                placeAt(col, row, type);
            }
        }
    }

    @BeforeEach
    void setUp() {
        board = new FourConnectGameBoard();
    }

    @Nested
    class ConstrucorTests {

        @Test
        void hasCorrectRowCount() {

            assertEquals(6, board.getRows());
        }

        @Test
        void hasCorrectColumnCount() {

            assertEquals(7, board.getColumns());
        }

        @Test
        void allCellsInitiallyNone() {
            for (int col = 0; col < board.getColumns(); col++) {
                for (int row = 0; row < board.getRows(); row++) {
                    assertEquals(Player.NONE, board.getCellOwner(col, row).getType());
                }
            }
        }

        @Test
        void newBoardIsNotFull() {

            assertFalse(board.isFull());
        }
    }

    @Nested
    class GetCellOwnerTests {

        @Test
        void returnsNoneForEmptyCell() {

            assertEquals(Player.NONE, board.getCellOwner(0, 0).getType());
        }

        @Test
        void returnsCorrectPlayerAfterSet() {
            placeAt(3, 5, Player.HARDBOT);
            assertEquals(Player.HARDBOT, board.getCellOwner(3, 5).getType());
        }


    }

    @Nested
    class GetCellOwnerPositionTests {

        @Test
        void positionOverloadMatchesIntOverload() {
            placeAt(2, 4, Player.HUMAN);

            FourConnectPlayer byInt = board.getCellOwner(2, 4);
            FourConnectPlayer byPosition = board.getCellOwner(new Position(2, 4));

            assertEquals(byInt.getType(), byPosition.getType());
        }

        @Test
        void returnsNoneForEmptyPosition() {
            assertEquals(Player.NONE, board.getCellOwner(new Position(0, 0)).getType());
        }
    }

    @Nested
    class SetCellValueTests {

        @Test
        void setsHumanCorrectly() {
            placeAt(0, 5, Player.HUMAN);
            assertEquals(Player.HUMAN, board.getCellOwner(0, 5).getType());
        }

        @Test
        void setsHardBotCorrectly() {
            placeAt(3, 3, Player.HARDBOT);
            assertEquals(Player.HARDBOT, board.getCellOwner(3, 3).getType());
        }

        @Test
        void overwritingCellWorks() {
            placeAt(1, 1, Player.HUMAN);
            placeAt(1, 1, Player.HARDBOT);
            assertEquals(Player.HARDBOT, board.getCellOwner(1, 1).getType());
        }

    }

    @Nested
    class IsFullTests {

        @Test
        void emptyBoardNotFull() {
            assertFalse(board.isFull());
        }

        @Test
        void completelyFilledBoardIsFull() {
            fillBoard(Player.HUMAN);
            assertTrue(board.isFull());
        }

        @Test
        void boardWithOneFreeCell() {
            fillBoard(Player.HUMAN);
            // Eine Zelle wieder leeren
            board.setCellValue(new Position(0, 0),
                    new FourConnectPlayer(Player.NONE, null, null));
            assertFalse(board.isFull());
        }

        @Test
        void boardWithOneDiscNotFull() {
            placeAt(0, 5, Player.HUMAN);
            assertFalse(board.isFull());
        }
    }

    @Nested
    class ClearTests {

        @Test
        void returnsZero() {
            assertEquals(0, board.clear());
        }

        @Test
        void allCellsNoneAfterClear() {
            fillBoard(Player.HUMAN);
            board.clear();

            for (int col = 0; col < board.getColumns(); col++) {
                for (int row = 0; row < board.getRows(); row++) {
                    assertEquals(Player.NONE,
                            board.getCellOwner(col, row).getType());
                }
            }
        }

        @Test
        void boardNotFullAfterClear() {
            fillBoard(Player.HUMAN);
            board.clear();
            assertFalse(board.isFull());
        }

        @Test
        void multipleClearNoException() {
            assertDoesNotThrow(() -> {
                board.clear();
                board.clear();
                board.clear();
            });
        }
    }

    @Nested
    class CopyTests {

        @Test
        void copiedBoardHasIdenticalCells() {
            placeAt(0, 5, Player.HUMAN);
            placeAt(1, 5, Player.HARDBOT);
            placeAt(3, 3, Player.HUMAN);

            FourConnectGameBoard copy = new FourConnectGameBoard();
            copy.copy(board);

            for (int col = 0; col < board.getColumns(); col++) {
                for (int row = 0; row < board.getRows(); row++) {
                    assertEquals(
                            board.getCellOwner(col, row).getType(),
                            copy.getCellOwner(col, row).getType());
                }
            }
        }

        @Test
        void originalChangeDoesNotAffectCopy() {
            placeAt(0, 5, Player.HUMAN);

            FourConnectGameBoard copy = new FourConnectGameBoard();
            copy.copy(board);

            // Original verändern
            placeAt(0, 5, Player.HARDBOT);

            // Kopie muss noch HUMAN haben
            assertEquals(Player.HUMAN, copy.getCellOwner(0, 5).getType());
        }

        @Test
        void emptyBoardCopiedCorrectly() {
            FourConnectGameBoard copy = new FourConnectGameBoard();
            copy.copy(board);

            for (int col = 0; col < board.getColumns(); col++) {
                for (int row = 0; row < board.getRows(); row++) {
                    assertEquals(Player.NONE, copy.getCellOwner(col, row).getType());
                }
            }
        }

        @Test
        void fullBoardCopiedCorrectly() {
            fillBoard(Player.HUMAN);

            FourConnectGameBoard copy = new FourConnectGameBoard();
            copy.copy(board);

            assertTrue(copy.isFull());
        }
    }
}

