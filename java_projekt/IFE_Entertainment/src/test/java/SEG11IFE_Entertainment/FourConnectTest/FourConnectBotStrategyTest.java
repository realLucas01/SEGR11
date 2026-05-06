package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("FourConnectBotStrategy Tests")
class FourConnectBotStrategyTest {

    private FourConnectGame game;
    private FourConnectRules rules;
    private FourConnectBotStrategy strategy;
    private FourConnectGameBoard board;

    /**
     * Setzt eine Scheibe direkt auf eine bestimmte Position (ohne Schwerkraft),
     * um Testzustände schnell aufzubauen.
     */
    private void placeAt(FourConnectGameBoard b, int col, int row, Player type) {
        b.setCellValue(new Position(col, row),
                new FourConnectPlayer(type, null, null));
    }

    /**
     * Füllt eine Spalte bis auf die oberste Zeile komplett mit dem angegebenen Spieler
     */
    private void fillColumn(FourConnectGameBoard b, int col, Player type) {
        for (int row = 0; row < b.getRows(); row++) {
            placeAt(b, col, row, type);
        }
    }

    @BeforeEach
    void setUp() {
        game     = new FourConnectGame();
        rules    = new FourConnectRules();
        strategy = new FourConnectBotStrategy(game, rules);
        board    = new FourConnectGameBoard();

        game.initFourConnectGame(Player.HARDBOT, Player.HUMAN);
        board = game.getBoard();
    }

    @Nested
    class AllFourConnectsTests {

        @Test
        void returnsExactly69Windows() {
            ArrayList<Position[]> windows = strategy.allFourConnects(board);
            assertEquals(69, windows.size());
        }

        @Test
        void everyWindowHasFourPositions() {
            for (Position[] window : strategy.allFourConnects(board)) {
                assertEquals(4, window.length);
            }
        }
    }

    @Nested
    class AppraiseBoardTests {

        @Test
        void emptyBoardScoreIsZero() {
            FourConnectGameBoard empty = new FourConnectGameBoard();
            assertEquals(0, strategy.appraiseBoard(empty));
        }

        @Test
        void fourBotInRowGivesHighScore() {
            FourConnectGameBoard b = new FourConnectGameBoard();
            for (int col = 0; col < 4; col++) {
                placeAt(b, col, 5, Player.HARDBOT);
            }
            int score = strategy.appraiseBoard(b);
            assertTrue(score >= 1000);
        }

        @Test
        void fourOpponentInRowGivesLowScore() {
            FourConnectGameBoard b = new FourConnectGameBoard();
            for (int col = 0; col < 4; col++) {
                placeAt(b, col, 5, Player.HUMAN);
            }
            int score = strategy.appraiseBoard(b);
            assertTrue(score <= -1000);
        }

        @Test
        void threeBotScheibenPositiveScore() {
            FourConnectGameBoard b = new FourConnectGameBoard();
            placeAt(b, 0, 5, Player.HARDBOT);
            placeAt(b, 1, 5, Player.HARDBOT);
            placeAt(b, 2, 5, Player.HARDBOT);
            int score = strategy.appraiseBoard(b);
            assertTrue(score > 0);
        }

        @Test
        void botScoreHigherThanOpponentSymmetrically() {
            FourConnectGameBoard botBoard = new FourConnectGameBoard();
            FourConnectGameBoard oppBoard = new FourConnectGameBoard();

            placeAt(botBoard, 0, 5, Player.HARDBOT);
            placeAt(botBoard, 1, 5, Player.HARDBOT);
            placeAt(botBoard, 2, 5, Player.HARDBOT);

            placeAt(oppBoard, 0, 5, Player.HUMAN);
            placeAt(oppBoard, 1, 5, Player.HUMAN);
            placeAt(oppBoard, 2, 5, Player.HUMAN);

            int botScore = strategy.appraiseBoard(botBoard);
            int oppScore = strategy.appraiseBoard(oppBoard);

            assertTrue(botScore > 0);
            assertTrue(oppScore < 0);
        }

        @Test
        void mixedWindowNotCounted() {
            FourConnectGameBoard b = new FourConnectGameBoard();
            placeAt(b, 0, 5, Player.HARDBOT);
            int scoreBeforeMix = strategy.appraiseBoard(b);
            placeAt(b, 1, 5, Player.HUMAN);
            int scoreAfterMix = strategy.appraiseBoard(b);
            assertTrue(scoreAfterMix < scoreBeforeMix);
        }
    }
}