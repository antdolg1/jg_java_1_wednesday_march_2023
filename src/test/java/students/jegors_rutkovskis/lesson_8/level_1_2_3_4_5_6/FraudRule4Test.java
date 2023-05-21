package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {
    private FraudRule rule4;

    @BeforeEach
    void setUp() {
        rule4 = new FraudRule4(RuleNamesEnum.FRAUD_CITY_JAMAICA);
    }

    @Test
    void returnsTrueIfFraudCityJamaica() {
        Trader trader = new Trader("alex", "jamaica");
        Transaction transaction = new Transaction(trader, 1500);
        assertTrue(rule4.isFraud(transaction));
    }
    @Test
    void returnsFalseIfFraudCityNotEqualsJamaica() {
        Trader trader = new Trader("alex", "NY");
        Transaction transaction = new Transaction(trader, 1500);
        assertFalse(rule4.isFraud(transaction));
    }
}