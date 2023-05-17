package students.pavels_serikovs.lesson_4.level_1.task_2;

import java.util.Scanner;

class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " = zero");
        }
        scan.close();
    }
}
