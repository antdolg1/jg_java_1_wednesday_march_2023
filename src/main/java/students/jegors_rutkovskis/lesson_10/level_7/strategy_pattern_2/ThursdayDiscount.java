package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

class ThursdayDiscount implements Strategy {
    @Override
    public double calculateDiscount(double price) {
        return price - (price * 0.4);
    }
}
