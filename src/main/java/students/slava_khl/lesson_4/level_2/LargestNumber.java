package students.slava_khl.lesson_4.level_2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first whole number: ");
        int Number1 = reader.nextInt();

        System.out.println("Please enter second whole number: ");
        int Number2 = reader.nextInt();

        if (Number1 > Number2) {
            System.out.println(Number1 + " is largest number");
        } else {
            System.out.println(Number2 + " is largest number");
        }
    }
}