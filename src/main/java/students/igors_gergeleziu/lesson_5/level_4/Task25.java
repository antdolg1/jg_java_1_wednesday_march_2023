package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Task25 test = new Task25();
        int[] array = test.generateArrayByUserSize();
        test.fillArrayByUser(array);
        test.printArray(array);
    }

    int[] generateArrayByUserSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        return array;
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
