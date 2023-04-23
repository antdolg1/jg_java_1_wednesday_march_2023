package students.nikolaj_antonov.lesson_3.level_2.Task_9;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String myName = scanner.nextLine();

        System.out.println("Hello " + myName + "!");

    }

}
