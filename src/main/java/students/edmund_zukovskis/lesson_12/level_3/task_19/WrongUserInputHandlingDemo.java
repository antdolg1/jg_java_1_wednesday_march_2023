package students.edmund_zukovskis.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Please put in number: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error appeared: invalid number! ");
            }
        }
        System.out.println("This number is correct " + number);
    }
}
