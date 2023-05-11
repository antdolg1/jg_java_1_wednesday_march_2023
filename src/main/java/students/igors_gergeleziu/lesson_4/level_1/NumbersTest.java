package students.igors_gergeleziu.lesson_4.level_1;

class NumbersTest {
    public static void main(String[] args) {
        NumbersTest test = new NumbersTest();
        test.numberShouldBeNegativeTest();
        test.numberShouldBePositiveTest();
        test.numberShouldBeZeroTest();
        test.shouldBeFridayTest();
        test.numberShouldBeEvenTest();
        test.numberShouldBeOddTest();
    }

    void numberShouldBePositiveTest() {
        Numbers number = new Numbers(3);
        String expectedResult = "Positive";
        String actualResult = number.isNumberPositiveOrNegative();
        if (expectedResult.equals(actualResult)) System.out.println("Test numberShouldBePositive PASSED!");
        else {
            System.out.println("Test numberShouldBePositive FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }

    void numberShouldBeNegativeTest() {
        Numbers number = new Numbers(-2);
        String expectedResult = "Negative";
        String actualResult = number.isNumberPositiveOrNegative();
        if (expectedResult.equals(actualResult)) System.out.println("Test numberShouldBeNegative PASSED!");
        else {
            System.out.println("Test numberShouldBeNegative FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }

    }

    void numberShouldBeZeroTest() {
        Numbers number = new Numbers(0);
        String expectedResult = "Zero";
        String actualResult = number.isNumberPositiveOrNegativeOrZero();
        if (expectedResult.equals(actualResult)) System.out.println("Test numberShouldBeZero PASSED!");
        else {
            System.out.println("Test numberShouldBeZero FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }

    }

    void shouldBeFridayTest() {
        Numbers number = new Numbers(5);
        String expectedResult = "Friday";
        String actualResult = number.dayOfTheWeek();
        if (expectedResult.equals(actualResult)) System.out.println("Test shouldBeFriday PASSED!");
        else {
            System.out.println("Test shouldBeFriday FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }

    void numberShouldBeEvenTest() {
        Numbers number = new Numbers(8);
        String expectedResult = "Even";
        String actualResult = number.evenOrOddNumber();
        if (expectedResult.equals(actualResult)) System.out.println("Test numberShouldBeEven PASSED!");
        else {
            System.out.println("Test numberShouldBeEven FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }

    void numberShouldBeOddTest() {
        Numbers number = new Numbers(1);
        String expectedResult = "Odd";
        String actualResult = number.evenOrOddNumber();
        if (expectedResult.equals(actualResult)) System.out.println("Test numberShouldBeOdd PASSED!");
        else {
            System.out.println("Test numberShouldBeOdd FAILED!");
            System.out.println("Expected result: " + expectedResult + "\n Actual result: " + actualResult);
        }
    }
}
