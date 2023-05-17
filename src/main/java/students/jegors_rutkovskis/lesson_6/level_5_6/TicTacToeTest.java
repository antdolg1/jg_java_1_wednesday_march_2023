package students.jegors_rutkovskis.lesson_6.level_5_6;

import java.util.Arrays;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTest();
        test.isWinPositionForVerticalsTest();
        test.isWinPositionForLeftDiagonalsTest();
        test.isWinPositionForRightDiagonalsTest();
        test.isWinPositionTest();
        test.isDrawPositionTest();
        test.isDrawPositionTest2();
        test.createFieldTest();
    }
    void createFieldTest() {
        TicTacToe victim = new TicTacToe();
        int[][] expected = { { -1,  -1,  -1},
                             { -1,  -1,  -1},
                             { -1,  -1,  -1}
                           };
        int[][] actual = victim.createField();
        testResult(expected, actual, "should create new field with -1 cells");
    }
    void isDrawPositionTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { { 0,  1,  0},
                          { 0,  1,  1},
                          { 1,  0,  0}
                        };
        boolean actual = victim.isDrawPosition(field);
        testResult(true, actual, "should return TRUE if isDrawPosition");
    }
    void isDrawPositionTest2() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { { 0,  1,  0},
                          { 0, -1,  1},
                          { 1,  0,  0}
                        };
        boolean actual = victim.isDrawPosition(field);
        testResult(false, actual, "should return FALSE if one cell is -1");
    }
    void isWinPositionTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { {-1, -1,  1},
                          { 0,  1,  0},
                          { 1,  0,  1}
                        };
        boolean actual = victim.isWinPosition(field, 1);
        testResult(true, actual, "should return TRUE if is any of win position for player 1");
        boolean actual2 = victim.isWinPosition(field, 0);
        testResult(false, actual2, "should return FALSE if is not any of win positions for player 0");
    }
    void isWinPositionForHorizontalsTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { {-1, -1, -1},
                          { 0,  1,  0},
                          { 0,  0,  0}
                        };
        boolean actual = victim.isWinPositionForHorizontals(field, 0);
        testResult(true, actual, "should return TRUE if is win position for horizontals for player 0");
        boolean actual2 = victim.isWinPositionForHorizontals(field, 1);
        testResult(false, actual2, "should return FALSE if is  NOT win position for horizontals for player 1");
    }
    void isWinPositionForVerticalsTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { {-1, -1,  1},
                          { 0,  1,  1},
                          { 0,  1,  1}
                        };
        boolean actual = victim.isWinPositionForVerticals(field, 1);
        testResult(true, actual, "should return TRUE if is win position for verticals for player 1");
        boolean actual2 = victim.isWinPositionForVerticals(field, 0);
        testResult(false, actual2, "should return FALSE if is  NOT win position for verticals for player 0");
    }
    void isWinPositionForLeftDiagonalsTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { { 1, -1,  1},
                          { 0,  1,  1},
                          { 0,  1,  1}
                        };
        boolean actual = victim.isWinPositionForDiagonals(field, 1);
        testResult(true, actual, "should return TRUE if is win position for LEFT Diagonals for player 1");
        boolean actual2 = victim.isWinPositionForDiagonals(field, 0);
        testResult(false, actual2, "should return FALSE if is  NOT win position for LEFT Diagonals for player 0");
    }
    void isWinPositionForRightDiagonalsTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = { { 1, -1,  0},
                          { 0,  0,  1},
                          { 0,  1,  0}
                        };
        boolean actual = victim.isWinPositionForDiagonals(field, 0);
        testResult(true, actual, "should return TRUE if is win position for RIGHT Diagonals for player 0");
        boolean actual2 = victim.isWinPositionForDiagonals(field, 1);
        testResult(false, actual2, "should return FALSE if is  NOT win position for RIGHT Diagonals for player 1");
    }
    private void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
    private void testResult(int[][] expected, int[][] actual, String testName) {
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
}
