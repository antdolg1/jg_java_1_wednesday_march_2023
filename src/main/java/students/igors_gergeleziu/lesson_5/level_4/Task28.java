package students.igors_gergeleziu.lesson_5.level_4;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Task28 test = new Task28();
        int[] array = test.generateArrayRandomSize();
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.minIntegerOfArray(array);
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

    void minIntegerOfArray(int[] array) {
        int minInteger = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] < minInteger) {
                minInteger = array[i];
            }
        }
        System.out.println("Min Integer of array: " + minInteger);
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}

