package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Task13 test = new Task13();
        int[] array = new int[3];
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.summationOfArrayIntegers(array);
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void summationOfArrayIntegers(int[] array) {
        int sumOfIntegers = 0;
        for (int i = 0; i != array.length; i++) {
            sumOfIntegers += array[i];
        }
        System.out.println("Summation of array Integers: " + sumOfIntegers);
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}

