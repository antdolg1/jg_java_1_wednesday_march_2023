package students.pavels_serikovs.lesson_6.level_3;

import java.util.Arrays;

public class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) { // same as  for (int i = 0; i < arr.length; i++)
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int count = 0;
        for (int i : arr) { // same as (int i = 0; i < arr.length; i++)
            if (i == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i : arr) { // same as (int i = 0; i < arr.length; i++){
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i : arr) { // same as  for (int i = 0; i < arr.length; i++)
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    void revertArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        }
        Arrays.sort(arr);
    }
}
