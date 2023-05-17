package students.andrej_mihailicenko.lesson_5.level_5_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);
        if (myArray.length != 10) {
            System.out.println("Test Failed: Array length is not 10");
        } else {
            System.out.println("Test Passed: Array length is 10");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] array = {2, 5, 1, 7, 3, 9};
        int expectedMax = 9;
        int actualMax = util.findMaxNumber(array);
        if (actualMax == expectedMax) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] array = {3, 5, 8, 1, 2, 7};
        int expectedMin = 1;
        int actualMin = util.findMinNumber(array);
        if (actualMin == expectedMin) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

}