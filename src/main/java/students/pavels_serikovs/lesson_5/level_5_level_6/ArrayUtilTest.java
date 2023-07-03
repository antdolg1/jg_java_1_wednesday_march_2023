package students.pavels_serikovs.lesson_5.level_5_level_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int expectedResult = 4;
        int[] actualResult = util.createArray(4);
        testResult("shouldCreateArray", expectedResult, actualResult.length);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 5;
        int actualResult = util.findMaxNumber(array);
        testResult("shouldFindMaxNumber", expectedResult, actualResult);
    }

    public void shouldFindMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 1;
        int actualResult = util.findMinNumber(array);
        testResult("shouldFindMinNumber", expectedResult, actualResult);
    }

    void testResult(String testName, int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test passed");
        } else {
            System.out.println(testName + "test failed");
        }
    }
}
