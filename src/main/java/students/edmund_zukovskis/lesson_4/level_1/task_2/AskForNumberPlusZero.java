package students.edmund_zukovskis.lesson_4.level_1.task_2;

import java.util.Scanner;

public class AskForNumberPlusZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        }
    }
}
