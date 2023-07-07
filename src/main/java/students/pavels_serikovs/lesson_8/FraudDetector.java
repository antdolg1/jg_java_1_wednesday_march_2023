package students.pavels_serikovs.lesson_8;

import java.util.Arrays;

public class FraudDetector {
    private FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    public boolean isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
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
