package teacher.lesson_7.lessoncode;

import java.util.Scanner;

public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard masterCard = new CreditCard(123456789, 1234);
        masterCard.setCreditLimit(300);
        masterCard.setCardName("MASTERCARD");
        System.out.println(masterCard);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PIN code: ");

        masterCard.depositMoney(scanner.nextInt(), 300);
        System.out.println(masterCard);
        masterCard.withdrawMoney(scanner.nextInt(), 500);
        System.out.println(masterCard);
    }
}
