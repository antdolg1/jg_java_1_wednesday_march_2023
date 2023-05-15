package students.igors_gergeleziu.lesson_4.level_7.super_task_3;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        checkResult(calculator.sum(35, 40) == 75, "sumTest");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        checkResult(calculator.sub(35, 15) == 20, "subTest");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        checkResult(calculator.mul(5, 5) == 25, "mulTest");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        checkResult(calculator.div(40, 8) == 5, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        checkResult(calculator.isEven(22), "isEvenTest1");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        checkResult(calculator.isEven(2), "isEvenTest2");
    }

    void checkResult(boolean condition, String testName) {
        if (condition == true) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
