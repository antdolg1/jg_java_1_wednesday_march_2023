package students.andrej_mihailicenko.lesson_4.level_3;

import java.util.Scanner;

class IncreastingDecreasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("decreasing!");
        } else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("increasing!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }
}
