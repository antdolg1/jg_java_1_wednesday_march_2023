package students.igors_gergeleziu.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.shouldResultOneIfPowerIsZeroTest();
        test.shouldReturnFractionalNumberIfPowerIsLessThanZeroTest();
        test.shouldPowerUpNumber4TwoTimesTest();
        test.shouldPowerUpNumber3ThreeTimesTest();
    }

    void shouldResultOneIfPowerIsZeroTest() {
        PowerCalculator calculator = new PowerCalculator();
        checkResult(calculator.powerUpNumber(2, 0) == 1, "shouldResultOneIfPowerIsZeroTest");
    }

    void shouldReturnFractionalNumberIfPowerIsLessThanZeroTest() {
        PowerCalculator calculator = new PowerCalculator();
        checkResult(calculator.powerUpNumber(2, -3) < 1, "shouldReturnFractionalNumberIfPowerIsLessThanZeroTest");
    }

    void shouldPowerUpNumber4TwoTimesTest() {
        PowerCalculator calculator = new PowerCalculator();
        checkResult(calculator.powerUpNumber(4, 2) == 16, "shouldPowerUpNumber4TwoTimesTest");
    }

    void shouldPowerUpNumber3ThreeTimesTest() {
        PowerCalculator calculator = new PowerCalculator();
        checkResult(calculator.powerUpNumber(3, 3) == 27, "shouldPowerUpNumber3ThreeTimesTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
