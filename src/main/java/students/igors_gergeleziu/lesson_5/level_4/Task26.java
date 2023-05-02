package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        Task26 test = new Task26();
        int[] array = test.generateArrayByUserSize();
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
    }

    int[] generateArrayByUserSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        return array;
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
