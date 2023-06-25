package students.edmund_zukovskis.lesson_8.level_5;

import org.junit.jupiter.api.Test;
import students.edmund_zukovskis.lesson_8.level_1_4.Trader;
import students.edmund_zukovskis.lesson_8.level_1_4.Transaction;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule5Test {
    @Test
    void shouldReturnTrueWhenTraderCountryIsGermanyAndTransAmountGreaterThan1000() {
        Trader trader = new Trader("Pikachu", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 rule5 = new FraudRule5("rule5");

        boolean result = rule5.isFraud(transaction);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenTraderCountryIsNotGermany() {
        Trader trader = new Trader("Pikachu", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudRule5 rule5 = new FraudRule5("rule5");

        boolean result = rule5.isFraud(transaction);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenTraderCountryIsGermanyAndTransAmountLessThanOrEqual1000() {
        Trader trader = new Trader("John", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule5 rule5 = new FraudRule5("rule5");

        boolean result = rule5.isFraud(transaction);

        assertFalse(result);
    }
}
