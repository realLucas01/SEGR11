package SEG11IFE_Entertainment.FourConnectTest;

import SEG11.IFE_Entertainment.FourConnect.*;
import SEG11.IFE_Entertainment.GameCore.GameState;
import SEG11.IFE_Entertainment.GameCore.IMoveStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("FourConnectBotStrategy Tests")
class FourConnectBotStrategyTest {

    public FourConnectGame game;
    public FourConnectRules rules;
    public FourConnectBotStrategy strategy;
    public FourConnectGameBoard board;
    public IMoveStrategy stratClass;

    /**
     * Setzt eine Scheibe direkt auf eine bestimmte Position (ohne Schwerkraft),
     * um Testzustände schnell aufzubauen.
     */
    private void placeAt(FourConnectGameBoard b, int col, int row, Player type) {
        b.setCellValue(new Position(col, row),
                new FourConnectPlayer(type, null, null));
    }

    @BeforeEach
    void setUp() {
        game     = FourConnectGame.getInstance();
        rules    = new FourConnectRules();
        strategy = new FourConnectBotStrategy(game, rules);
        board    = new FourConnectGameBoard();


        game.initFourConnectGame(Player.HUMAN, Player.HARDBOT);
        board = game.getBoard();

        stratClass = strategy.new HardBotStrategy();

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

    @Nested
    class HardBotTest{


        @Test
        void playTestTurnTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

            FourConnectPlayer hardBotPlayer = game.getPlayers()[1];

            Method playTestTurnPublic = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("playTestTurn", FourConnectGameBoard.class, Position.class, FourConnectPlayer.class);
            playTestTurnPublic.setAccessible(true);
            Position turn = new Position(0,0);

            //playTestTurnPublic.invoke( board,turn, hardBotPlayer);
            playTestTurnPublic.invoke(stratClass, board, turn, hardBotPlayer);
            assertEquals(hardBotPlayer,board.getCellOwner(0,0));
        }

        @Test
        void undoTestTurnTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
            Method undoTurn = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("undoTestTurn", FourConnectGameBoard.class, Position.class);
            Position turn = new Position(0,0);

            undoTurn.setAccessible(true);
            undoTurn.invoke(stratClass, board, turn);

            assertEquals(Player.NONE, board.getCellOwner(0,0).getType());
        }

        @Test
        void findBotPlayerPositionTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            FourConnectPlayer[] players = game.getPlayers();


            Method botPosition = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("findBotPlayerPosition", FourConnectPlayer[].class);
            botPosition.setAccessible(true);
            Integer result  = (Integer) botPosition.invoke(stratClass, (Object) players);

            assertEquals(1,result);
        }

        @Test
        void findBotPlayerPositionCoudntFindBot() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            FourConnectPlayer[] players = game.getPlayers();

            FourConnectPlayer human2 = new FourConnectPlayer(Player.HUMAN,null,null);
            players[1] = human2;


            Method botPosition = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("findBotPlayerPosition", FourConnectPlayer[].class);
            botPosition.setAccessible(true);
            Integer result  = (Integer) botPosition.invoke(stratClass, (Object) players);

            assertEquals(-1,result);
        }

        @Test
        void findValideTurnsTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
            final FourConnectPlayer humanPlayer = new FourConnectPlayer(Player.HUMAN, null, null);
            for (int r = 0; r < 6; r++) {
                for (int c = 0; c < 7; c++) {
                    final Position position = new Position(c, r);
                    board.setCellValue(position,humanPlayer);
                }
            }
            final Position freePos = new Position(3,0);
            final FourConnectPlayer nonePlayer = new FourConnectPlayer(Player.NONE, null, null);

            board.setCellValue(freePos,nonePlayer);
            final List<Position> testTurn = new ArrayList<>();
            testTurn.add(freePos);
            List<Position> results;

            Method botPosition = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("findValideTurns", FourConnectGameBoard.class);
            botPosition.setAccessible(true);
            results  = (List<Position>) botPosition.invoke(stratClass,board);

            assertEquals(testTurn,results);
        }
/*
        @Test
        void findBestTurnTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            FourConnectPlayer[] players = game.getPlayers();

            strategy = new FourConnectBotStrategy(game,rules);

            board.setCellValue(new Position(2,0), players[1] );
            board.setCellValue(new Position(2,1), players[1] );
            board.setCellValue(new Position(2,2), players[1] );

            Method botPosition = FourConnectBotStrategy.HardBotStrategy.class.getDeclaredMethod("findBestTurn", FourConnectGameBoard.class, int.class);
            botPosition.setAccessible(true);
            Integer results  = (Integer) botPosition.invoke(stratClass,board,4);

             assertEquals(2,results);

        }

 */

        @Test
        void chooseMoveTest(){
            board = new FourConnectGameBoard();
            FourConnectPlayer[] players = game.getPlayers();
            game.dropDisc(3);
            game.playerTurn();
            game.dropDisc(2);
            game.playerTurn();
            game.dropDisc(3);
            game.playerTurn();
            game.dropDisc(2);
            game.playerTurn();
            game.dropDisc(3);
            game.playerTurn();
            game.dropDisc(2);
            game.playerTurn();
            game.dropDisc(4);
            game.playerTurn();

            GameState res=players[1].getStrategy().chooseMove(board);

            assertEquals(GameState.Tied, res);


        }





    }




}