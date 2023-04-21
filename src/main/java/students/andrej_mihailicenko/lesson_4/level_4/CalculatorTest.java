package students.andrej_mihailicenko.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstMaxOfTwoNumbersTest();
        calculatorTest.secondMaxOfTwoNumbersTest();
        calculatorTest.thirdMaxOfTwoNumbersTest();
        calculatorTest.firstMaxOfThreeNumbersTest();
        calculatorTest.secondMaxOfThreeNumbersTest();
        calculatorTest.thirdMaxOfThreeNumbersTest();
        calculatorTest.fourthMaxOfThreeNumbersTest();
        calculatorTest.fifthMaxOfThreeNumbersTest();
        calculatorTest.sixthMaxOfThreeNumbersTest();
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

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
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
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        if (number % 2 == 0) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void firstMaxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First Number Bigger test = OK");
        } else {
            System.out.println("First Number Bigger test = FAIL");
        }
    }

    public void secondMaxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 25;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second Number Bigger test = OK");
        } else {
            System.out.println("Second Number Bigger test = FAIL");
        }
    }

    public void thirdMaxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("All numbers are equals test = OK");
        } else {
            System.out.println("All numbers are equals test = FAIL");
        }
    }

    public void firstMaxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First number is bigger test = OK");
        } else {
            System.out.println("First number is bigger test = FAIL");
        }
    }

    public void secondMaxOfThreeNumbersTest() {
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second number is bigger test = OK");
        } else {
            System.out.println("Second number is bigger test = FAIL");
        }
    }

    public void thirdMaxOfThreeNumbersTest() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("All equal numbers test = OK");
        } else {
            System.out.println("All equal numbers test = FAIL");
        }
    }

    public void fourthMaxOfThreeNumbersTest() {
        int firstNumber = 14;
        int secondNumber = 14;
        int thirdNumber = 1;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First numbers equals test = OK");
        } else {
            System.out.println("First numbers equals test = FAIL");
        }
    }

    public void fifthMaxOfThreeNumbersTest() {
        int firstNumber = 1;
        int secondNumber = 14;
        int thirdNumber = 14;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second and Third numbers equals test = OK");
        } else {
            System.out.println("Second and Third numbers equals test = FAIL");
        }
    }

    public void sixthMaxOfThreeNumbersTest() {
        int firstNumber = 14;
        int secondNumber = 1;
        int thirdNumber = 14;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and Third numbers equals test = OK");
        } else {
            System.out.println("First and Third numbers equals test = FAIL");
        }
    }
}

