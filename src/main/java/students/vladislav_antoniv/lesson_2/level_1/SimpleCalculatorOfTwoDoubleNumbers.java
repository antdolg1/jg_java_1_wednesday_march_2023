package students.vladislav_antoniv.lesson_2.level_1;

import java.util.Scanner;

public class SimpleCalculatorOfTwoDoubleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber = sc.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = sc.nextDouble();

        double sum = firstNumber * secondNumber;
        double substraction = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double divide = firstNumber / secondNumber;

        System.out.println("The sum of your 2 numbers is: " + sum);
        System.out.println("The substraction of your 2 numbers is: " + substraction);
        System.out.println("The multiply of your 2 numbers is: " + multiply);
        System.out.println("The divide of your 2 numbers is: " + divide);

    }
}
