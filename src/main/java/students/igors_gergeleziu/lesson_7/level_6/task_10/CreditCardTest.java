package students.igors_gergeleziu.lesson_7.level_6.task_10;


class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.incorrectPinTest();
        test.changeCreditLimitTest();
        test.depositTest();
        test.depositWithCreditLoanTest();
        test.withdrawTest();
        test.withdrawWithCreditLimit();
        test.withdrawWithOutOfCreditLimitTest();

    }

    void incorrectPinTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.deposit(4321, 100);
        checkResult(creditCard.getBalance() == 0, "incorrectPinTest");
    }

    void depositTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.deposit(1234, 100);
        checkResult(creditCard.getBalance() == 100, "depositTest");
    }

    void withdrawTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.deposit(1234, 100);
        creditCard.withdraw(1234, 50);
        checkResult(creditCard.getBalance() == 50, "withdrawTest");
    }

    void withdrawWithCreditLimit() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.setCreditLimit(1234, 100);
        creditCard.withdraw(1234, 80);
        checkResult(creditCard.getBalance() == 0 && creditCard.getCreditLoan() == 80, "withdrawWithCreditLimit");

    }

    void changeCreditLimitTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.setCreditLimit(1234, 100);
        creditCard.withdraw(1234, 20);
        checkResult(creditCard.getBalance() == 0 && creditCard.getCreditLoan() == 20, "changeCreditLimitTest");
    }

    void depositWithCreditLoanTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.setCreditLimit(1234, 100);
        creditCard.withdraw(1234, 100);
        creditCard.deposit(1234, 50);
        checkResult(creditCard.getBalance() == 0 && creditCard.getCreditLoan() == 50, "depositWithCreditLoanTest");
    }

    void withdrawWithOutOfCreditLimitTest() {
        CreditCard creditCard = new CreditCard(123456, 1234);
        creditCard.setCreditLimit(1234, 50);
        creditCard.withdraw(1234, 60);
        checkResult(creditCard.getBalance() == 0 && creditCard.getCreditLoan() == 0, "withdrawWithOutOfCreditLimitTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
