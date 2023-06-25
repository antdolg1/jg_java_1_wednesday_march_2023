package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;
import students.edmund_zukovskis.lesson_8.level_5.FraudRule;

public class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }
}
