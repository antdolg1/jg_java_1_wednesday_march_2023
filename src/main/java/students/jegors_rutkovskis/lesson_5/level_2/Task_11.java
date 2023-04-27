package students.jegors_rutkovskis.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number for index [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " +numbers[i]);
        }
    }
}
