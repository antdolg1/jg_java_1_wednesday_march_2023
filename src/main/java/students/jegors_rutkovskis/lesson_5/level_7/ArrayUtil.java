package students.jegors_rutkovskis.lesson_5.level_7;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    static int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        return scanner.nextInt();
    }
    static void fillArrayWithNumbersFromUser(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter [" + i + "] number: ");
            array[i] = sc.nextInt();
        }
    }
    static void fillArrayWithRandomNumbers(int[] array, int bound) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(bound);
        }
    }
    static void fillArrayWithRandomNumbers(int[] array, int origin, int bound) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(origin, bound);
        }
    }
    static void printArrayToConsole(int[] array) {
        System.out.print("Array = [ ");
        for (int i :
                array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
    static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    static int findMinNumber(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    static int[] getEvenNumbers(int[] array) {
        int evenArrSize = 0;
        for (int i : array) {
            if (i % 2 == 0){
                evenArrSize++;
            }
        }
        int[] evenArray = new int[evenArrSize];
        int j = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;
    }
    static int[] getOddNumbers(int[] array) {
        int oddArrSize = 0;
        for (int i : array) {
            if (i % 2 != 0){
                oddArrSize++;
            }
        }
        int[] oddArray = new int[oddArrSize];
        int j = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                oddArray[j] = i;
                j++;
            }
        }
        return oddArray;
    }
}
