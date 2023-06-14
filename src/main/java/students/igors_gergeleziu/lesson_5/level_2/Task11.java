package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Task11 test = new Task11();
        int[] array = new int[3];
        test.fillArrayByUser(array);
        test.printArray(array);


    }

    void fillArrayByUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
