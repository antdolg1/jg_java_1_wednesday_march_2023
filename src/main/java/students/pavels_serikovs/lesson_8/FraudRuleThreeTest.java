package students.pavels_serikovs.lesson_8;

public class FraudRuleThreeTest {
    public static void main(String[] args) {
        FraudRuleThreeTest test = new FraudRuleThreeTest();
        test.checkTestFromSydneyPassed();
        test.checkTestFromSydneyFailed();
    }

    void checkTestFromSydneyPassed() {
        FraudRuleThree detector = new FraudRuleThree("RuleThree");
        Transaction transaction = new Transaction(new Trader("Peter", "Sydney"), 1000);
        boolean expected = true;
        boolean actual = detector.fromSydney(transaction);
        testResult(expected, actual, "checkTestFromSydneyPassed");
    }

    void checkTestFromSydneyFailed() {
        FraudRuleThree detector = new FraudRuleThree("RuleThree");
        Transaction transaction = new Transaction(new Trader("Peter", "London"), 1000);
        boolean expected = false;
        boolean actual = detector.fromSydney(transaction);
        testResult(expected, actual, "checkTestFromSydneyFailed");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
