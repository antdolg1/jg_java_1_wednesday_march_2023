package students.edmund_zukovskis.lesson_2.level_3.task_11;

import java.util.Scanner;

class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        double averageNumber = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("average number is =: " + averageNumber);


    }
}
