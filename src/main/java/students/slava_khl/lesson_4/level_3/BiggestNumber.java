package students.slava_khl.lesson_4.level_3;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner reader = new Scanner(System.in);
        int number1 = reader.nextInt();

        System.out.println("Please enter second number:  ");
        int number2 = reader.nextInt();

        System.out.println("Please enter third number:  ");
        int number3 = reader.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is the biggest numbers");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the biggest numbers");
        } else {
            System.out.println(number3 + " is the biggest numbers");
        }
    }
}
