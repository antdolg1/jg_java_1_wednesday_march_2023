package students.pavels_serikovs.lesson_8;

public class FraudRuleOneTest {
    public static void main(String[] args) {
        FraudRuleOneTest test = new FraudRuleOneTest();
        test.checkNamesTestTransactionPokemonPassed();
        test.checkNamesTestTransactionPokemonFailed();
    }
    void checkNamesTestTransactionPokemonPassed() {
        FraudRuleOne detector = new FraudRuleOne("RuleOne");
        Transaction transaction = new Transaction(new Trader("Pokemon", "Brazil"),100);
        boolean expected = false;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestPassedTransactionTwoPassed");
    }
    void checkNamesTestTransactionPokemonFailed() {
        FraudRuleOne detector = new FraudRuleOne("RuleOne");
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"),100);
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestPassedTransactionTwoPassed");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
