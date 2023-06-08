package students.pavels_serikovs.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizzBuzzPassed();
        test.shouldReturnFizzPassed();
        test.shouldReturnBuzzPassed();
        test.shouldReturnNumber();
    }

    public void shouldReturnFizzBuzzPassed() {
        FizzBuzz test = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = test.detect(15);
        testResult(expected, actual, "Test shouldReturnFizzBuzzPassed ");
    }
    public void shouldReturnFizzPassed() {
        FizzBuzz test = new FizzBuzz();
        String expected = "Fizz";
        String actual = test.detect(9);
        testResult(expected, actual, "Test shouldReturnFizzPassed ");
    }
    public void shouldReturnBuzzPassed() {
        FizzBuzz test = new FizzBuzz();
        String expected = "Buzz";
        String actual = test.detect(10);
        testResult(expected, actual, "Test shouldReturnBuzzPassed ");
    }
    public void shouldReturnNumber() {
        FizzBuzz test = new FizzBuzz();
        String expected = "1";
        String actual = test.detect(1);
        testResult(expected, actual, "Test shouldReturnNumberPassed ");
    }

    void testResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + "Test passed;");
        } else {
            System.out.println(testName + "Test failed;");
        }
    }
}
