package students.igors_gergeleziu.lesson_7.level_6.task_10;

class CreditCard {
    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditLoan;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLoan = 0;
    }

    void setCreditLimit(int pinCode, int limit) {
        if (pinCode == this.pinCode) {
            this.creditLimit = limit;
        } else System.out.println("Incorrect PIN CODE, credit limit operation denied");
    }

    int getBalance() {
        return balance;
    }

    int getCreditLoan() {
        return creditLoan;
    }

    void deposit(int pinCode, int depositAmount) {
        if (pinCode == this.pinCode) {
            if (creditLoan >= depositAmount) {
                creditLoan -= depositAmount;
            } else {
                balance = depositAmount - creditLoan;
                creditLoan = 0;
            }
        } else System.out.println("Incorrect PIN CODE, withdraw operation denied");
    }

    void withdraw(int pinCode, int withdrawAmount) {
        if (pinCode == this.pinCode) {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
            } else if (creditLimit >= withdrawAmount - balance) {
                creditLoan = withdrawAmount - balance;
                balance = 0;
            } else System.out.println("Out of credit limit, withdraw operation denied");
        } else System.out.println("Incorrect PIN CODE, withdraw operation denied");

    }
}
