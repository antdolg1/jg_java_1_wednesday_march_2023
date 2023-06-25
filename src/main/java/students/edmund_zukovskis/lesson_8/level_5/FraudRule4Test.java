package students.edmund_zukovskis.lesson_8.level_5;

import org.junit.jupiter.api.Test;
import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule4Test {
    @Test
    void shouldReturnTrueWhenTraderCountryIsJamaica() {
        Trader trader = new Trader("Pikachu", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 rule4 = new FraudRule4("rule4");

        boolean result = rule4.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTraderCountryIsNotJamaica() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule4 rule4 = new FraudRule4("rule4");

        boolean result = rule4.isFraud(transaction);
        assertFalse(result);
    }
}
