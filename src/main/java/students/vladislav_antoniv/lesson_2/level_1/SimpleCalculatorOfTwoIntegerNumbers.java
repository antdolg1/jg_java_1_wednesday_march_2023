package students.vladislav_antoniv.lesson_2.level_1;

import java.util.Scanner;

public class SimpleCalculatorOfTwoIntegerNumbers {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        int sum = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println("The sum of your 2 numbers is: " + sum);
        System.out.println("The substraction of your 2 numbers is: " + substraction);
        System.out.println("The multiplication of your 2 numbers is: " + multiply);
        System.out.println("The division of your 2 numbers is: " + divide);
    }
}