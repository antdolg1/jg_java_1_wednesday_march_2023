package students.edmund_zukovskis.lesson_7.level_6.task_10;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {

        CreditCard visaCard = new CreditCard(55667788, 4511);
        visaCard.setCreditLimit(500);
        System.out.println(visaCard);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PIN code: ");

        visaCard.depositMoney(scanner.nextInt(), 300);
        System.out.println(visaCard);

        visaCard.withdrawMoney(scanner.nextInt(), 500);
        System.out.println(visaCard);
    }
}
