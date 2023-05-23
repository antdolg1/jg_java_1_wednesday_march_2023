package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;
import students.edmund_zukovskis.lesson_8.level_5.FraudRule;

public class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}
