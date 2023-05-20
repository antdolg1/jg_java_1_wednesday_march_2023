package students.pavels_serikovs.lesson_4.level_3.task_9;

import java.util.Scanner;

class TaskNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scan.nextInt();
        if (firstNumber < secondNumber & secondNumber < thirdNumber) {
            System.out.println("the numbers are in increasing order");
        } else if (firstNumber > secondNumber & secondNumber > thirdNumber) {
            System.out.println("the numbers are in decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order, otherwise");
        }
        scan.close();
    }
}
