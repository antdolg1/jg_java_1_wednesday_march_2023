package students.edmund_zukovskis.lesson_4.level_3.task_9;

import java.util.Scanner;

class IncreasingOrDecreasing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3) {
            System.out.println("Increasing order");
        }
        else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing order");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}
