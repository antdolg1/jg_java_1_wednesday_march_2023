package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule5Test {
    private FraudRule rule5;

    @BeforeEach
    void setUp() {
        rule5 = new FraudRule5(RuleNamesEnum.FRAUD_CITY_GERMANY_AND_AMOUNT_GREATER_1000);
    }

    @Test
    void returnsTrueIfFraudCityGermanyAndAmountGreater1000() {
        Trader trader = new Trader("alex", "germany");
        Transaction transaction = new Transaction(trader, 1500);
        assertTrue(rule5.isFraud(transaction));
    }
    @Test
    void returnsFalseIfFraudCityNotEqualsGermany() {
        Trader trader = new Trader("alex", "NY");
        Transaction transaction = new Transaction(trader, 1500);
        assertFalse(rule5.isFraud(transaction));
    }
    @Test
    void returnsFalseIfAmountLess1001() {
        Trader trader = new Trader("alex", "germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(rule5.isFraud(transaction));
    }
}