package students.jegors_rutkovskis.lesson_5.level_5_level_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
        }
    }
    public void printArrayToConsole(int[] array) {
        System.out.println("[ ");
        for (int i :
                array) {
            System.out.print(i + " ");
        }
        System.out.println(" ]");
    }
    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
