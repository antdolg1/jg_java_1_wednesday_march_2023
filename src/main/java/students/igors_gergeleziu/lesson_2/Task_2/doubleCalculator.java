package students.igors_gergeleziu.lesson_2.Task_2;
import java.util.Scanner;
class doubleCalculator {
    public static void main(String[]args){
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();
        double addition = firstNumber + secondNumber;
        double substraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        System.out.println("Operations: ");
        System.out.println(firstNumber + "+" + secondNumber + "= " + addition);
        System.out.println(firstNumber + "-" + secondNumber + "= " + substraction);
        System.out.println(firstNumber + "*" + secondNumber + "= " + multiplication);
        System.out.println(firstNumber + ":" + secondNumber + "= " + division);
    }
}
