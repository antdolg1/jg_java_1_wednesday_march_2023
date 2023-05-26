package students.pavels_serikovs.lesson_4.level_2.task_7;

import java.util.Scanner;

class TaskSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
        scan.close();
    }
}
