package students.igors_gergeleziu.lesson_6.level_4;

import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] array = test.createTwoDimensionalArray();
        test.fillTwoDimensionalArrayWithRandomNumbers(array);
        test.printTwoDimensionalArray(array);
        System.out.println("Sum of numbers in twoDimensionalArray: " + test.sumOfNumbersInTwoDimensionalArray(array));

    }

    int[][] createTwoDimensionalArray() {
        System.out.println("Enter value of rows in twoDimensionalArray: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Enter value of columns in twoDimensionalArray: ");
        int columns = scanner.nextInt();
        int[][] twoDimensionalArray = new int[rows][columns];
        return twoDimensionalArray;

    }

    void fillTwoDimensionalArrayWithRandomNumbers(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(101);
            }
        }
    }

    int sumOfNumbersInTwoDimensionalArray(int[][] arr) {
        int sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sumOfNumbers += arr[i][j];
            }
        }
        return sumOfNumbers;
    }

    void printTwoDimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Array[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
