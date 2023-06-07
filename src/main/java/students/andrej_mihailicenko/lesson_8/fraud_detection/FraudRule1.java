package students.andrej_mihailicenko.lesson_8.fraud_detection;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon") ? true : false;
    }
}
