package students.pavels_serikovs.lesson_4.level_2.task_5;

import java.util.Scanner;

class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("The greater number is " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("The greater number is " + secondNumber);
        } else {
            System.out.println(firstNumber + " = " + secondNumber +" Numbers are equals");
        }
        scan.close();
    }
}
