package students.andrej_mihailicenko.lesson_4.level_1;

import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        boolean continueProgram = true;
        while (continueProgram) {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number is negative!");
            } else {
                System.out.println("Number is positive!");
            }

            String answer;
            while (true) {
                System.out.println("Continue?(y/n)");
                answer = scanner.next();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
            if (answer.equalsIgnoreCase("n")) {
                continueProgram = false;
            }
        }
    }
}

