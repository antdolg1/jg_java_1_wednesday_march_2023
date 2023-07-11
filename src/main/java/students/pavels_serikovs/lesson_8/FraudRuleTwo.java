package students.pavels_serikovs.lesson_8;

class FraudRuleTwo extends FraudRule {

    public FraudRuleTwo(String ruleName) {
        super(ruleName);
    }

    boolean amountExceed(Transaction t) { //level 3 Task 9
        int trader = t.getAmount();
        if (trader > 1000000) {
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
        return "FraudRuleTwo{}";
    }
}
