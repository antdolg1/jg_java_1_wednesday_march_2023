package students.andrej_mihailicenko.lesson_7.level_6;

import java.util.Scanner;

class CreditCard {
    private int cardNumber;
    private int cardPin;
    private double cardBalance;
    private double cardCreditLimit;
    private double cardCreditDebt;

    public CreditCard(int cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.cardBalance = 0;
        this.cardCreditDebt = 0;
    }

    public void cardDeposit(int cardPin, double depositAmount) {
        if (pinCodeCheck(cardPin)) {
            if (cardCreditDebt >= depositAmount) {
                cardCreditDebt = cardCreditDebt - depositAmount;
            } else {
                cardBalance = cardBalance + depositAmount - cardCreditDebt;
                cardCreditDebt = 0;
            }
        }
    }

    public void cardWithdraw(int cardPin, int withdrawAmount) {
        if (pinCodeCheck(cardPin)) {
            if (cardBalance >= withdrawAmount) {
                cardBalance = cardBalance - withdrawAmount;
            } else {
                double creditSum = withdrawAmount - cardBalance;
                if (creditSum <= cardCreditLimit) {
                    cardCreditDebt = creditSum;
                    cardBalance = 0;
                } else {
                    System.out.println("Credit limit exceeded, please contact your bank!");
                }
            }
        }
    }

    boolean pinCodeCheck(int cardPin) {
        Scanner scanner = new Scanner(System.in);
        int pinAttempts = 1;
        while (pinAttempts < 3) {
            if (cardPin == this.cardPin) {
                System.out.println("Correct Pin");
                return true;
            } else {
                System.out.println("Incorrect Pin!");
                System.out.println("Please try again!");
                cardPin = scanner.nextInt();
            }
            pinAttempts++;
        }
        if (pinAttempts == 3) {
            System.out.println("You Entered Wrong Pin Code 3 Times!");
            System.out.println("Card blocked!");
            return false;
        } else {
            return true;
        }
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public double getCardCreditDebt() {
        return cardCreditDebt;
    }

    public void setCardCreditDebt(double cardCreditDebt) {
        this.cardCreditDebt = cardCreditDebt;
    }

    public double getCardCreditLimit() {
        return cardCreditLimit;
    }

    public void setCardCreditLimit(double cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }

    public int getCardPin() {
        return cardPin;
    }

    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }

    @Override
    public String toString() {
        return "Credit Card [" +
                "cardNumber=" + cardNumber +
                ", cardPin=" + cardPin +
                ", cardBalance=" + cardBalance +
                ", cardCreditLimit=" + cardCreditLimit +
                ", cardCreditDebt=" + cardCreditDebt +
                ']';
    }
}

