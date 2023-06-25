package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule3Test {
    private FraudRule rule3;

    @BeforeEach
    void setUp() {
        rule3 = new FraudRule3(RuleNamesEnum.FRAUD_CITY_SYDNEY);
    }

    @Test
    void returnsTrueIfFraudCitySydney() {
        Trader trader = new Trader("alex", "sydney");
        Transaction transaction = new Transaction(trader, 1500);
        assertTrue(rule3.isFraud(transaction));
    }
    @Test
    void returnsFalseIfFraudCityNotEqualsSydney() {
        Trader trader = new Trader("alex", "NY");
        Transaction transaction = new Transaction(trader, 1500);
        assertFalse(rule3.isFraud(transaction));
    }
}