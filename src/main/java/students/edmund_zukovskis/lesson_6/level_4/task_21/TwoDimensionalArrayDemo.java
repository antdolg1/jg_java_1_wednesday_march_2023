package students.edmund_zukovskis.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimensionalArrayDemo {
    public static int[][] createArray(int arrayRows, int arrayNumbers) {
        int[][] array = new int[arrayRows][arrayNumbers];
        Random random = new Random();
        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < arrayNumbers; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
