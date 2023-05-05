package students.pavels_serikovs.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTestOneTest();
        calculatorTest.equalsOfTwoNumbersTest();
        calculatorTest.threeNumbersOneTest();
        calculatorTest.threeNumbersTwoTest();
        calculatorTest.threeNumbersThreeTest();
        calculatorTest.threeNumbersFourTest();
        calculatorTest.threeNumbersFiveTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean realResult = calculator.isEven(4);
        if (expectedResult == realResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = Fail");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Two numbers test = OK");
        } else {
            System.out.println("Two numbers test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestOneTest() {
        int firstNumber = 3;
        int secondNumber = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbersOne(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Two numbers test = OK");
        } else {
            System.out.println("Two numbers test = FAIL");
        }
    }

    public void equalsOfTwoNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.equalsOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Two equals numbers test = OK");
        } else {
            System.out.println("Two equals numbers test = FAIL");
        }
    }

    public void threeNumbersOneTest() {
        int firstNumber = 7;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersOne(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers one test = OK");
        } else {
            System.out.println("Three numbers one test = FAIL");
        }
    }

    public void threeNumbersTwoTest() {
        int firstNumber = 7;
        int secondNumber = 9;
        int thirdNumber = 1;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersTwo(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers two test = OK");
        } else {
            System.out.println("Three numbers two test = FAIL");
        }
    }

    public void threeNumbersThreeTest() {
        int firstNumber = 7;
        int secondNumber = 3;
        int thirdNumber = 11;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers three test = OK");
        } else {
            System.out.println("Three numbers three test = FAIL");
        }
    }

    public void threeNumbersFourTest() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersFour(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers four test = OK");
        } else {
            System.out.println("Three numbers four test = FAIL");
        }
    }

    public void threeNumbersFiveTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbersFive(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Three numbers five test = OK");
        } else {
            System.out.println("Three numbers five test = FAIL");
        }
    }
}
