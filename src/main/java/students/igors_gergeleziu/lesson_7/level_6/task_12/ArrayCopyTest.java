package students.igors_gergeleziu.lesson_7.level_6.task_12;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.shouldReturnArrayWithThreeNumbersTest();
        test.shouldReturnArrayWithNumbersInRangeFrom5To9Test();
        test.shouldReturnArrayWithFiveNumbers5Test();
        test.shouldReturnArrayWithOneNumber3Test();
        test.shouldReturnEmptyArrayTest();
    }

    void shouldReturnArrayWithThreeNumbersTest() {
        ArrayCopy copy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = copy.copyInRange(array, 3, 5);
        checkResult(result.length == 3, "shouldReturnArrayWithThreeNumbersTest");
    }

    void shouldReturnArrayWithNumbersInRangeFrom5To9Test() {
        ArrayCopy copy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = copy.copyInRange(array, 5, 12);
        checkResult(result.length == 5 && result[4] == 9, "shouldReturnArrayWithNumbersInRangeFrom5To9Test");
    }

    void shouldReturnArrayWithFiveNumbers5Test() {
        ArrayCopy copy = new ArrayCopy();
        int[] array = {5, 2, 5, 7, 5, 6, 5, 8, 5};
        int[] result = copy.copyInRange(array, 5, 5);
        checkResult(result.length == 5 && result[0] == 5, "shouldReturnArrayWithFiveNumbers5Test");
    }

    void shouldReturnArrayWithOneNumber3Test() {
        ArrayCopy copy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = copy.copyInRange(array, 3, 3);
        checkResult(result.length == 1 && result[0] == 3, "shouldReturnArrayWithOneNumber3Test");
    }

    void shouldReturnEmptyArrayTest() {
        ArrayCopy copy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = copy.copyInRange(array, 10, 11);
        checkResult(result.length == 0, "shouldReturnEmptyArrayTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
