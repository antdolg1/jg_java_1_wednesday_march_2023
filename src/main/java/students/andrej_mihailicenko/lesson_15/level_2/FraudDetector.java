package students.andrej_mihailicenko.lesson_15.level_2;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return fraudTraderName(trader) || fraudTraderCity(trader);
    }

    private boolean fraudTraderName (Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");

    }

    boolean fraudTraderCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
