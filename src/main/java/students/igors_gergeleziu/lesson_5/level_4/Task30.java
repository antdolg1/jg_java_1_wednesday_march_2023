package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Random;

class Task30 {
    public static void main(String[] args) {
        Task30 test = new Task30();
        int[] array = test.generateArrayRandomSize();
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.oddIntegersOfArray(array);
    }

    int[] generateArrayRandomSize() {
        Random random = new Random();
        int[] array = new int[random.nextInt(101)];
        return array;
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void oddIntegersOfArray(int[] array) {
        System.out.println("Odd Integers of array: ");
        for (int i = 0; i != array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
