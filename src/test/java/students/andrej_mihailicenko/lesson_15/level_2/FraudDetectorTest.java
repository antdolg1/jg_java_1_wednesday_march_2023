package students.andrej_mihailicenko.lesson_15.level_2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FraudDetectorTest {

    @Test
    public void testNoFraud() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Andrey", "Riga");
        boolean result = fraudDetector.isFraud(trader);
        Assertions.assertFalse(result);
    }

    @Test
    public void testFraudCity() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("John", "Sidney");
        boolean result = fraudDetector.isFraud(trader);
        Assertions.assertTrue(result);
    }

    @Test
    public void testFraudName(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "London");
        boolean result = fraudDetector.isFraud(trader);
        Assertions.assertTrue(result);
    }
}