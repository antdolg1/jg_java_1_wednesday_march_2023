package students.vladislav_antoniv.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.shouldPrintTrue();
        test.shouldPrintFalse();
    }

    void shouldPrintTrue() {
        NumberUtils eventest = new NumberUtils();
        int e = 4;
        boolean expectedResult = true;
        boolean actualResult = eventest.isEven(e);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldPrintTrue PASSED!");
        } else {
            System.out.println("Test shouldPrintTrue FAILED!");
            System.out.println("Expected result: " + expectedResult + " Actual result: " + actualResult);
        }
    }

    void shouldPrintFalse() {
        NumberUtils notEventest = new NumberUtils();
        int e = 3;
        boolean expectedResult = false;
        boolean actualResult = notEventest.isEven(e);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldPrintFalse PASSED!");
        } else {
            System.out.println("Test shouldPrintFalse FAILED!");
            System.out.println("Expected result: " + expectedResult + " Actual result: " + actualResult);
        }
    }

}
