package students.romans_golubevs.lesson_4.level_1;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Your number " + number + " is positive!");
        }

        if (number < 0) {
            System.out.println("Your number " + number + " is negative!");
        }
    }
}