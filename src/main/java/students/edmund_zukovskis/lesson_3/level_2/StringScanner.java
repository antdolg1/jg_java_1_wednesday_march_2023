package students.edmund_zukovskis.lesson_3.level_2;

import java.util.Scanner;

class StringScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scanner.nextLine();
        String greeting = "Hello, ";

        System.out.println(greeting.concat(name));
    }
}
