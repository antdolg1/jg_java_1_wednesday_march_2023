package students.diana_trekancenoka.lesson_2.level_3_junior.task_11;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer one: ");
        double number = scanner.nextInt();
        System.out.println("Enter integer two: ");
        double number2 = scanner.nextInt();
        System.out.println("Enter integer three: ");
        double number3 = scanner.nextInt();

        double result = (number + number2 + number3) / 3;
        System.out.println("Arithmetic mean is " + result);
    }
}
