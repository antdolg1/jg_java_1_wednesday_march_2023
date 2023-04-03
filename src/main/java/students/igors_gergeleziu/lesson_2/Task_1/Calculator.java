package students.igors_gergeleziu.lesson_2.Task_1;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber;
        double substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        System.out.println("Operations: ");
        System.out.println(firstNumber + "+" + secondNumber + "= " + addition);
        System.out.println(firstNumber + "-" + secondNumber + "= " + substraction);
        System.out.println(firstNumber + "*" + secondNumber + "= " + multiplication);
        System.out.println(firstNumber + ":" + secondNumber + "= " + division);
    }
}
