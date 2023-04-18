package students.andrej_mihailicenko.lesson_4.level_2;

import java.util.Scanner;

class SmallerBiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input first integer number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Input second integer number: ");
            int secondNumber = scanner.nextInt();

            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " bigger than " + secondNumber);
            } else if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " smaller than " + secondNumber);
            } else if (firstNumber == secondNumber) {
                System.out.println(firstNumber + " numbers is equals " + secondNumber);
            } else {
                System.out.println("Enter correct number!");
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
