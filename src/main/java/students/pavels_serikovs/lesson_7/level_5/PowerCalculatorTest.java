package students.pavels_serikovs.lesson_7.level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.twoInSquareTestPassed();
        test.twoInSquareTestFailed();
        test.fiveInCubeTestPassed();
        test.fiveInCubeTestFailed();
    }

    void twoInSquareTestPassed() {
        PowerCalculator test = new PowerCalculator();
        double actual = test.number(2, 2);
        double expected = 4;
        testResult(expected, actual, "twoInSquarePassed ");
    }
    void twoInSquareTestFailed() {
        PowerCalculator test = new PowerCalculator();
        double actual = test.number(2, 2);
        double expected = 5;
        testResult(expected, actual, "twoInSquareFailed ");
    }

    void fiveInCubeTestPassed() {
        PowerCalculator test = new PowerCalculator();
        double actual = test.number(5, 3);
        double expected = 125;
        testResult(expected, actual, "twoInSquarePassed ");
    }
    void fiveInCubeTestFailed() {
        PowerCalculator test = new PowerCalculator();
        double actual = test.number(5, 3);
        double expected = 25;
        testResult(expected, actual, "twoInSquareFailed ");
    }

    void testResult(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + "Test Passed");
        } else {
            System.out.println(testName + "Test Failed");
        }
    }
}
