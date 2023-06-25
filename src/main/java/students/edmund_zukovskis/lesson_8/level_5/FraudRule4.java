package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;
import students.edmund_zukovskis.lesson_8.level_5.FraudRule;

public class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}
