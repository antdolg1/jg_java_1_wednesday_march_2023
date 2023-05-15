package students.edmund_zukovskis.lesson_4.level_3.task_8;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please input second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Please input third number: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("All numbers are equal");
        } else if (number1 == number2 || number1 == number3 || number2 == number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
