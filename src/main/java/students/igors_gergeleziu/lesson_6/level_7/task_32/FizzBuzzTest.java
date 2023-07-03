package students.igors_gergeleziu.lesson_6.level_7.task_32;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.notFizzBuzzTest();
        test.fizzTest();
        test.notFizzTest();
        test.buzzTest();
        test.notBuzzTest();
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(15).equals("FizzBuzz"), "fizzBuzzTest");
    }

    void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(!fizzBuzz.detect(2).equals("FizzBuzz"), "notFizzBuzzTest");
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(9).equals("Fizz"), "fizzTest");
    }

    void notFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(!fizzBuzz.detect(4).equals("Fizz"), "notFizzTest");
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(fizzBuzz.detect(10).equals("Buzz"), "buzzTest");
    }

    void notBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        checkResult(!fizzBuzz.detect(6).equals("Buzz"), "notBuzzTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
