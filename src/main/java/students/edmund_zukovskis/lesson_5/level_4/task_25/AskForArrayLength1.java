package students.edmund_zukovskis.lesson_5.level_4.task_25;

import java.util.Scanner;

class AskForArrayLength1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Inserted array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        System.out.println();
    }
}
