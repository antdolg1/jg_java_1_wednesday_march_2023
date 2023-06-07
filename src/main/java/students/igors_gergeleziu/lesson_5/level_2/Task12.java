package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        Task12 test = new Task12();
        int[] array = new int[3];
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
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

