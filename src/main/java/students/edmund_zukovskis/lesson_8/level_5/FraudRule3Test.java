package students.edmund_zukovskis.lesson_8.level_5;

import org.junit.jupiter.api.Test;
import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule3Test {
    @Test
    void shouldReturnTrueWhenTraderCityIsSydney() {
        Trader trader = new Trader("Pikachu", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 rule3 = new FraudRule3("rule3");

        boolean result = rule3.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTraderCityIsNotSydney() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule3 rule3 = new FraudRule3("rule3");

        boolean result = rule3.isFraud(transaction);
        assertFalse(result);
    }
}
