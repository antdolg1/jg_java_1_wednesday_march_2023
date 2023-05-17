package students.diana_trekancenoka.lesson_2.level_1_intern.task_2;
import java.util.Scanner;

public class CalculatorDouble {
    public static void main(String[] args) {
        Scanner scanDouble = new Scanner(System.in);
        System.out.println("Enter first decimal number: ");
        double firstDoubleNumber = scanDouble.nextDouble();
        System.out.println("Enter second decimal number: ");
        double secondDoubleNumber = scanDouble.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double multiply = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println(firstDoubleNumber + "+" + secondDoubleNumber + "=" + sum);
        System.out.println(firstDoubleNumber + "-" + secondDoubleNumber + "=" + sub);
        System.out.println(firstDoubleNumber + "*" + secondDoubleNumber + "=" + multiply);
        System.out.println(firstDoubleNumber + "/" + secondDoubleNumber + "=" + division);

    }
}
