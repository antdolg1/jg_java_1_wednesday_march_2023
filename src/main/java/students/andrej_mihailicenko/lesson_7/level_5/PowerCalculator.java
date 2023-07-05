package students.andrej_mihailicenko.lesson_7.level_5;

public class PowerCalculator {
    private double result = 1;

    public double extentNumber(int base, int exponent) {
        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                result /= base;
            }
        }

        return result;

    }
}
