package students.igors_gergeleziu.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test= new CalculatorTest();
         test.summaryTest();
         test.subtractionTest();
         test.multiplicationTest();
         test.divisionTest();
         test.evenTest();
         test.oddTest();
         test.maxNumberIsFirstNumberTest();
         test.maxNumberIsSecondNumberTest();
         test.numbersAreEqualTest();
         test.threeNumbersAreEqualTest();
         test.firstAndSecondNumberAreEqualAndHigherThanThirdTest();
         test.secondAndThirdNumberAreEqualAndHigherThanFirstTest();
         test.thirdAndFirstNumberAreEqualAndHigherThanSecondTest();
         test.firstNumberIsMaxNumberTest();
         test.secondNumberIsMaxNumberTest();
         test.thirdNumberIsMaxNumberTest();

    }
    void summaryTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.addition(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("summaryTest = OK");
        } else {
            System.out.println("summaryTest = FAIL");
        }
    }
    void subtractionTest(){
        int firstNumber = 12;
        int secondNumber = 3;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("subtractionTest = OK");
        } else {
            System.out.println("subtractionTest = FAIL");
        }
    }
    void multiplicationTest(){
        int firstNumber = 4;
        int secondNumber = 8;
        int expectedResult = 32;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("multiplicationTest = OK");
        } else {
            System.out.println("multiplicationTest = FAIL");
        }
    }
    void divisionTest(){
        int firstNumber = 16;
        int secondNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        float realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == (float)expectedResult) {
            System.out.println("divisionTest = OK");
        } else {
            System.out.println("divisionTest = FAIL");
        }
    }
    void evenTest(){
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult = expectedResult) {
            System.out.println("evenTest = OK");
        } else {
            System.out.println("evenTest = FAIL");
        }
    }
    void oddTest(){
        int number = 5;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult != expectedResult) {
            System.out.println("oddTest = OK");
        } else {
            System.out.println("oddTest = FAIL ");
        }
    }
    void maxNumberIsFirstNumberTest(){
        int firstNumber = 12;
        int secondNumber= 5;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumberIsFirstNumberTest = OK");
        } else {
            System.out.println("maxNumberIsFirstNumberTest = FAIL ");
        }
    }
    void maxNumberIsSecondNumberTest(){
        int firstNumber = 4;
        int secondNumber= 21;
        int expectedResult = 21;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumberIsSecondNumberTest = OK");
        } else {
            System.out.println("maxNumberIsSecondNumberTest = FAIL ");
        }
    }
    void numbersAreEqualTest(){
        int firstNumber = 7;
        int secondNumber= 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("numbersAreEqualTest = OK");
        } else {
            System.out.println("numbersAreEqualTest = FAIL ");
        }
    }
    void threeNumbersAreEqualTest(){
        int firstNumber = 6;
        int secondNumber= 6;
        int thirdNumber=6;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("threeNumbersAreEqualTest = OK");
        } else {
            System.out.println("threeNumbersAreEqualTest = FAIL ");
        }
    }
    void firstAndSecondNumberAreEqualAndHigherThanThirdTest() {
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 2;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("firstAndSecondNumberAreEqualAndHigherThanThirdTest = OK");
        } else {
            System.out.println("firstAndSecondNumberAreEqualAndHigherThanThirdTest = FAIL ");
        }
    }
    void secondAndThirdNumberAreEqualAndHigherThanFirstTest() {
        int firstNumber = 1;
        int secondNumber = 15;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("secondAndThirdNumberAreEqualAndHigherThanFirstTest = OK");
        } else {
            System.out.println("secondAndThirdNumberAreEqualAndHigherThanFirstTest = FAIL ");
        }
    }
    void thirdAndFirstNumberAreEqualAndHigherThanSecondTest() {
        int firstNumber = 8;
        int secondNumber = 2;
        int thirdNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("thirdAndFirstNumberAreEqualAndHigherThanSecondTest = OK");
        } else {
            System.out.println("thirdAndFirstNumberAreEqualAndHigherThanSecondTest = FAIL ");
        }
    }
    void firstNumberIsMaxNumberTest() {
        int firstNumber = 15;
        int secondNumber = 3;
        int thirdNumber = 8;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("firstNumberIsMaxNumberTest = OK");
        } else {
            System.out.println("firstNumberIsMaxNumberTest = FAIL ");
        }
    }
    void secondNumberIsMaxNumberTest() {
        int firstNumber = 2;
        int secondNumber = 21;
        int thirdNumber = 3;
        int expectedResult = 21;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("secondNumberIsMaxNumberTest = OK");
        } else {
            System.out.println("secondNumberIsMaxNumberTest = FAIL ");
        }
    }
    void thirdNumberIsMaxNumberTest(){
        int firstNumber = 15;
        int secondNumber = 8;
        int thirdNumber = 18;
        int expectedResult = 18;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("thirdNumberIsMaxNumberTest = OK");
        } else {
            System.out.println("thirdNumberIsMaxNumberTest = FAIL ");
        }
    }
}
