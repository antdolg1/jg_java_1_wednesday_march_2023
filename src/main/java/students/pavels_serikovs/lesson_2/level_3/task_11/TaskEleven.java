package students.pavels_serikovs.lesson_2.level_3.task_11;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double numberOne = scan.nextInt();
        System.out.println("Enter the second number: ");
        double numberTwo = scan.nextInt();
        System.out.println("Enter the third number: ");
        double numberThree = scan.nextInt();
        double average = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("The average result is " + average);
    }

}
