package students.pavels_serikovs.lesson_6.level_1;

public class NumberUtilsTest {
    public static void main(String[] args) {

        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest(20);
    }

    public void isEvenTest(int testValue) {
        NumberUtils numberTest = new NumberUtils();
        boolean result = numberTest.isEven(testValue);
        checkResults(result, "isEven test");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}
