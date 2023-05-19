package students.edmund_zukovskis.lesson_7.level_5;

public class PowerCalculator {

    public static double calculatePower(double value, int powValue) {
        double result = 1.0;
        for (int i = 0; i < powValue; i++) {
            result *= value;
        }
        return result;
    }
}
