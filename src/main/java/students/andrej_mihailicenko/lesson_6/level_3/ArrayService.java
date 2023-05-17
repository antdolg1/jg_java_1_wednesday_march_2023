package students.andrej_mihailicenko.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {
    public static boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (numberToSearch == i) {
                return true;
            }
        }
        return false;
    }

    public static int countOccurrences(int[] arr, int numberToCount) {
        int count = 0;
        for (int i : arr) {
            if (numberToCount == i) {
                count++;
            }
        }
        return count;
    }

    public static boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public static int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    public static int[] revert(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}