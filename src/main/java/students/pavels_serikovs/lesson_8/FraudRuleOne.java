package students.pavels_serikovs.lesson_8;

public class FraudRuleOne extends FraudRule {
    public FraudRuleOne(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            System.out.println("User has been Blocked. Transaction stopped..."); //task19
            return false;
        } else {
            System.out.println("Transaction continue...");
            return true;
        }
    }

    @Override
    public String toString() {
        return "FraudRuleOne{}";
    }
}
