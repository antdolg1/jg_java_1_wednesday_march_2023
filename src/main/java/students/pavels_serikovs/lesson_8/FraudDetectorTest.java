package students.pavels_serikovs.lesson_8;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.checkNamesTestTransactionPokemonFailed();
        test.checkNamesTestTransactionPokemonPassed();
        test.checkNamesTestMillionFailed();
        test.checkNamesTestMillionPassed();
        test.checkCityTestSydneyFailed();
        test.checkCityTestSydneyPassed();
        test.checkCityTestJamaicaFailed();
        test.checkCityTestJamaicaPassed();
        test.checkCityTestGermanyFailed();
        test.checkCityTestGermanyPassed();
    }

    void checkNamesTestTransactionPokemonFailed() {
        FraudRuleOne ruleOne = new FraudRuleOne("FraudRuleOne");
        FraudRule[] fraudRules = {ruleOne};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pokemon", "Brazil"), 1000); // Rule1
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestTransactionPokemonFailed");
    }

    void checkNamesTestTransactionPokemonPassed() {
        FraudRuleOne ruleOne = new FraudRuleOne("FraudRuleOne");
        FraudRule[] fraudRules = {ruleOne};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"), 500);
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestTransactionPokemonPassed");
        System.out.println();
    }

    void checkNamesTestMillionFailed() {
        FraudRuleTwo ruleTwo = new FraudRuleTwo("FraudRuleTwo");
        FraudRule[] fraudRules = {ruleTwo};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"), 1200000); // Rule2
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestMillionFailed");
    }

    void checkNamesTestMillionPassed() {
        FraudRuleTwo ruleTwo = new FraudRuleTwo("FraudRuleTwo");
        FraudRule[] fraudRules = {ruleTwo};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"), 1000);
        boolean expected = false;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkNamesTestMillionPassed");
        System.out.println();
    }

    void checkCityTestSydneyPassed() {
        FraudRuleThree ruleThree = new FraudRuleThree("FraudRuleThree");
        FraudRule[] fraudRules = {ruleThree};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("John", "Melbourne"), 500);
        boolean expected = false;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestSydneyPassed");
        System.out.println();
    }

    void checkCityTestSydneyFailed() {
        FraudRuleThree ruleThree = new FraudRuleThree("FraudRuleThree");
        FraudRule[] fraudRules = {ruleThree};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("John", "Sydney"), 500);
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestSydneyFailed");
    }

    void checkCityTestJamaicaPassed() {
        FraudRuleFour ruleFour = new FraudRuleFour("FraudRuleFour");
        FraudRule[] fraudRules = {ruleFour};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pablo", "Jamaica"), 1000);
        boolean expected = false;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestJamaicaPassed");
        System.out.println();
    }

    void checkCityTestJamaicaFailed() {
        FraudRuleFour ruleFour = new FraudRuleFour("FraudRuleFour");
        FraudRule[] fraudRules = {ruleFour};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Pablo", "Argentine"), 1000);
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestJamaicaFailed");
    }

    void checkCityTestGermanyFailed() {
        FraudRuleFive ruleFive = new FraudRuleFive("FraudRuleFive");
        FraudRule[] fraudRules = {ruleFive};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Oliver", "Germany"), 1200);
        boolean expected = true;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestGermanyFailed");
    }

    void checkCityTestGermanyPassed() {
        FraudRuleFive ruleFive = new FraudRuleFive("FraudRuleFive");
        FraudRule[] fraudRules = {ruleFive};
        FraudDetector detector = new FraudDetector(fraudRules);
        Transaction transaction = new Transaction(new Trader("Oliver", "Germany"), 900);
        boolean expected = false;
        boolean actual = detector.isFraud(transaction);
        testResult(expected, actual, "checkCityTestGermanyPassed");
        System.out.println();
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
