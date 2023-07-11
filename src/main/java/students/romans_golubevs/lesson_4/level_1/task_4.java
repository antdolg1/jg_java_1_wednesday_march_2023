package students.romans_golubevs.lesson_4.level_1;

import java.util.Scanner;

public class task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is even!");
        }
        else {
            System.out.println("This number is odd!");
        }
    }
}