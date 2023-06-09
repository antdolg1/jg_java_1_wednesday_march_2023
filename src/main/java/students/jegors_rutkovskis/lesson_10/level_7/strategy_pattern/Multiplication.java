package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern;

class Multiplication implements Strategy {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
