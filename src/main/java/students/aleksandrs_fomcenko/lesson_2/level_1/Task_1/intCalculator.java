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
        System.out.println("sum = " + sum);

        int subtraction = firstNumber - secondNumber;
        System.out.println("subtraction = " + subtraction);

        int multiplication = firstNumber * secondNumber;
        System.out.println("multiplication = " + multiplication);

        int divide = firstNumber / secondNumber;
        System.out.println("divide = " + divide);
    }

}
