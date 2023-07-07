package students.pavels_serikovs.lesson_8;

class FraudRuleThree extends FraudRule {

    public FraudRuleThree(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return false;
    }

    boolean fromSydney(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sydney")) {
            System.out.println("User has been Blocked. Transaction stopped...");
            return true;
        } else {
            System.out.println("Transaction continue...");
            return false;
        }
    }

    @Override
    public String toString() {
        return "FraudRuleThree{}";
    }
}
