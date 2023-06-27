package students.andrej_mihailicenko.lesson_12.level_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            int correctNumber = scanner.nextInt();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Wrong Number! Try again and write correct number!");
        }

    }
}
