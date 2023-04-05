package teacher.lesson_3.lessoncode;

public class BankCard {

    public String holderName;
    public int cardNumber;
    public int cvcCode;
    public int balance;
    public String bankName;

    public BankCard(String name, int number, int cvc) {
        this.holderName = name;
        this.cardNumber = number;
        this.cvcCode = cvc;
        this.balance = 0;
        this.bankName = "Swedbank";
    }

    public int addMoney(int moneyToAdd) {
        balance = balance + moneyToAdd;// same as balance += moneyToAdd;
        return balance;
    }

    public int withdrawMoney(int moneyToWithdraw) {
        balance -= moneyToWithdraw; //same as balance = balance - moneyToWithdraw;
        return balance;
    }
}
