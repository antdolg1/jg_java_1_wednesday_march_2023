package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(RuleNamesEnum ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1_000_000;
    }
}
