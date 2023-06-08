package students.pavels_serikovs.lesson_6.level_5_level_6;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.shouldWinPositionForHorizontalsTestPassed();
        test.shouldWinPositionForHorizontalsTestFailed();
        test.shouldWinPositionForVerticalsTestPassed();
        test.shouldWinPositionForVerticalsTestFailed();
        test.shouldWinPositionDiagonalsTestPassed();
        test.shouldWinPositionDiagonalsTestFailed();
        test.shouldDrawPositionPassed();
        test.shouldCreateFieldTest();
    }

    public void shouldWinPositionForHorizontalsTestPassed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, 1, 0},
                {0, 0, 0},
                {1, 1, 1}
        };
        boolean actual = game.winPositionForHorizontals(field, 1);
        testResult(true, actual, "shouldWinPositionForHorizontalsTestPassed for horizontals check number 1 ");
    }

    public void shouldWinPositionForHorizontalsTestFailed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, 1, 0},
                {0, 1, 0},
                {1, 0, 1}
        };
        boolean actual = game.winPositionForHorizontals(field, 1);
        testResult(true, actual, "shouldWinPositionForHorizontalsTestFailed for horizontals check number 1 ");
    }

    public void shouldWinPositionForVerticalsTestPassed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, -1, 0},
                {0, 1, 0},
                {0, 1, 1}
        };
        boolean actual = game.winPositionForVerticals(field, 0);
        testResult(true, actual, "shouldWinPositionForVerticalsTestPassed for verticals check number 0 ");
    }

    public void shouldWinPositionForVerticalsTestFailed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, -1, 0},
                {1, 1, 0},
                {0, 1, 1}
        };
        boolean actual = game.winPositionForVerticals(field, 1);
        testResult(true, actual, "shouldWinPositionForVerticalsTestFailed for verticals check number 1 ");
    }


    public void shouldWinPositionDiagonalsTestPassed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        boolean actual = game.winPositionForDiagonals(field, 0);
        testResult(true, actual, "shouldWinPositionDiagonalsTestPassed, check number 0 ");
    }

    public void shouldWinPositionDiagonalsTestFailed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {0, 1, 0},
                {1, 0, 1},
                {1, 1, 1}
        };
        boolean actual = game.winPositionForDiagonals(field, 0);
        testResult(true, actual, "shouldWinPositionDiagonalsTestFailed, check number 0 ");
    }

    public void shouldDrawPositionPassed() {
        TicTacToe game = new TicTacToe();
        int field[][] = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 0, 0},
        };
        boolean actual = game.drawPosition(field);
        testResult(true, actual, "shouldDrawPositionTestPassed");
    }

    public void shouldCreateFieldTest() {
        TicTacToe game = new TicTacToe();
        int[][] expected = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1},
        };
        int[][] actual = game.createField();
        testResult(expected, actual, "shouldCreateFieldTestPassed");

    }

    void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + "Test passed;");
        } else {
            System.out.println(testName + "Test failed;");
        }
    }

    void testResult(int[][] expected, int[][] actual, String testName) {
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println(testName + "Test passed;");
        } else {
            System.out.println(testName + "Test failed;");
        }
    }
}
