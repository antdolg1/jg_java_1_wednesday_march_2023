package students.slava_khl.lesson_4.level_2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter first whole number: ");
        int number1 = reader.nextInt();

        System.out.println("Please enter second whole number: ");
        int number2 = reader.nextInt();

        if (number1 < number2) {
            System.out.println(number1 + " is smallest number");
        } else {
            System.out.println(number2 + " is smallest number");
        }
    }
}
