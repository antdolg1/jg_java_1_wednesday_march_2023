package students.edmund_zukovskis.lesson_2.level_2.task_8;

import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
