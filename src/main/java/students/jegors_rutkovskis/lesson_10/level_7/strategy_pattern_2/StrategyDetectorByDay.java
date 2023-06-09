package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

class StrategyDetectorByDay {
    Strategy detectStrategy(int number) {
        for (Days day : Days.values()) {
            if (day.getDayNumber() == number) {
                return day.getStrategy();
            }
        }
        return null;
    }
}
