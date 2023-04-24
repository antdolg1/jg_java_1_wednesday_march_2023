package students.edmund_zukovskis.lesson_4.level_2.task_6;

import java.util.Scanner;

class WhichNumberIsLower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input first number: ");
        System.out.println("Please input second number: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println("This number is lower " + number1);
        } else if (number1 > number2) {
            System.out.println("This number is lower " + number2);
        }
    }
}
