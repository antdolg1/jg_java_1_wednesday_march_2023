package students.igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Task15 test = new Task15();
        int[] array = new int[3];
        test.fillArrayWithRandomIntegers(array);
        test.printArray(array);
        test.add2ToArrayIntegers(array);
        test.printArray(array);
    }

    void fillArrayWithRandomIntegers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    void add2ToArrayIntegers(int[] array) {
        for (int i = 0; i != array.length; i++) {
            array[i] += 2;
        }
        System.out.println("------------------------- +2");
    }

    void printArray(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }

}
