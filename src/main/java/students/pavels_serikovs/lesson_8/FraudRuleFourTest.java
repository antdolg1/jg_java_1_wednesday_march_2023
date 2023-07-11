package students.pavels_serikovs.lesson_8;

public class FraudRuleFourTest {
    public static void main(String[] args) {
        FraudRuleFourTest test = new FraudRuleFourTest();
        test.checkTestFromJamaicaPassed();
        test.checkTestFromJamaicaFailed();
    }

    void checkTestFromJamaicaPassed() {
        FraudRuleFour detector = new FraudRuleFour("RuleFour");
        Transaction transaction = new Transaction(new Trader("Pablo", "Jamaica"), 1000);
        boolean expected = true;
        boolean actual = detector.fromJamaica(transaction);
        testResult(expected, actual, "checkTestFromJamaicaPassed");
    }

    void checkTestFromJamaicaFailed() {
        FraudRuleFour detector = new FraudRuleFour("RuleFour");
        Transaction transaction = new Transaction(new Trader("Peter", "London"), 1000);
        boolean expected = false;
        boolean actual = detector.fromJamaica(transaction);
        testResult(expected, actual, "checkTestFromJamaicaPassed");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed;");
        } else {
            System.out.println(testName + " Test failed;");
        }
    }
}
