package students.pavels_serikovs.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.numberOne();
        test.numberTwo();
        test.numberThree();
        test.numberFour();
    }

    void numberOne() {
        FizzBuzz check = new FizzBuzz();
        int number = 10;
        String expectedResult = "Buzz";
        String actualResult = check.detect(number);
        if (expectedResult.equals(actualResult)) {
            System.out.println("has passed");
        } else {
            System.out.println("has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    void numberTwo() {
        FizzBuzz check = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String actualResult = check.detect(number);
        if (expectedResult.equals(actualResult)) {
            System.out.println("has passed");
        } else {
            System.out.println("has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    void numberThree() {
        FizzBuzz check = new FizzBuzz();
        int number = 9;
        String expectedResult = "Fizz";
        String actualResult = check.detect(number);
        if (expectedResult.equals(actualResult)) {
            System.out.println("has passed");
        } else {
            System.out.println("has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    void numberFour() {
        FizzBuzz check = new FizzBuzz();
        int number = 89;
        String expectedResult = "89";
        String actualResult = check.detect(number);
        if (expectedResult.equals(actualResult)) {
            System.out.println("has passed");
        } else {
            System.out.println("has failed");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
