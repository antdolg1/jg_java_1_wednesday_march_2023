package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Task14 test = new Task14();
        int[] array = new int[3];
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.averageOfArrayIntegers(array);
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void averageOfArrayIntegers(int[] array) {
        float sumOfIntegers = 0;
        for (int i = 0; i != array.length; i++) {
            sumOfIntegers += array[i];
        }
        System.out.println("Average of array Integers: " + sumOfIntegers / array.length);
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
