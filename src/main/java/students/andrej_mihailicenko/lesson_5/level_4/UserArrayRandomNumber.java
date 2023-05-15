package students.andrej_mihailicenko.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

class UserArrayRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userArray;

        System.out.println("Input array with random numbers lenght: ");
        userArray = scanner.nextInt();
        int[] array = new int[userArray];

        System.out.println("Arrays elements: ");
        for (int i = 0; i < userArray; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }
    }
}
