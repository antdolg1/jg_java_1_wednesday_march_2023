package students.andrej_mihailicenko.lesson_4.level_3;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Input third number!");
        int thirdNumber = scanner.nextInt();

        int max;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            max = firstNumber;
        } else if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            max = secondNumber;
        } else {
            max = thirdNumber;
        }
        System.out.println(max + " is the biggest number!");

    }
}
