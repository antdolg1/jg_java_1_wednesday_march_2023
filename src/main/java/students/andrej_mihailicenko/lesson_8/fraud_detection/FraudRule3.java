package students.andrej_mihailicenko.lesson_8.fraud_detection;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sydney") ? true : false;
    }
}