package students.igors_gergeleziu.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test= new CalculatorTest();
         test.summaryTest();
         test.subtractionTest();
         test.multiplicationTest();
         test.divisionTest();
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
}
