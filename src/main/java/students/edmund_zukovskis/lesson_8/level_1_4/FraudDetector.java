package students.edmund_zukovskis.lesson_8.level_1_4;

import students.edmund_zukovskis.lesson_8.level_5.FraudRule;

import java.util.Arrays;
import java.util.List;

class FraudDetector {

    private List<FraudRule> rules;

    public FraudDetector(FraudRule... rules) {
        this(Arrays.asList(rules));
    }

    public FraudDetector(List<FraudRule> rules) {
        this.rules = rules;
    }

    public boolean isFraud(Transaction t) {
        for (FraudRule rule : rules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
