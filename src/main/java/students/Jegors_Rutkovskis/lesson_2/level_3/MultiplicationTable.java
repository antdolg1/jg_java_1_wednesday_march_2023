package students.Jegors_Rutkovskis.lesson_2.level_3;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data:");
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.println("Expected output: ");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
