package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FraudRule1Test {
    private FraudRule rule1;
    @BeforeEach
    void setUp() {
        rule1 = new FraudRule1(RuleNamesEnum.POKEMON);
    }

    @Test
    void shouldReturnTrueIfFraudNamePokemon() {
        Trader trader = new Trader("pokemon", "NY");
        Transaction transaction = new Transaction(trader, 10_000);
        assertTrue(rule1.isFraud(transaction));
    }

    @Test
    void shouldReturnFalseIfNotFraudNamePokemon() {
        Trader trader = new Trader("Alex", "NY");
        Transaction transaction = new Transaction(trader, 10_000);
        assertFalse(rule1.isFraud(transaction));
    }
}