package students.pavels_serikovs.lesson_7.level_6;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.shouldCopyTestPassedOne();
        test.shouldCopyTestPassedTwo();
        test.shouldCopyTestFailed();
    }

    void shouldCopyTestPassedOne() {
        ArrayCopy copier = new ArrayCopy();
        int[] input = {1, 5, 3, 8, 10, 12};
        int numberFrom = 3;
        int numberTo = 9;
        int expected[] = {5, 3, 8};
        int[] actual = copier.copyInRange(input, numberFrom, numberTo);
        testResult(expected, actual, "shouldCopyTestPassedOne");
    }

    void shouldCopyTestPassedTwo() {
        ArrayCopy copier = new ArrayCopy();
        int[] input = {1, 5, 3, 8, 10, 12, 22, 33};
        int numberFrom = 9;
        int numberTo = 30;
        int expected[] = {10, 12, 22};
        int[] actual = copier.copyInRange(input, numberFrom, numberTo);
        testResult(expected, actual, "shouldCopyTestPassedTwo");
    }

    void shouldCopyTestFailed() {
        ArrayCopy copier = new ArrayCopy();
        int[] input = {1, 5, 3, 8, 10, 12};
        int numberFrom = 3;
        int numberTo = 9;
        int expected[] = {6, 3, 8};
        int[] actual = copier.copyInRange(input, numberFrom, numberTo);
        testResult(expected, actual, "shouldCopyTestFailed");
    }

    public void testResult(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
