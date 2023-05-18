package students.jegors_rutkovskis.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.increaseToPowerIfPowerNegative();
        test.increaseToPowerIfPowerZero();
        test.increaseToPowerIfNumberZero();
        test.shouldIncreaseToPower();
        test.shouldIncreaseToPowerIfNumberNegative();
        test.shouldIncreaseToPowerIfBothZero();
    }
    void increaseToPowerIfPowerNegative() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 0.03125;
        double actual = victim.increaseToPower(2, -5);
        testResult(expected, actual, "increaseToPowerIfPowerNegative");
    }
    void increaseToPowerIfPowerZero() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 1;
        double actual = victim.increaseToPower(2, 0);
        testResult(expected, actual, "increaseToPowerIfPowerZero");
    }
    void increaseToPowerIfNumberZero() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 0;
        double actual = victim.increaseToPower(0, 4);
        testResult(expected, actual, "increaseToPowerIfNumberZero");
    }
    void shouldIncreaseToPowerIfNumberNegative() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 16;
        double actual = victim.increaseToPower(-2, 4);
        testResult(expected, actual, "shouldIncreaseToPowerIfNumberNegative");

        double expected2 = -32;
        double actual2 = victim.increaseToPower(-2, 5);
        testResult(expected2, actual2, "shouldIncreaseToPowerIfNumberNegative");
    }
    void shouldIncreaseToPower() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 32;
        double actual = victim.increaseToPower(2, 5);
        testResult(expected, actual, "shouldIncreaseToPower");
    }
    void shouldIncreaseToPowerIfBothZero() {
        PowerCalculator victim = new PowerCalculator();
        double expected = 1;
        double actual = victim.increaseToPower(0, 0);
        testResult(expected, actual, "shouldIncreaseToPowerIfBothZero");
    }
    private void testResult(double expected,
                            double actual, String testName){
        if (expected == actual){
            System.out.println(testName + " TEST PASSED!");
        } else {
            System.err.println(testName + " TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
}
