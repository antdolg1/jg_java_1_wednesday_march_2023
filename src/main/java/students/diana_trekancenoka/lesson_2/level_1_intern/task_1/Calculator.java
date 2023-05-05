package students.diana_trekancenoka.lesson_2.level_1_intern.task_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
        System.out.println(firstNumber + "-" + secondNumber + "=" + sub);
        System.out.println(firstNumber + "*" + secondNumber + "=" + multiply);
        System.out.println(firstNumber + "/" + secondNumber + "=" + division);
    }
}
