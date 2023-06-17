package students.pavels_serikovs.lesson_7.level_6;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.cardNumberTestPassed();
        test.cardNumberTestFailed();
        test.cardPinCodeTestPassed();
        test.cardPinCodeTestFailed();
        test.cardNameTestPassed();
        test.cardNameTestFailed();
    }

    public void cardNumberTestPassed() {
        CreditCard card = new CreditCard(123456789, 2828);
        int expected = 123456789;
        int actual = card.getCardNumber();
        testResult(actual, expected, "cardNumberTestPassed");
    }

    public void cardNumberTestFailed() {
        CreditCard card = new CreditCard(123456780, 2828);
        int expected = 123456789;
        int actual = card.getCardNumber();
        testResult(actual, expected, "cardNumberTestFailed");
    }

    public void cardPinCodeTestPassed() {
        CreditCard card = new CreditCard(123456789, 2828);
        int expected = 2828;
        int actual = card.getPinCode();
        testResult(actual, expected, "cardPinCodeTestPassed");
    }

    public void cardPinCodeTestFailed() {
        CreditCard card = new CreditCard(123456789, 2830);
        int expected = 2828;
        int actual = card.getPinCode();
        testResult(actual, expected, "cardPinCodeTestFailed");
    }

    public void cardNameTestPassed() {
        CreditCard card = new CreditCard(123456789, 2828);
        String expected = "MASTERCARD";
        String actual = card.setCardName("MASTERCARD");
        testResult(actual, expected, "cardPinCodeTestPassed");
    }

    public void cardNameTestFailed() {
        CreditCard card = new CreditCard(123456789, 2828);
        String expected = "MASTERCARD";
        String actual = card.setCardName("VISA");
        testResult(actual, expected, "cardPinCodeTestFailed");
    }

    public void testResult(int actual, int expected, String testName) {
        if (actual == expected) {
            System.out.println(testName + "Test Passed;");
        } else {
            System.out.println(testName + "Test failed;");
        }
    }

    public void testResult(String actual, String expected, String testName) {
        if (actual.equals(expected)) {
            System.out.println(testName + "Test Passed;");
        } else {
            System.out.println(testName + "Test failed;");
        }
    }
}
