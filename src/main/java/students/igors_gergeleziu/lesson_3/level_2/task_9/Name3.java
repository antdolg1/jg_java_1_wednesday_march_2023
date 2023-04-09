package students.igors_gergeleziu.lesson_3.level_2.task_9;

import java.util.Scanner;

class Name3 {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
