package students.igors_gergeleziu.lesson_8.level_1;

class FraudRule2 extends FraudRule{
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) return true;
        else return false;
    }
}
