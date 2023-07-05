package students.pavels_serikovs.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindNumberPassed();
        test.shouldFindNumberFailed();
        test.shouldCountFindNumberPassed();
        test.shouldCountFindNumberFailed();
        test.shouldReplaceFirstPassed();
        test.shouldReplaceFirstFailed();
        test.shouldReplaceAllNumbersPassed();
        test.shouldReplaceAllNumbersFailed();
        test.shouldRevertArray();
        test.shouldSortArray();
    }

    public void shouldFindNumberPassed() {
        ArrayService service = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        boolean actualResult = service.contains(testArray, 3);
        testResult(true, actualResult, "ShouldFindNumberPassed");
    }

    public void shouldFindNumberFailed() {
        ArrayService container = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        boolean actualResult = container.contains(testArray, 6);
        testResult(true, actualResult, "ShouldFindNumberFailed");
    }

    public void shouldCountFindNumberPassed() {
        ArrayService occurrences = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 4};
        int actualResult = occurrences.countOccurrences(testArray, 4);
        testResult(2, actualResult, "shouldCountFindNumberPassed");
    }

    public void shouldCountFindNumberFailed() {
        ArrayService occurrences = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 4};
        int actualResult = occurrences.countOccurrences(testArray, 4);
        testResult(1, actualResult, "shouldCountFindNumberFailed");
    }

    public void shouldReplaceFirstPassed() {
        ArrayService replace = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {1, 2, 3, 5, 5};
        boolean actualResult = replace.replaceFirst(testArray, 4, 5);
        testResult(expectedResult, testArray, "ReplaceNumbersPassed");
        testResult(true, actualResult, "ReplaceNumbersPassed");
    }

    public void shouldReplaceFirstFailed() {
        ArrayService replace = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        boolean actualResult = replace.replaceFirst(testArray, 4, 5);
        testResult(expectedResult, testArray, "ReplaceNumbersFailed");
        testResult(false, actualResult, "ReplaceNumbersFailed");
    }

    public void shouldReplaceAllNumbersPassed() {
        ArrayService replace = new ArrayService();
        int[] testArray = {1, 2, 2, 3, 2, 5};
        int[] expected = {1, 4, 4, 3, 4, 5};
        replace.replaceAll(testArray, 2, 4);
        testResult(expected, testArray, "ReplaceAllNumbersPassed");
    }

    public void shouldReplaceAllNumbersFailed() {
        ArrayService replace = new ArrayService();
        int[] testArray = {1, 2, 2, 3, 2, 5};
        int[] expected = {1, 4, 4, 3, 4, 5};
        replace.replaceAll(testArray, 2, 3);
        testResult(expected, testArray, "ReplaceAllNumbersFailed");
    }

    public void shouldRevertArray() {
        ArrayService revert = new ArrayService();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        revert.revertArray(testArray);
        testResult(expected, testArray, "RevertReverseArrayPassed");
    }

    public void shouldSortArray() {
        ArrayService revert = new ArrayService();
        int[] testArray = {1, 4, 3, 2, 5};
        int[] expected = {1, 2, 3, 4, 5};
        revert.sort(testArray);
        testResult(expected, testArray, "SortPassed");
    }

    private void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " test passed;");
        } else {
            System.out.println(testName + " test failed;");
        }
    }

    private void testResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " test passed;");
        } else {
            System.out.println(testName + " test failed;");
        }
    }

    private void testResult(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " test passed;");
        } else {
            System.out.println(testName + " test failed;");
        }
    }
}
