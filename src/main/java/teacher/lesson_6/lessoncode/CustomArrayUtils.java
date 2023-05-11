package teacher.lesson_6.lessoncode;

import java.util.Random;
import java.util.Scanner;

public class CustomArrayUtils {

    static void printArrayToConsole(String[] array) {
        System.out.print("Array contents: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printArrayToConsole(int[] array) {
        System.out.print("Array contents: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static int sumOfArrayNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static int minNumberInArray(int[] numbers) {
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }

    static int maxNumberInArray(int[] numbers) {
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    static int getArrayLengthFromUser() {
        System.out.println("Please enter array length: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    static void fillArrayWithNumbersFromUser(int[] arrayToFill) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayToFill.length; i++) {
            System.out.println("Enter value for array element with index " + i);
            arrayToFill[i] = scanner.nextInt();
        }
    }

    static void fillArrayWithStringsFromUser(String[] arrayToFill) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayToFill.length; i++) {
            System.out.println("Enter value for array element with index " + i);
            arrayToFill[i] = scanner.nextLine();
        }
    }

    static void fillArrayWithRandomNumbers(int[] arrayToFill) {
        Random random = new Random();
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = random.nextInt();
        }
    }

    static void fillArrayWithRandomNumbersWithLimit(int[] arrayToFill, int limit) {
        Random random = new Random();
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = random.nextInt(limit);
        }
    }

    static boolean arraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean containsStringValue(String[] array, String value) {
        for (String element : array) {
            if (value.equals(element)) {
                return true;
            }
        }
        return false;
    }

}
