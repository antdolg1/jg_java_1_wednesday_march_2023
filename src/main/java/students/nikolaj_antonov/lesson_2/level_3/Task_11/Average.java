package students.nikolaj_antonov.lesson_2.level_3.Task_11;

import java.util.Scanner;

class Average {

    public static void main(String[] args) {

        System.out.println("Enter first number ");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextInt();
        System.out.println("Enter second number ");
        double secondNumber = scanner.nextInt();
        System.out.println("Enter second number ");
        double thirdNumber = scanner.nextInt();

        double result = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average is " + result);
    }
}
