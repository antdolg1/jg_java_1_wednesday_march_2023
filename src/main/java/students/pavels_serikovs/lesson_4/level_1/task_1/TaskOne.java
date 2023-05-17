package students.pavels_serikovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is negative.");
        }

        scan.close();
    }
}
