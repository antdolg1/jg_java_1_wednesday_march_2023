package students.igors_gergeleziu.lesson_6.level_5_and_level_6;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        System.out.println("Task 22");
        test.shouldBeWinPositionHorizontalsTest1();
        test.shouldBeWinPositionHorizontalsTest2();
        test.shouldBeWinPositionHorizontalsTest3();
        test.shouldNotBeWinPositionHorizontalsTest();
        System.out.println("Task 23");
        test.shouldBeWinPositionVerticalsTest1();
        test.shouldBeWinPositionVerticalsTest2();
        test.shouldBeWinPositionVerticalsTest3();
        test.shouldNoteWinPositionVerticalsTest();
        System.out.println("Task 24");
        test.shouldBeWinPositionDiagonalsTest1();
        test.shouldBeWinPositionDiagonalsTest2();
        test.shouldNoteWinPositionDiagonalsTest();
        System.out.println("Task 25");
        test.shouldBeWinPositionTest1();
        test.shouldBeWinPositionTest2();
        test.shouldBeWinPositionTest3();
        test.shouldNotBeWinPositionTest();
        System.out.println("Task 26");
        test.shouldBeDrawPositionTest();
        System.out.println("Task 27");
        test.shouldCreateFieldTest();


    }

    void shouldBeWinPositionHorizontalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 1, 1},
                {1, 2, 3},
                {1, 2, 3}};
        checkResult(ticTacToe.isWinPositionForHorizontals(array, 1), "shouldBeWinPositionHorizontalsTest1");
    }

    void shouldBeWinPositionHorizontalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 2, 3},
                {1, 1, 1},
                {1, 2, 3}};
        checkResult(ticTacToe.isWinPositionForHorizontals(array, 1), "shouldBeWinPositionHorizontalsTest2");
    }

    void shouldBeWinPositionHorizontalsTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 1, 1}};
        checkResult(ticTacToe.isWinPositionForHorizontals(array, 1), "shouldBeWinPositionHorizontalsTest3");
    }

    void shouldNotBeWinPositionHorizontalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};
        checkResult(!ticTacToe.isWinPositionForHorizontals(array, 1), "shouldNotBeWinPositionHorizontalsTest");
    }

    void shouldBeWinPositionVerticalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 4, 2},
                {1, 5, 3},
                {1, 2, 1}};
        checkResult(ticTacToe.isWinPositionForVerticals(array, 1), "shouldBeWinPositionVerticalsTest1");
    }

    void shouldBeWinPositionVerticalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {3, 1, 2},
                {6, 1, 3},
                {5, 1, 4}};
        checkResult(ticTacToe.isWinPositionForVerticals(array, 1), "shouldBeWinPositionVerticalsTest2");
    }

    void shouldBeWinPositionVerticalsTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {3, 5, 1},
                {6, 2, 1},
                {5, 3, 1}};
        checkResult(ticTacToe.isWinPositionForVerticals(array, 1), "shouldBeWinPositionVerticalsTest3");
    }

    void shouldNoteWinPositionVerticalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {3, 5, 4},
                {6, 2, 3},
                {5, 3, 2}};
        checkResult(!ticTacToe.isWinPositionForVerticals(array, 1), "shouldNoteWinPositionVerticalsTest");
    }

    void shouldBeWinPositionDiagonalsTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 5, 4},
                {6, 1, 5},
                {5, 3, 1}};
        checkResult(ticTacToe.isWinPositionForDiagonals(array, 1), "shouldBeWinPositionDiagonalsTest1");
    }

    void shouldBeWinPositionDiagonalsTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {4, 5, 1},
                {6, 1, 5},
                {1, 4, 3}};
        checkResult(ticTacToe.isWinPositionForDiagonals(array, 1), "shouldBeWinPositionDiagonalsTest2");
    }

    void shouldNoteWinPositionDiagonalsTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {4, 1, 1},
                {6, 1, 5},
                {2, 1, 3}};
        checkResult(!ticTacToe.isWinPositionForDiagonals(array, 1), "shouldNoteWinPositionDiagonalsTest");
    }

    void shouldBeWinPositionTest1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 1, 1},
                {6, 3, 5},
                {2, 4, 3}};
        checkResult(ticTacToe.isWinPosition(array, 1), "shouldBeWinPositionTest1");
    }

    void shouldBeWinPositionTest2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 2, 4},
                {1, 3, 5},
                {1, 4, 3}};
        checkResult(ticTacToe.isWinPosition(array, 1), "shouldBeWinPositionTest2");
    }

    void shouldBeWinPositionTest3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 2, 4},
                {5, 1, 5},
                {1, 4, 1}};
        checkResult(ticTacToe.isWinPosition(array, 1), "shouldBeWinPositionTest3");
    }

    void shouldNotBeWinPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 1, 4},
                {5, 1, 5},
                {1, 4, 2}};
        checkResult(!ticTacToe.isWinPosition(array, 1), "shouldNotBeWinPositionTest");
    }

    void shouldBeDrawPositionTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {
                {1, 0, 1},
                {1, 0, 1},
                {0, 1, 0}};
        checkResult(ticTacToe.isDrawPosition(array), "shouldBeDrawPositionTest");
    }

    void shouldCreateFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = ticTacToe.createField();
        checkResult(ticTacToe.searchForEmptyCellsInArray(array), "shouldCreateFieldTest");
    }


    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
