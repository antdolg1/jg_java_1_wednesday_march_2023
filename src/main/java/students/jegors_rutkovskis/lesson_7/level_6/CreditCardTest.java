package students.jegors_rutkovskis.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.shouldCreateCreditCard();
        test.shouldSetBalanceZeroWhenNewCardCreated();
        test.shouldSetCreditDebtToZeroWhenNewCardCreated();
        test.shouldChangeCreditLimit();
        test.shouldCheckPinCodeWhenDepositTrue();
        test.shouldCheckPinCodeWhenDepositFalse();
        test.shouldDepositMoneyIfPinCodeIsCorrect();
        test.shouldNotDepositMoneyIfPinCodeIsIncorrect();
        test.shouldBlockIfZeroAttemptsLeftDuringDeposit();
        test.shouldReturnFalseIfDepositNegativeAmount();
        test.creditDebtTest();
        test.shouldWithdraw();
        test.shouldNotWithdraw();
    }
    void shouldCreateCreditCard() {
        String expected = "1234-555-333";
        String actual = testCard().getCardNumber();
        testResult(expected, actual, "shouldCreateCreditCard");
    }
    void shouldSetBalanceZeroWhenNewCardCreated() {
        double expected = 0.0;
        double actual = testCard().getBalance();
        testResult(expected, actual, "Should Set Balance to Zero When New Card is Created");
    }
    void shouldSetCreditDebtToZeroWhenNewCardCreated() {
        double expected = 0.0;
        double actual = testCard().getCreditDebt();
        testResult(expected, actual, "Should Set CreditDebt To Zero When New Card is Created");
    }
    void shouldChangeCreditLimit() {
        CreditCard card = testCard();
        card.setCreditLimit(500);
        double actual = card.getCreditLimit();
        double expected = 500.00;
        testResult(expected, actual, "Should Change CreditLimit");
    }
    void shouldCheckPinCodeWhenDepositTrue() {
        boolean actual = testCard().deposit("1234", 1000.00);
        testResult(true, actual, "Should return TRUE if PIN is correct when Deposit");
    }
    void shouldCheckPinCodeWhenDepositFalse() {
        boolean actual = testCard().deposit("0000", 1000.00);
        testResult(false, actual, "Should return FALSE if PIN is incorrect when Deposit");
    }
    void shouldDepositMoneyIfPinCodeIsCorrect() {
        CreditCard card = testCard();
        card.deposit("1234", 1000.00);
        double expected = 1000.00;
        double actual = card.getBalance();
        testResult(expected, actual, "should Deposit Money If PinCode Is Correct");
    }
    void shouldNotDepositMoneyIfPinCodeIsIncorrect() {
        CreditCard card = testCard();
        card.deposit("0000", 1000.00);
        double expected = 0;
        double actual = card.getBalance();
        testResult(expected, actual, "should Not Deposit Money If PinCode Is inCorrect");
    }
    void shouldBlockIfZeroAttemptsLeftDuringDeposit() {
        CreditCard card = testCard();
        testResult(false, card.isBlocked(), "Should return False if card is not blocked");
        card.deposit("0000", 1000.00);
        card.deposit("0000", 1000.00);
        card.deposit("0000", 1000.00);
        testResult(true, card.isBlocked(), "Should return True if card is Blocked after 3 wrong attempts");

        boolean actual = card.deposit("1234", 1000.00);
        testResult(false, actual, "Should return False, if a deposit with the correct PIN is made when the card is blocked");
        testResult(0, card.getAttempts(), "Should return zero attempts left");

        card.unBlock();
        testResult(false, card.isBlocked(), "should unblock card");
        testResult(3, card.getAttempts(), "Should return 3 attempts left after unblock");
    }
    void shouldReturnFalseIfDepositNegativeAmount() {
        boolean actual = testCard().deposit("1234", -10);
        testResult(false, actual, "shouldReturnFalseIfDepositNegativeAmount");

        boolean actual2 = testCard().deposit("1234", 0);
        testResult(false, actual2, "shouldReturnFalseIfDepositZeroAmount");
    }
    void creditDebtTest() {
        CreditCard card = testCard();
        card.setCreditLimit(500);
        card.withdraw("1234", 500);
        card.deposit("1234", 300);
        testResult(-200, card.getBalance(), "Should return negative balance");
        testResult(200, card.getCreditDebt(), "should decrease CreditDebt first");
        card.deposit("1234", 300);
        testResult(0, card.getCreditDebt(), "Should set CreditDebt to zero");
        testResult(100, card.getBalance(), "Should increase balance");
    }
    void shouldWithdraw() {
        CreditCard card = testCard();
        card.deposit("1234", 1000);
        boolean actual = card.withdraw("1234", 1000);
        testResult(true, actual, "Should withdraw if positive balance");

        card.setCreditLimit(1000);
        card.deposit("1234", 500);
        boolean actual2 = card.withdraw("1234", 1500);
        testResult(true, actual2, "Should withdraw if available Balance+CreditLimit");
    }
    void shouldNotWithdraw() {
        CreditCard card = testCard();
        card.deposit("1234", 1000);
        boolean actual = card.withdraw("0000", 500);
        testResult(false, actual, "should return false if wrong pin");
        card.withdraw("0000", 100);
        card.withdraw("0000", 100);
        testResult(true, card.isBlocked(), "Should Block Card if 0 attempts left");

        card.unBlock();
        boolean actual2 = card.withdraw("1234", 1200);
        testResult(false, actual2, "Should return false if withdraw amount is greater than balance");
        testResult(1000, card.getBalance(), "Should not withdraw");

        card.setCreditLimit(1000);
        boolean actual3 = card.withdraw("1234", 2500);
        testResult(false, actual3, "Should return false if withdraw amount is greater than balance+CreditLimit");
        testResult(1000, card.getBalance(), "Should not withdraw");

        boolean actual4 = card.withdraw("1234", -100);
        testResult(false, actual4, "Should return FALSE if negative amount during withdraw operation");
    }

    static CreditCard testCard() {
        return new CreditCard("1234-555-333", "1234");
    }
    private void testResult(String expected,
                            String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
    private void testResult(boolean expected,
                            boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
    private void testResult(double expected,
                            double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
    private void testResult(int expected,
                            int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
}
