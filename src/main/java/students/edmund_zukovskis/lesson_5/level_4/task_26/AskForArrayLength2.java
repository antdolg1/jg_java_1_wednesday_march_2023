package students.edmund_zukovskis.lesson_5.level_4.task_26;

import java.util.Scanner;

class AskForArrayLength2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) + 15);
            System.out.println(array[i]);
        }

        System.out.println("Inserted array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
        System.out.println();
    }
}
