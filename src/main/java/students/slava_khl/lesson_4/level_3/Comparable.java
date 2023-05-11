package students.slava_khl.lesson_4.level_3;

import java.util.Scanner;

public class Comparable {

    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner reader = new Scanner(System.in);
        int number1 = reader.nextInt();

        System.out.println("Please enter second number:  ");
        int number2 = reader.nextInt();

        System.out.println("Please enter third number:  ");
        int number3 = reader.nextInt();

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 != number3 && number2 != number3 && number1 != number2) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
