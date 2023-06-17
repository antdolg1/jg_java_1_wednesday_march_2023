package students.pavels_serikovs.lesson_7.level_5;

public class PowerCalculator {
    public static double number(double base, int exponent) {
        double result = 1.0;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base; //same as result = result*base;
            }
        } else {
            for (int i = 0; i > exponent; i--) {
                result /= base; //same as result = result/base;
            }
        }
        return result;
    }
}
