package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

class Context {
    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    double executeStrategy(double price) {
        return strategy.calculateDiscount(price);
    }
}
