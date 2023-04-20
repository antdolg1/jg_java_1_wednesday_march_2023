package students.jegors_rutkovskis.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();

        test.sumTest();
        test.subtractionTest();
        test.divisionTest();
        test.multiplyTest();
        test.isEvenTest1();
        test.isEvenTest2();
        test.maxOfTwoNumbersTest_1();
        test.maxOfTwoNumbersTest_2();
        test.maxOfTwoNumbersTest_3();
        test.maxOfThreeNumbersTest_1();
        test.maxOfThreeNumbersTest_2();
        test.maxOfThreeNumbersTest_3();
        test.maxOfThreeNumbersTest_4();
        test.maxOfThreeNumbersTest_5();
        test.maxOfThreeNumbersTest_6();
    }

    void sumTest(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.sum(10, 5);
        if (expected == actual){
            System.out.println("Sum test passed!");
        } else {
            System.err.println("Sum test Failed");
        }
    }
    void subtractionTest(){
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.subtraction(10, 5);
        if (expected == actual){
            System.out.println("Subtraction Test passed!");
        } else {
            System.err.println("Subtraction Test Failed");
        }
    }
    void divisionTest(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.division(10, 5);
        if (expected == actual){
            System.out.println("Division Test passed!");
        } else {
            System.err.println("Division Test Failed");
        }
    }
    void multiplyTest(){
        Calculator calculator = new Calculator();
        int expected = 25;
        int actual = calculator.multiplication(5, 5);
        if (expected == actual){
            System.out.println("Multiply Test passed!");
        } else {
            System.err.println("Multiply Test Failed");
        }
    }
    void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean expected = true;
        boolean actual = calculator.isEven(10);
        if (expected == actual){
            System.out.println("isEven (true) Test passed!");
        } else {
            System.err.println("isEven (true) Test Failed!");
        }
    }
    void isEvenTest2(){
        Calculator calculator = new Calculator();
        boolean expected = false;
        boolean actual = calculator.isEven(9);
        if (expected == actual){
            System.out.println("isEven (false) Test passed!");
        } else {
            System.err.println("isEven (false) Test Failed!");
        }
    }
    void maxOfTwoNumbersTest_1(){
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.maxOfTwoNumbers(5, 4);
        if (expected == actual){
            System.out.println("Max of two numbers test 1 passed!");
        } else {
            System.err.println("Max of two numbers test 1 failed");
        }
    }
    void maxOfTwoNumbersTest_2(){
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.maxOfTwoNumbers(1, 5);
        if (expected == actual){
            System.out.println("Max of two numbers test 2 passed!");
        } else {
            System.err.println("Max of two numbers test 2 failed");
        }
    }
    void maxOfTwoNumbersTest_3(){
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.maxOfTwoNumbers(5, 5);
        if (expected == actual){
            System.out.println("Max of two numbers test 3 passed!");
        } else {
            System.err.println("Max of two numbers test 3 failed");
        }
    }
    void maxOfThreeNumbersTest_1(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 10, 5);
        if (expected == actual){
            System.out.println("Max of three numbers test_1 passed!");
        } else {
            System.err.println("Max of three numbers test_1 failed!");
        }
    }
    void maxOfThreeNumbersTest_2(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(5, 15, 10);
        if (expected == actual){
            System.out.println("Max of three numbers test_2 passed!");
        } else {
            System.err.println("Max of three numbers test_2 failed!");
        }
    }
    void maxOfThreeNumbersTest_3(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(5, 10, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test_3 passed!");
        } else {
            System.err.println("Max of three numbers test_3 failed!");
        }
    }
    void maxOfThreeNumbersTest_4(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 15, 5);
        if (expected == actual){
            System.out.println("Max of three numbers test_4 passed!");
        } else {
            System.err.println("Max of three numbers test_4 failed!");
        }
    }
    void maxOfThreeNumbersTest_5(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(5, 15, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test_5 passed!");
        } else {
            System.err.println("Max of three numbers test_5 failed!");
        }
    }
    void maxOfThreeNumbersTest_6(){
        Calculator calculator = new Calculator();
        int expected = 15;
        int actual = calculator.maxOfThreeNumbers(15, 15, 15);
        if (expected == actual){
            System.out.println("Max of three numbers test_6 passed!");
        } else {
            System.err.println("Max of three numbers test_6 failed!");
        }
    }
}
