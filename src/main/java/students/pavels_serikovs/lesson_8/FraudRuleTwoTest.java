package students.pavels_serikovs.lesson_8;

public class FraudRuleTwoTest {
    public static void main(String[] args) {
        FraudRuleTwoTest test = new FraudRuleTwoTest();
        test.checkNamesTestMillionPassed();
        test.checkNamesTestMillionFailed();
    }

    void checkNamesTestMillionPassed() {
        FraudRuleTwo detector = new FraudRuleTwo("RuleTwo");
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"), 100);
        boolean expected = false;
        boolean actual = detector.amountExceed(transaction);
        testResult(expected, actual, "checkNamesTestMillionPassed");
    }

    void checkNamesTestMillionFailed() {
        FraudRuleTwo detector = new FraudRuleTwo("RuleTwo");
        Transaction transaction = new Transaction(new Trader("Ivan", "Croatia"), 20000000);
        boolean expected = true;
        boolean actual = detector.amountExceed(transaction);
        testResult(expected, actual, "checkNamesTestMillionFailed");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
