package students.pavels_serikovs.lesson_2.level_2.task_8;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        scan.close();
    }

}
