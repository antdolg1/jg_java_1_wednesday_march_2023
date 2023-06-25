package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

public class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
