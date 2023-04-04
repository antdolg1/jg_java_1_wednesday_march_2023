package students.Jegors_Rutkovskis.lesson_2.level_1;

import java.util.Scanner;

class CalculatorInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введи второе число: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiply);
        System.out.println("division = " + divide);
    }
}
