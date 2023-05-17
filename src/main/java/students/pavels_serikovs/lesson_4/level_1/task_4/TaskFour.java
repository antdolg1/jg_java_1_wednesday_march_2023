package students.pavels_serikovs.lesson_4.level_1.task_4;

import java.util.Scanner;

class TaskFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        scan.close();
    }
}
