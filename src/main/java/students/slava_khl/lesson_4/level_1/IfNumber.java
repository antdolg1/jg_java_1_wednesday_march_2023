package students.slava_khl.lesson_4.level_1;

import java.util.Scanner;

public class IfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number:");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("This number is negative");
        }
        if (number > 0) {
            System.out.println("This number is positive");
        }
    }
}