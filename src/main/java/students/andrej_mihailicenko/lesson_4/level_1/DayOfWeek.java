package students.andrej_mihailicenko.lesson_4.level_1;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number from 1 to 7!");
            int dayOfWeek = scanner.nextInt();

            switch (dayOfWeek) {
                case 1:
                    System.out.println("Monday!");
                    break;

                case 2:
                    System.out.println("Tuesday!");
                    break;

                case 3:
                    System.out.println("Wednesday!");
                    break;

                case 4:
                    System.out.println("Thursday!");
                    break;

                case 5:
                    System.out.println("Friday!");
                    break;

                case 6:
                    System.out.println("Saturday!");
                    break;

                case 7:
                    System.out.println("Sunday!");
                    break;

                default:
                    System.out.println("Unknown Day!");
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
