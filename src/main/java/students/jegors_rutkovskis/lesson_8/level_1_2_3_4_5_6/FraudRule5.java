package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudRule5 extends FraudRule {

    public FraudRule5(RuleNamesEnum ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("germany")
                && t.getAmount() > 1000;
    }
}
