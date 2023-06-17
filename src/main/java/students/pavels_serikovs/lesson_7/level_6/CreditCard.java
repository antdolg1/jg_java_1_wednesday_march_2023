package students.pavels_serikovs.lesson_7.level_6;

import java.util.Scanner;

public class CreditCard {

    private int cardNumber;
    private String cardName;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDebt = 0;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    public void depositMoney(int pinCode, int depositAmount) {
        if (checkPinCode(pinCode)) {
            if (creditDebt >= depositAmount) {
                creditDebt = creditDebt - depositAmount;
            } else {
                balance = balance + depositAmount - creditDebt;
                creditDebt = 0;
            }
        }
    }

    public int withdrawMoney(int pinCode, int withdrawAmount) {
        if (checkPinCode(pinCode)) {
            if (balance >= withdrawAmount) {
                balance = balance - withdrawAmount;
            } else {
                int creditSum = withdrawAmount - balance;
                if (creditSum <= creditLimit) {
                    creditDebt = creditSum;
                    balance = 0;
                } else {
                    System.out.println("Credit limit exceeded, please contact your bank!");
                }
            }
        }
        return pinCode;
    }

    private boolean checkPinCode(int pinCode) {
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
            System.out.println("You entered wrong pin code 3 times, CARD BLOCKED!!!");
            return false;
        } else {
            return true;
        }
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String setCardName(String cardName) {
        this.cardName = cardName;
        return cardName;
    }

    public int setBalance(int balance) {
        this.balance = balance;
        return balance;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard [" +
                "cardNumber=" + cardNumber +
                ", cardName='" + cardName + '\'' +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                ']';
    }
}
