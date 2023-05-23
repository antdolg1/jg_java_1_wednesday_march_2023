package students.edmund_zukovskis.lesson_8.level_1_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    private FraudDetector fraudDetector;

    @BeforeEach
    public void setUp() {
        fraudDetector = new FraudDetector();
    }

    @Test
    void isFraudPositiveTest() {
        Trader trader = new Trader("Pokemon", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudNegativeTest() {
        Trader trader = new Trader("Pikachu", "Tallinn", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudAmountPositiveTest() {
        Trader trader = new Trader("Pikachu", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudAmountNegativeTest() {
        Trader trader = new Trader("Bulbasaur", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 100000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudTownPositiveTest() {
        Trader trader = new Trader("Pikachu", "Sidney", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudTownNegativeTest() {
        Trader trader = new Trader("Pikachu", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudCountryPositiveTest() {
        Trader trader = new Trader("Pikachu", "Kingston", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudCountryNegativeTest() {
        Trader trader = new Trader("Pikachu", "Riga", "Ямайка");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudCountryAndAmountPositiveTest() {
        Trader trader = new Trader("Pikachu", "Berlin", "Ямайка");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    void isFraudCountryAndAmountNegativeTest() {
        Trader trader = new Trader("Pikachu", "Berlin", "Ямайка");
        Transaction transaction = new Transaction(trader, 999);
        assertFalse(fraudDetector.isFraud(transaction));
    }
}
