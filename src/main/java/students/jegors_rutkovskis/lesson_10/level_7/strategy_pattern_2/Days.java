package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

enum Days {

    MONDAY(new MondayDiscount(), 1),
    TUESDAY(new TuesdayDiscount(), 2),
    WEDNESDAY(new WednesdayDiscount(), 3),
    THURSDAY(new ThursdayDiscount(), 4),
    FRIDAY(new FridayDiscount(), 5),
    SATURDAY(new SaturdayDiscount(), 6),
    SUNDAY(new SundayDiscount(), 7);

    private final Strategy strategy;
    private final int dayNumber;
    Days(Strategy strategy, int dayNumber) {
        this.strategy = strategy;
        this.dayNumber = dayNumber;
    }
    Strategy getStrategy() {
        return strategy;
    }
    int getDayNumber() {
        return dayNumber;
    }
}
