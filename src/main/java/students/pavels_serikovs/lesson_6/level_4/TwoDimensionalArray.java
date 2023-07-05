package students.pavels_serikovs.lesson_6.level_4;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] table = new int[5][5];
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                table[i][j] = rand.nextInt(10);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(table[i][j] + " ");
            System.out.println();
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j]; //same as sum = sum + table[i][j];
            }
        }
        System.out.println("Array's sum is " + sum);
    }
}
