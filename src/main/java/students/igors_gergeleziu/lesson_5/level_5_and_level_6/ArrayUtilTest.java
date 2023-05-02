package students.igors_gergeleziu.lesson_5.level_5_and_level_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        checkResult(array.length == 3, "shouldCreateArrayTest");
    }

    void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(array);
        checkResult(array[0] != 0, "shouldFillFirstCellOfArrayWithRandomNumberTest");
        checkResult(array[1] != 0, "shouldFillSecondCellOfArrayWithRandomNumberTest");
        checkResult(array[2] != 0, "shouldFillThirdCellOfArrayWithRandomNumberTest");
    }

    void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3};
        int expectedResult = 3;
        int actualResult = arrayUtil.findMaxNumber(array);
        checkResult(expectedResult == actualResult, "shouldFindMaxNumberTest");
    }

    void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3};
        int expectedResult = 1;
        int actualResult = arrayUtil.findMinNumber(array);
        checkResult(expectedResult == actualResult, "shouldFindMinNumberTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
