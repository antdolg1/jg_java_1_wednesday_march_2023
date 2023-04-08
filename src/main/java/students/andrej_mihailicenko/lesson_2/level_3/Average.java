package students.andrej_mihailicenko.lesson_2.level_3;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Input second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Input third number: ");
        double number3 = scanner.nextDouble();

        System.out.println("Average is: " + (number3 + number2 + number1)/3);

    }
}