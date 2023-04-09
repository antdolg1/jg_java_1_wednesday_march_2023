package students.pavels_serikovs.lesson_2.level_1.task_2;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstDoubleNumber = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double secondDoubleNumber = scan.nextDouble();
        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;
        System.out.println("The sum: " + firstDoubleNumber + "+" + secondDoubleNumber + " = " + sum);
        System.out.println("The subtraction: " + firstDoubleNumber + "-" + secondDoubleNumber + " = " + sub);
        System.out.println("The multiplication: " + firstDoubleNumber + "*" + secondDoubleNumber + " = " + mult);
        System.out.println("The division: " + firstDoubleNumber + "/" + secondDoubleNumber + " = " + div);

        scan.close();
    }
}
