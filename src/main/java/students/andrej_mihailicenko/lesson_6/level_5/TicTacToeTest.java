package students.andrej_mihailicenko.lesson_6.level_5;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsPlayer1Wins();
        ticTacToeTest.isWinPositionForHorizontalsPlayer2Wins();
        ticTacToeTest.isWinPositionForHorizontalsPlayerNoneWins();
        ticTacToeTest.isWinPositionForVerticalsPlayer1Wins();
        ticTacToeTest.isWinPositionForVerticalsPlayer2Wins();
        ticTacToeTest.isWinPositionForVerticalsPlayerNoneWins();
        ticTacToeTest.isWinPositionForDiagonalsPlayer1Wins();
        ticTacToeTest.isWinPositionForDiagonalsPlayer2Wins();
        ticTacToeTest.isWinPositionForDiagonalsPlayerNoneWins();
        ticTacToeTest.isWinPosition();
        ticTacToeTest.isDrawPosition();
        ticTacToeTest.createField();
    }

    public void isWinPositionForHorizontalsPlayer1Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerOne = 0;
        int[][] field = {
                {0, 0, 0},
                {1, 1, -1},
                {1, 0, 1}
        };
        checkTestResult(ticTacToe.isWinPositionForHorizontals(field, playerOne), "Player 1 Horizontals Wins ");
    }

    public void isWinPositionForHorizontalsPlayer2Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerTwo = 1;
        int[][] field = {
                {0, 1, 0},
                {1, 1, 1},
                {1, -1, 1}
        };
        checkTestResult(ticTacToe.isWinPositionForHorizontals(field, playerTwo), "Player 2 Horizontals Wins ");
    }

    public void isWinPositionForHorizontalsPlayerNoneWins() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {0, 1, 0},
                {1, 0, -1},
                {1, -1, 1}
        };
        checkTestResultNon(ticTacToe.isWinPositionForHorizontals(field, 1), "None Horizontals Wins ");
    }

    public void isWinPositionForVerticalsPlayer1Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerOne = 0;
        int[][] field = {
                {0, 1, 0},
                {0, 1, 1},
                {0, -1, 1}
        };
        checkTestResult(ticTacToe.isWinPositionForVerticals(field, playerOne), "Player 1 Verticals Wins ");
    }

    public void isWinPositionForVerticalsPlayer2Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerTwo = 1;
        int[][] field = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };
        checkTestResult(ticTacToe.isWinPositionForVerticals(field, playerTwo), "Player 2 Verticals Wins ");
    }

    public void isWinPositionForVerticalsPlayerNoneWins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerTwo = 1;
        int[][] field = {
                {1, 1, 0},
                {1, -1, 1},
                {0, 1, 1}
        };
        checkTestResultNon(ticTacToe.isWinPositionForVerticals(field, playerTwo), "None Verticals Wins ");
    }

    public void isWinPositionForDiagonalsPlayer1Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerOne = 0;
        int[][] field = {
                {0, 1, 0},
                {1, 0, 1},
                {1, 1, 0}
        };
        checkTestResult(ticTacToe.isWinPositionForDiagonals(field, playerOne), "Player 1 Diagonals Wins ");
    }

    public void isWinPositionForDiagonalsPlayer2Wins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerTwo = 1;
        int[][] field = {
                {1, -1, 1},
                {-1, 1, -1},
                {1, -1, 0}
        };
        checkTestResult(ticTacToe.isWinPositionForDiagonals(field, playerTwo), "Player 2 Diagonals Wins ");
    }

    public void isWinPositionForDiagonalsPlayerNoneWins() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerTwo = 1;
        int[][] field = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        checkTestResultNon(ticTacToe.isWinPositionForDiagonals(field, playerTwo), "None Diagonals Wins ");
    }

    public void isWinPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int playerOne = 0;
        int[][] field = {
                {0, 1, 0},
                {0, 1, 1},
                {0, -1, 1}
        };
        checkTestResult(ticTacToe.isWinPosition(field, playerOne), "Player 1 Wins ");
    }

    public void isDrawPosition() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 0}
        };
        checkTestResult(ticTacToe.isDrawPosition(field), "Draw ");
    }

    public void createField() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();
        if (field.length == 3 && field[0].length == 3) {
            System.out.println("Field Created Correctly!");
        } else {
            System.out.println("Incorrect Created Field");
        }
    }



    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void checkTestResultNon(boolean condition, String testName) {
        if (!condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}