package students.pavels_serikovs.lesson_8;

class FraudRuleFive extends FraudRule {

    public FraudRuleFive(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return false;
    }

    boolean fromGermany(Transaction amount) {//task 23
        Trader trader = amount.getTrader();
        int user = amount.getAmount();
        if (trader.getCity().equals("Germany") && (user > 1000)) { // task23
            System.out.println("User has been Blocked. Transaction stopped...");
            return true;
        } else {
            System.out.println("Transaction continue...");
            return false;
        }
    }

    @Override
    public String toString() {
        return "FraudRuleFive{}";
    }
}
