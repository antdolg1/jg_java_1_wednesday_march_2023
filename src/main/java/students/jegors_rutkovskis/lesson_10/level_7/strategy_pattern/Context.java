package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern;

class Context {
    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }
    double executeStrategy(double a, double b) {
        return strategy.calculate(a, b);
    }
}
