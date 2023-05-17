package students.jegors_rutkovskis.lesson_5.level_5_level_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int expected = 5;
        int[] actual = victim.createArray(5);
        testResult("shouldCreateArray", expected, actual.length);
    }
    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {5, 5, -6, 10, -100, 5};
        int expected = 10;
        int actual = victim.findMaxNumber(array);

        testResult("shouldFindMaxNumber", expected, actual);
    }
    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {5, 5, -6, 10, -100, 5};
        int expected = -100;
        int actual = victim.findMinNumber(array);

        testResult("shouldFindMinNumber", expected, actual);
    }
    private void testResult(String testName, int expected, int actual){
        if (expected == actual){
            System.out.println(testName + " - test passed");
        } else {
            System.err.println(testName + " - test failed!");
        }
    }
}
