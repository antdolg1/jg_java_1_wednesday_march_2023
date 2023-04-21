package students.andrej_mihailicenko.lesson_4.level_3;

import java.util.Scanner;

class ThreeEqualsOrDifferent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, input second number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, input third number!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal!");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
