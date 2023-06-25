package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class FraudRule1 extends FraudRule {

    public FraudRule1(RuleNamesEnum ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("pokemon");
    }
}
