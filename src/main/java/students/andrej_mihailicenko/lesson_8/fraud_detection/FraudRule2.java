package students.andrej_mihailicenko.lesson_8.fraud_detection;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Transaction transaction = t;
        return transaction.getAmount() >= 1000000;
    }
}
