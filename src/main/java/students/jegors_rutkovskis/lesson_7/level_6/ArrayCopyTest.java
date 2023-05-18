package students.jegors_rutkovskis.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.copyInRangeTest();
    }
    void copyInRangeTest() {
        ArrayCopy arrayCopy = new ArrayCopy();

        int[] input1 = {1, 2, 3, 4, 5};
        int[] output1 = arrayCopy.copyInRange(input1, 2, 4);
        testResult(new int[]{2, 3, 4}, output1, "Should copy array in range 1");

        int[] input2 = {-5, 0, 5, 10, 15};
        int[] output2 = arrayCopy.copyInRange(input2, 0, 10);
        testResult(new int[]{0, 5, 10}, output2, "Should copy array in range 2");

        int[] input3 = {10, 20, 30, 40, 50};
        int[] output3 = arrayCopy.copyInRange(input3, 60, 70);
        testResult(new int[]{}, output3, "Should not copy if not in range");

        int[] input4 = {2, 1, 3, 5, 4, 8, 6, 7, 9, 10};
        int[] output4 = arrayCopy.copyInRange(input4, 5, 9);
        int[] expected = {5, 8, 6, 7, 9};
        testResult(expected, output4, "Should copy array in range 4");
    }
    private void testResult(int[] expected,
                            int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + Arrays.toString(expected) + ", but actual is: " + Arrays.toString(actual));
        }
    }
}
