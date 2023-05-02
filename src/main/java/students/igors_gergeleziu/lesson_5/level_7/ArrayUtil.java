package students.igors_gergeleziu.lesson_5.level_7;


import java.util.Random;
import java.util.Scanner;

class ArrayUtil {
    int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        return scanner.nextInt();
    }

    void fillArrayByUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != array.length; i++) {
            System.out.println("Array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
    }

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    int[] generateArrayRandomSize() {
        Random random = new Random();
        return new int[random.nextInt(100)];
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

    void printEvenIntegersOfArray(int[] array) {
        System.out.println("Even Integers of array: ");
        for (int i = 0; i != array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void printOddIntegersOfArray(int[] array) {
        System.out.println("Odd Integers of array: ");
        for (int i = 0; i != array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
