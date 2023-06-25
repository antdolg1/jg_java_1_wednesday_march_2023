package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {
private FraudRule rule2;
    @BeforeEach
    void setUp() {
        rule2 = new FraudRule2(RuleNamesEnum.AMOUNT_GREATER_MILLION);
    }

    @Test
    void shouldReturnTrueIfAmountGreaterMillion() {
        Trader trader = new Trader("Alex", "NY");
        Transaction transaction = new Transaction(trader, 1_000_001);
        assertTrue(rule2.isFraud(transaction));
    }
    @Test
    void shouldReturnFalseIfAmountLessOrEqualsMillion() {
        Trader trader = new Trader("Alex", "NY");

        assertFalse(rule2.isFraud(new Transaction(trader, 1_000_000)));
        assertFalse(rule2.isFraud(new Transaction(trader, 999_999)));
    }
}