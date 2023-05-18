package students.andrej_mihailicenko.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.twoInSquare();
        powerCalculatorTest.fiveToThePowerOfTwo();
        powerCalculatorTest.fiveToThePowerOfZero();
        powerCalculatorTest.fiveToTheNegativePowerOfTwo();
    }

    public void twoInSquare() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expected = 4;
        double actual = powerCalculator.extentNumber(2, 2);
        printTestResult("Two in square test", expected, actual);
    }

    public void fiveToThePowerOfTwo() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expected = 25;
        double actual = powerCalculator.extentNumber(5, 2);
        printTestResult("Five to the power of two test", expected, actual);
    }

    public void fiveToThePowerOfZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expected = 1;
        double actual = powerCalculator.extentNumber(5, 0);
        printTestResult("Five to the power of zero test", expected, actual);
    }

    public void fiveToTheNegativePowerOfTwo() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double expected = 0.04;
        double actual = powerCalculator.extentNumber(5, -2);
        printTestResult("Five to the power of negative two test", expected, actual);
    }

    private void printTestResult(String testName, double expected, double actual) {
        if (expected == actual) {
            System.out.println(testName + " Passed!");
        } else {
            System.out.println(testName + " Failed :(");
        }
    }
}