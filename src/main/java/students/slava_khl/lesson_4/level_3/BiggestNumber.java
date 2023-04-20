package students.slava_khl.lesson_4.level_3;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner reader = new Scanner(System.in);
        int Number1 = reader.nextInt();

        System.out.println("Please enter second number:  ");
        int Number2 = reader.nextInt();

        System.out.println("Please enter third number:  ");
        int Number3 = reader.nextInt();

        if (Number1 > Number2 && Number1 > Number3) {
            System.out.println(Number1 + " is the biggest numbers");
        } else if (Number2 > Number1 && Number2 > Number3) {
            System.out.println(Number2 + " is the biggest numbers");
        } else {
            System.out.println(Number3 + " is the biggest numbers");
        }
    }
}
