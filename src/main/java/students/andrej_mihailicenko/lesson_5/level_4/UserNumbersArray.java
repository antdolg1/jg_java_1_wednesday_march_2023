package students.andrej_mihailicenko.lesson_5.level_4;

import java.util.Scanner;

class UserNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userArray;

        System.out.print("Input arrays lenght: ");
        userArray = scanner.nextInt();
        int[] array = new int[userArray];

        System.out.println("Input arrays elements: ");
        for (int i = 0; i < userArray; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Arrays elements: ");
        for (int i = 0; i < userArray; i++) {
            System.out.println(array[i]);
        }
    }
}
