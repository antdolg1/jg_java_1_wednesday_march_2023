package students.jegors_rutkovskis.lesson_2.level_2;

import java.util.Scanner;

class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name);
    }
}
