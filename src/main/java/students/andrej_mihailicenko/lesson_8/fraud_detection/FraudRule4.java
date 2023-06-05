package students.andrej_mihailicenko.lesson_8.fraud_detection;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Jamaica") ? true : false;
    }
}
