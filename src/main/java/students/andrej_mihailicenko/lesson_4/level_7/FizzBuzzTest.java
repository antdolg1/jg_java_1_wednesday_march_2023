package students.andrej_mihailicenko.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.returnFizzTest();
        fizzBuzzTest.returnBuzzTest();
        fizzBuzzTest.returnFizzBuzzTest();
        fizzBuzzTest.returnFizzBuzzNumberTest();
    }

    public static void returnFizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(3);
        if (realResult.equals(expectedResult)) {
            System.out.println("Fizz test passed");
        } else {
            System.out.println("Fizz test failed");
        }
    }

    public static void returnBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(5);
        if (realResult.equals(expectedResult)) {
            System.out.println("Buzz test passed");
        } else {
            System.out.println("Buzz test failed");
        }
    }

    public static void returnFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(15);
        if (realResult.equals(expectedResult)) {
            System.out.println("FizzBuzz test passed");
        } else {
            System.out.println("FizzBuzz test failed");
        }
    }

    public static void returnFizzBuzzNumberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "1";
        String realResult = fizzBuzz.detect(1);
        if (realResult.equals(expectedResult)) {
            System.out.println("Other Number test passed");
        } else {
            System.out.println("Other Number test failed");
        }
    }
}