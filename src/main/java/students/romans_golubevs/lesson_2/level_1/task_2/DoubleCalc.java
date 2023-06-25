package students.romans_golubevs.lesson_2.level_1.task_2;

import java.util.Scanner;

public class DoubleCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");

        double number1 = scanner.nextDouble();
        System.out.println("Enter second number");

        double number2 = scanner.nextDouble();
        System.out.println("Results");

        double summation = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + summation);

        double subtraction = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction);

        double multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);

        double division = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + division);

    }
}