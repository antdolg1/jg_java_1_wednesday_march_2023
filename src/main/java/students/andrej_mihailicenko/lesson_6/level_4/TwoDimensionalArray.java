package students.andrej_mihailicenko.lesson_6.level_4;

import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {

    public int[][] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность первого измерения массива: ");
        int arrayLength1 = scanner.nextInt();
        System.out.println("Введите размерность второго измерения массива: ");
        int arrayLength2 = scanner.nextInt();
        int[][] nums = new int[arrayLength1][arrayLength2];
        return nums;
    }

    public int[][] getRandomNumberArrays() {
        Random random = new Random();
        int[][] nums = getArray();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(1000);
            }
        }
        return nums;
    }

    public int arraysNumberSum() {
        int[][] nums = getRandomNumberArrays();
        int totalSum = 0;
        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                totalSum += num[j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + totalSum);
        return totalSum;
    }
}