package students.edmund_zukovskis.lesson_7.level_6.task_10;

import java.util.Scanner;

public class CreditCard {

    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebit;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDebit = 0;
    }

    public void depositMoney(int pinCode, int depositAmount) {
        if (checkPinCode(pinCode)) {
            if (creditDebit <= depositAmount) {
                creditDebit = creditDebit - depositAmount;
            } else {
                balance = balance + depositAmount - creditDebit;
                creditDebit = 0;
            }
        }
    }

    public void withdrawMoney(int pinCode, int withdrawAmount) {
        if (checkPinCode(pinCode)) {
            if (balance >= withdrawAmount) {
                balance = balance - withdrawAmount;
            } else {
                int creditSum = withdrawAmount - balance;
                if (creditSum <= creditLimit) {
                    creditDebit = creditSum;
                    balance = 0;
                } else {
                    System.out.println("Credit limit exceeded, please contact your bank!");
                }
            }
        }
    }

    boolean checkPinCode(int pinCode) {
        int attemptCount = 1;
        Scanner scanner = new Scanner(System.in);

        while (attemptCount < 3) {
            if (pinCode == this.pinCode) {
                System.out.println("You entered pin code: " + pinCode);
                System.out.println("Pin code correct!");
                break;
            } else {
                System.out.println("You entered pin code: " + pinCode);
                System.out.println("Pin code incorrect! Please try again: ");
                pinCode = scanner.nextInt();
            }
            attemptCount++;
        }
        if (attemptCount == 3) {
            System.out.println("You entered wrong pin code 3 times, your card is blocked!");
            return false;
        } else {
            return true;
        }
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(int creditDebit) {
        this.creditDebit = creditDebit;
    }

    @Override
    public String toString() {
        return "CreditCard [" +
                "cardNumber=" + cardNumber +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebit=" + creditDebit +
                ']';
    }
}
