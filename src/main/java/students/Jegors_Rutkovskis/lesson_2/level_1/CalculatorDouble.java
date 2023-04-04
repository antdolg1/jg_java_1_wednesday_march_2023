package students.Jegors_Rutkovskis.lesson_2.level_1;

import java.util.Scanner;

class CalculatorDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введи второе число: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double divide = firstNumber / secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiply);
        System.out.println("division = " + divide);
    }
}
