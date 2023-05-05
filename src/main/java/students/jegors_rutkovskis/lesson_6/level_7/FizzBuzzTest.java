package students.jegors_rutkovskis.lesson_6.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizz();
        test.shouldReturnBuzz();
        test.shouldReturnFizzBuzz();
        test.shouldReturnNumber();
    }
    public void shouldReturnFizz() {
        FizzBuzz victim = new FizzBuzz();
        String expected = "Fizz";
        String actual = victim.detect(3);
        testResult(expected, actual, "shouldReturnFizz");
    }
    public void shouldReturnBuzz() {
        FizzBuzz victim = new FizzBuzz();
        String expected = "Buzz";
        String actual = victim.detect(5);
        testResult(expected, actual, "shouldReturnBuzz");
    }
    public void shouldReturnFizzBuzz() {
        FizzBuzz victim = new FizzBuzz();
        String expected = "FizzBuzz";
        String actual = victim.detect(15);
        testResult(expected, actual, "shouldReturnFizzBuzz");
    }
    public void shouldReturnNumber() {
        FizzBuzz victim = new FizzBuzz();
        String expected = "17";
        String actual = victim.detect(17);
        testResult(expected, actual, "shouldReturnNumber");
    }
    private void testResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " - PASSED");
        } else {
            System.err.println(testName + " - FAILED");
        }
    }
}
