package students.jegors_rutkovskis.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldReturnTrueIfArrayContainsValue();
        test.shouldReturnFalseIfArrayNotContainsValue();
        test.shouldCountOccurrencesOfIntegersInArray();
        test.shouldReplaceFirstOccurrenceNumberInArray();
        test.shouldNotReplacedNumberInArrayIfNotExist();
        test.shouldReplaceAllOccurrencesOfNumbersInArray();
        test.shouldCountAllReplacedOccurrencesInArray();
        test.shouldReverseArray();
        test.shouldSortArray();
        test.shouldSortRandomArray();
    }
    void shouldReturnTrueIfArrayContainsValue() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3};
        int searchValue = 3;
        boolean actual = victim.containsValue(testArray, searchValue);

        testResult(true, actual, "shouldReturnTrueIfArrayContainsValue");
    }
    void shouldReturnFalseIfArrayNotContainsValue() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3};
        int searchValue = 4;
        boolean actual = victim.containsValue(testArray, searchValue);

        testResult(false, actual, "shouldReturnFalseIfArrayNotContainsValue");
    }
    void shouldCountOccurrencesOfIntegersInArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 3};

        testResult(2, victim.countIntegerOccurrences(testArray, 3),
                "shouldCountOccurrencesOfIntegersInArray");
        testResult(0, victim.countIntegerOccurrences(testArray, 4),
                "shouldCountOccurrencesOfIntegersInArray");
    }
    void shouldReplaceFirstOccurrenceNumberInArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 3};
        int[] expected =  {1, 2, 7, 4, 3};
        boolean actual = victim.replaceFirstOccurrence(testArray, 3, 7);

        testResult(expected, testArray, "shouldReplaceFirstOccurrenceNumberInArray");
        testResult(true, actual, "shouldReturnTrueIfFirstOccurrenceNumberIsReplaced");
    }
    void shouldNotReplacedNumberInArrayIfNotExist() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expected =  {1, 2, 3, 4, 5};
        victim.replaceFirstOccurrence(testArray, 6, 10);
        boolean actual = victim.replaceFirstOccurrence(testArray, 6, 10);
        testResult(expected, testArray, "shouldNotReplacedNumberInArrayIfNotExist");
        testResult(false, actual, "shouldReturnFalseIfNotReplacedNumberInArrayIfNotExist");
    }
    void shouldReplaceAllOccurrencesOfNumbersInArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 2, 2, 5};
        int[] expected =  {1, 4, 3, 4, 4, 5};
        victim.replaceAll(testArray, 2, 4);

        testResult(expected, testArray, "shouldReplaceAllOccurrencesOfNumbersInArray");
    }
    void shouldCountAllReplacedOccurrencesInArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 2, 2, 5};
        int actual = victim.replaceAll(testArray, 2, 4);
        int expected = 3;

        testResult(expected, actual, "shouldCountAllReplacedOccurrencesInArray");
    }
    void shouldReverseArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expected =  {5, 4, 3, 2, 1};

        victim.reverseArray(testArray);
        testResult(expected, testArray, "shouldReverseArray");
    }
    void shouldSortArray() {
        ArrayService victim = new ArrayService();
        int[] testArray = { 9, 1, 5, 7, 2 };
        int[] expected =  { 1, 2, 5, 7, 9 };

        victim.sortArray(testArray);
        testResult(expected, testArray, "shouldSortArray");
    }
    void shouldSortRandomArray() {
        ArrayService victim = new ArrayService();
        int[] arrTest = new int[10];
        victim.fillWithRandoms(arrTest, -11, 11);

        System.out.println("Random array:        " + Arrays.toString(arrTest));
        victim.sortArray(arrTest);
        System.out.println("Sorted random array: " + Arrays.toString(arrTest));
        testResult(true, victim.isSortedArray(arrTest), "shouldSortRandomArray");
    }
    private void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
    private void testResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
    private void testResult(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
}
