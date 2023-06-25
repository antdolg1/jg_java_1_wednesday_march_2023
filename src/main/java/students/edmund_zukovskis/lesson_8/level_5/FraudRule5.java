package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;
import students.edmund_zukovskis.lesson_8.level_5.FraudRule;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}

