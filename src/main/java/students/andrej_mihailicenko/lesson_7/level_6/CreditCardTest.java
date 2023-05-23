package students.andrej_mihailicenko.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.testCardDeposit();
        creditCardTest.testCardWithdraw();
        creditCardTest.testCorrectPinCodeCheck();
        creditCardTest.testIncorrectPinCodeCheck();
    }

    public void testCardDeposit() {
        CreditCard creditCard = new CreditCard(123456789, 2121);
        System.out.println("Credit card deposit test: ");
        creditCard.setCardCreditDebt(100.0);
        creditCard.setCardBalance(50.0);
        creditCard.setCardCreditLimit(500.0);

        System.out.println("Initial balance: " + creditCard.getCardBalance());
        System.out.println("Initial credit debt: " + creditCard.getCardCreditDebt());

        creditCard.cardDeposit(2121, 75.0);
        System.out.println("Balance after deposit: " + creditCard.getCardBalance());
        System.out.println("Credit debt after deposit: " + creditCard.getCardCreditDebt());

        creditCard.cardDeposit(2121, 200.0);
        System.out.println("Balance after deposit: " + creditCard.getCardBalance());
        System.out.println("Credit debt after deposit: " + creditCard.getCardCreditDebt());

        //creditCard.cardDeposit(2121, 300.0);
        //System.out.println("Balance after invalid deposit: " + creditCard.getCardBalance());
        //System.out.println("Credit debt after invalid deposit: " + creditCard.getCardCreditDebt());
    }

    public void testCardWithdraw() {
        CreditCard creditCard = new CreditCard(123456789, 2121);
        System.out.println(" ");
        System.out.println("Credit card withdraw test: ");
        creditCard.setCardCreditDebt(0.0);
        creditCard.setCardBalance(100.0);
        creditCard.setCardCreditLimit(500.0);

        System.out.println("Initial balance: " + creditCard.getCardBalance());
        System.out.println("Initial credit debt: " + creditCard.getCardCreditDebt());

        creditCard.cardWithdraw(2121, 50);
        System.out.println("Balance after withdraw: " + creditCard.getCardBalance());

        creditCard.cardWithdraw(2121, 150);
        System.out.println("Balance after withdraw: " + creditCard.getCardBalance());
        System.out.println("Debt after withdraw: " + creditCard.getCardCreditDebt());

        creditCard.cardWithdraw(2121, 400);
        System.out.println("Balance after withdraw: " + creditCard.getCardBalance());
        System.out.println("Debt after withdraw: " + creditCard.getCardCreditDebt());

        creditCard.cardWithdraw(2121, 600);
        System.out.println("Debt after withdraw: " + creditCard.getCardBalance());
        System.out.println("Debt after withdraw: " + creditCard.getCardCreditDebt());
    }

    public void testCorrectPinCodeCheck() {
        CreditCard creditCard = new CreditCard(123456789, 2121);
        System.out.println(" ");
        System.out.println("Correct credit card pin test: ");

        boolean result = creditCard.pinCodeCheck(2121);
        System.out.println(result);
    }

    public void testIncorrectPinCodeCheck() {
        CreditCard creditCard = new CreditCard(123456789, 2121);
        System.out.println(" ");
        System.out.println("Incorrect credit card pin test: ");
        for (int i = 0; i < 3; i++) {
            boolean result = creditCard.pinCodeCheck(1111);
            System.out.println(result);
        }
    }
}