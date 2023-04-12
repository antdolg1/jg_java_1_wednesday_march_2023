package students.aleksandrs_fomcenko.lesson_2.level_1.Task_1;
import  java.util.Scanner;
public class intCalculator {
    public static void main(String[] args)  {
        System.out.println("Input first number" );
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number" );
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;

        System.out.println("sum = " + sum);
        System.out.println("subtraction = " + subtraction);
        System.out.println("multiplication = " + multiplication);
        System.out.println("divide = " + divide);
    }

}
