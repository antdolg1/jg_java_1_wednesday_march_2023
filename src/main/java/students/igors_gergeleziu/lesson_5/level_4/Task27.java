package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        Task27 test = new Task27();
        int[] array = test.generateArrayRandomSize();
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.maxIntegerOfArray(array);

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

    void maxIntegerOfArray(int[] array) {
        int maxInteger = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > maxInteger) {
                maxInteger = array[i];
            }
        }
        System.out.println("Max Integer of array: " + maxInteger);
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
