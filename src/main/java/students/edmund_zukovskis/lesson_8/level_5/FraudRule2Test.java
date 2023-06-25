package students.edmund_zukovskis.lesson_8.level_5;

import org.junit.jupiter.api.Test;
import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule2Test {
    @Test
    void shouldReturnTrueWhenTransactionAmountIsGreaterThan1000000() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1_000_001);
        FraudRule2 rule2 = new FraudRule2("rule2");

        boolean result = rule2.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTransactionAmountIsLessThanOrEqual1000000() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudRule2 rule2 = new FraudRule2("rule2");

        boolean result = rule2.isFraud(transaction);

        assertFalse(result);
    }
}
