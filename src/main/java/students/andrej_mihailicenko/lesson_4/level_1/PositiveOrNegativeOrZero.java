package students.andrej_mihailicenko.lesson_4.level_1;
import java.util.Scanner;
class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        boolean continueProgram = true;
        while (continueProgram) {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number is negative!");
            } else if (number > 0) {
                System.out.println("Number is positive!");
            } else {
                System.out.println("Number is zero!");
            }

            System.out.println("Continue?(y/n)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                continueProgram = false;
            }
        }
    }
}
