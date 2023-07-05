package students.igors_gergeleziu.lesson_8;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sidney")) return true;
        else return false;
    }
}
