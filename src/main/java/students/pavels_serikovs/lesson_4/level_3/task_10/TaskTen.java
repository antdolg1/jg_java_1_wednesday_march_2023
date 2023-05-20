package students.pavels_serikovs.lesson_4.level_3.task_10;

import java.util.Scanner;

class TaskTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scan.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The biggest number is " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The biggest number is " + thirdNumber);
        }
        scan.close();
    }
}
