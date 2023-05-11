package students.slava_khl.lesson_3.level_2;

import java.util.Scanner;

public class StringGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Name ?");
        String myName = scanner.nextLine();

        String greeting = "Hi " + myName + "!";
        System.out.print(greeting);
    }
}
