package teacher.lesson_3.lessoncode;

public class BankCardApp {
    public static void main(String[] args) {

        BankCard card1 = new BankCard("John Doe", 12345, 123);

        String cardHolderName = card1.holderName;
        int cardNumber = card1.cardNumber;

        System.out.println("Card balance: " + card1.balance);

        System.out.println("card1 holder name: " + cardHolderName + ", card number: " + cardNumber + ", card balance = " + card1.balance);

        card1.addMoney(500);

        System.out.println(cardNumber + " card balance is: " + card1.balance);

        card1.withdrawMoney(300);

        System.out.println(cardNumber + " card balance is: " + card1.balance);

        int finalBalance = card1.addMoney(400);

//        card1.withdrawMoney(card1.addMoney(200));

        System.out.println("Final balance = " + finalBalance);
    }
}
