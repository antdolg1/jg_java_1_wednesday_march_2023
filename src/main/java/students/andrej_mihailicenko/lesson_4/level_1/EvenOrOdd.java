package students.andrej_mihailicenko.lesson_4.level_1;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input number: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Number is even!");
            } else {
                System.out.println("Number is odd!");
            }

            System.out.println("Continue?(y/n)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                break;
            } else if (answer.equalsIgnoreCase("y")) {

            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        }
    }
}