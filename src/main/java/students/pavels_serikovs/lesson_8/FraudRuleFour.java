package students.pavels_serikovs.lesson_8;

class FraudRuleFour extends FraudRule {

    public FraudRuleFour(String ruleName) {
        super(ruleName);
    }

    boolean fromJamaica(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Jamaica")) {
            System.out.println("User has been Blocked. Transaction stopped...");
            return true;
        } else {
            System.out.println("Transaction continue...");
            return false;
        }
    }

    @Override
    public boolean isFraud(Transaction t) {
        return false;
    }

    @Override
    public String toString() {
        return "FraudRuleFour{}";
    }
}
