package students.andrej_mihailicenko.lesson_8.level_1;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon")?true:false;
    }
}