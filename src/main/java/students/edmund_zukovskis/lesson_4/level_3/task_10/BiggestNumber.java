package students.edmund_zukovskis.lesson_4.level_3.task_10;

import java.util.Scanner;

class BiggestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("This number is bigger: " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("This number is bigger: " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("This number is bigger: " + number3);

        }

    }
}