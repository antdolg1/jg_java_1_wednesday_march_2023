package students.igors_gergeleziu.lesson_5.level_5_and_level_6;


import java.util.Random;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i != array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    void printArrayToConsole(int[] array) {
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }

    int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }
}
