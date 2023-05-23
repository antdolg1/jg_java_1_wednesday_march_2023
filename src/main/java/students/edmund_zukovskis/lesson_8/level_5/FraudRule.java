package students.edmund_zukovskis.lesson_8.level_5;

import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

public abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}

