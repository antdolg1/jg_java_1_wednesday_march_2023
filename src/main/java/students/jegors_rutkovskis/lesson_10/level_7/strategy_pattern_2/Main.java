package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern_2;

class Main {
    public static void main(String[] args) {
        CurrentDay currentDay = new CurrentDay();
        StrategyDetectorByDay detectCurrentStrategy = new StrategyDetectorByDay();

        double regularPrice = 100;
        int currentDayValue = currentDay.currentDayValue();

        Strategy strategy = detectCurrentStrategy.detectStrategy(currentDayValue);
        Context context = new Context(strategy);
        double todayPrice = context.executeStrategy(regularPrice);

        System.out.println("Regular price is " + regularPrice + "$");
        System.out.println("Price with discount today is: " + todayPrice + "$");
    }
}
