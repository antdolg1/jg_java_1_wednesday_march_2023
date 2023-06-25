package students.romans_golubevs.lesson_2.level_1.task_1;

import java.util.Scanner;

public class IntCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        int number1 = scanner.nextInt();
        System.out.println("Enter second number");

        int number2 = scanner.nextInt();
        System.out.println("Results");

        int summation = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + summation);

        int subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);

        int multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        int division = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

    }
}