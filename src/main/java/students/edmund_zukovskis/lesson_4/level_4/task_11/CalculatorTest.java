package students.edmund_zukovskis.lesson_4.level_4.task_11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumberTest1();
        calculatorTest.maxOfTwoNumberTest2();
        calculatorTest.maxOfTwoNumberTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
    }
    public void sumTest() {
        int firstNumber = 9;
        int secondNumber = 5;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK" );
        } else {
            System.out.println("Sum Test = FAIL");
        }
    }
    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK ");
        } else {
            System.out.println("Subtraction test = FAIL ");
        }
    }
    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test = OK ");
        } else {
            System.out.println("Division test = FAIL ");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK ");
        } else {
            System.out.println("Multiply test = FAIL ");
        }
    }
    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(10);
        if (expectedResult == actualResult) {
            System.out.println("isEven (true) test = OK ");
        } else {
            System.out.println("isEven (true) test = FAIL ");
        }
    }
    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean expectedResult = true;
        boolean actualResult = calculator.isEven(7);
        if (expectedResult == actualResult) {
            System.out.println("isEven (true) test = OK ");
        } else {
            System.out.println("isEven (true) test = FAIL ");
        }
    }
    public void maxOfTwoNumberTest1() {
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(5, 3);
        if ( expectedResult == actualResult) {
            System.out.println("Max of two numbers test 1 = OK ");
        } else {
            System.out.println("Max of two numbers test 1 = FAIL ");
        }
    }
    public void maxOfTwoNumberTest2() {
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(2, 5);
        if ( expectedResult == actualResult) {
            System.out.println("Max of two numbers test 2 = OK ");
        } else {
            System.out.println("Max of two numbers test 2 = FAIL ");
        }
    }
    public void maxOfTwoNumberTest3() {
        Calculator calculator = new Calculator();
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(5, 5);
        if ( expectedResult == actualResult) {
            System.out.println("Max of two numbers test 3 = OK ");
        } else {
            System.out.println("Max of two numbers test 3 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest1(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 9, 4);
        if (expected == actual){
            System.out.println("Max of three numbers test 1 = OK ");
        } else {
            System.err.println("Max of three numbers test 1 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest2(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(3, 15, 7);
        if (expected == actual){
            System.out.println("Max of three numbers test 2 = OK ");
        } else {
            System.err.println("Max of three numbers test 2 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest3(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(2, 6, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test 3 = OK ");
        } else {
            System.err.println("Max of three numbers test 3 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest4(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 15, 5);
        if (expected == actual){
            System.out.println("Max of three numbers test 4 = OK ");
        } else {
            System.err.println("Max of three numbers test 4 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest5(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(5, 15, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test 5 = OK ");
        } else {
            System.err.println("Max of three numbers test 5 = FAIL ");
        }
    }
    void maxOfThreeNumbersTest6(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 15, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test 6 = OK ");
        } else {
            System.err.println("Max of three numbers test 6 = FAIL ");
        }
    }
}
