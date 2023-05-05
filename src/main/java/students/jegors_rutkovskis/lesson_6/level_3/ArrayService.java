package students.jegors_rutkovskis.lesson_6.level_3;

import java.util.Random;

class ArrayService {
    boolean isContainsValue(int[] array, int value) {
        for (int i : array) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }
    int countIntegerOccurrences(int[] array, int value) {
        int count = 0;
        for (int i : array) {
            if (value == i) {
                count++;
            }
        }
        return count;
    }
    boolean replaceFirstOccurrence(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }
    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                count++;
            }
        }
        return count;
    }
    void reverseArray(int[] array) {
        int size = array.length;
        int[] reversedArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            reversedArray[size - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }
    void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    void fillWithRandoms(int[] arr, int origin, int bound) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
    }
    boolean isSortedArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
