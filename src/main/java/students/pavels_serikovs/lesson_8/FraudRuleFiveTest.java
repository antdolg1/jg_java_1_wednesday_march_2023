package students.pavels_serikovs.lesson_8;

public class FraudRuleFiveTest {
    public static void main(String[] args) {
        FraudRuleFiveTest test = new FraudRuleFiveTest();
        test.checkTestFromGermanyPassed();
        test.checkTestFromGermanyFailed();
    }

    void checkTestFromGermanyPassed() {
        FraudRuleFive detector = new FraudRuleFive("RuleFive");
        Transaction transaction = new Transaction(new Trader("Oliver", "Germany"), 900);
        boolean expected = false;
        boolean actual = detector.fromGermany(transaction);
        testResult(expected, actual, "checkTestFromGermanyPassed");
    }
    void checkTestFromGermanyFailed() {
        FraudRuleFive detector = new FraudRuleFive("RuleFive");
        Transaction transaction = new Transaction(new Trader("Oliver", "Germany"), 1200);
        boolean expected = true;
        boolean actual = detector.fromGermany(transaction);
        testResult(expected, actual, "checkTestFromGermanyPassed");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
