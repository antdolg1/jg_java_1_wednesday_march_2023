package students.andrej_mihailicenko.lesson_2.level_3;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        double number1 = in.nextDouble();
        System.out.println("Input second number: ");
        double number2 = in.nextDouble();
        System.out.println("Input third number: ");
        double number3 = in.nextDouble();

        System.out.println("Average is: " + (number3 + number2 + number1)/3);

    }
}