package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        Task29 test = new Task29();
        int[] array = test.generateArrayRandomSize();
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.evenIntegersOfArray(array);
    }

    int[] generateArrayRandomSize() {
        Random random = new Random();
        return new int[random.nextInt(101)];
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void evenIntegersOfArray(int[] array) {
        System.out.println("Even Integers of array: ");
        for (int i = 0; i != array.length; i++) {
            if (array[i] % 2 == 0) {
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
