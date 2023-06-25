package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(RuleNamesEnum ruleName) {
        this.ruleName = ruleName.name();
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}
