package students.igors_gergeleziu.lesson_8.level_1;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }
    String getRuleName(){return ruleName;}

    public abstract boolean isFraud(Transaction t);
}
