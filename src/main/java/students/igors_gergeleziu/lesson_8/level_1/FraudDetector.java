package students.igors_gergeleziu.lesson_8.level_1;

import java.util.Arrays;

class FraudDetector {
    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                System.out.println("Fraud detected: " + t.toString() +"Rule name: "+ rule.getRuleName());
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "FraudDetector{" +
                "fraudRules=" + Arrays.toString(fraudRules) +
                '}';
    }
}

