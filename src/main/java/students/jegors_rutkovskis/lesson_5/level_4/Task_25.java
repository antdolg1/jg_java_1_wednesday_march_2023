package students.jegors_rutkovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrSize = scanner.nextInt();
        int[] numbers = new int[arrSize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter [" + i + "] number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(numbers));
    }
}
