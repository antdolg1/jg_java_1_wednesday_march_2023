package students.edmund_zukovskis.lesson_8.level_5;

import org.junit.jupiter.api.Test;
import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule1Test {
    @Test
    void shouldReturnTrueWhenTraderNameIsPokemon() {
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 rule1 = new FraudRule1("rule1");

        boolean result = rule1.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTraderNameIsNotPokemon() {
        Trader trader = new Trader("Pikachu", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 rule1 = new FraudRule1("rule1");

        boolean result = rule1.isFraud(transaction);
        assertFalse(result);
    }
}
