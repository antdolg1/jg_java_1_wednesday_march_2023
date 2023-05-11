package students.jegors_rutkovskis.lesson_4.level_3;

import java.util.Scanner;

class NumberEqualityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = sc.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber
                && secondNumber != thirdNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
