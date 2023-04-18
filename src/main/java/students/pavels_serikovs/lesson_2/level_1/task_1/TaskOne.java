package students.pavels_serikovs.lesson_2.level_1.task_1;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        int summa = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        System.out.println("The sum of: " + firstNumber + "+" + secondNumber + " = " + summa);
        System.out.println("The subtraction: " + firstNumber + "-" + secondNumber + " = " + subtraction);
        System.out.println("The multiplication: " + firstNumber + "*" + secondNumber + " = " + multiplication);
        System.out.println("The division: " + firstNumber + "/" + secondNumber + " = " + division);

        scan.close();
    }
}
