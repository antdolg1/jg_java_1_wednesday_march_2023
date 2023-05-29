package students.igors_gergeleziu.lesson_7.level_5;

class PowerCalculator {
    private int number;
    private int power;

    double powerUpNumber(double number, double power) {
        double result = number;
        if (power == 0) {
            result = 1;
        } else if (power < 0) {
            for (int i = 1; i < -power; i++)
                result *= number;
            result = 1 / result;
        } else {
            for (int i = 1; i < power; i++)
                result *= number;
        }
        return result;
    }
}
