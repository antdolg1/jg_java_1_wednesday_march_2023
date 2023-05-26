package students.nikolaj_antonov.lesson_2.level_1.task_1;

import java.util.Scanner;

class CalculatorInt {

    public static void main(String[] args) {

        System.out.println("Enter first number ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Sum = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

    }
}
