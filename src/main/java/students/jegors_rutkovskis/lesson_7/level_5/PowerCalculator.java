package students.jegors_rutkovskis.lesson_7.level_5;

class PowerCalculator {
    public double increaseToPower(double number, double power) {
        if (isPowerNegative(power)) {
            number = 1 / number;
            power = - power;
        }
        return raiseToPower(number, power);
    }
    private double raiseToPower(double number, double power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
    private boolean isPowerNegative(double power) {
        return power < 0;
    }
}
