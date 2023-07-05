package students.edmund_zukovskis.lesson_6.level_4.task_21;

import static students.edmund_zukovskis.lesson_6.level_4.task_21.TwoDimensionalArrayDemo.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array = createArray(2, 5);
        printArray(array);
        int sum = calculateSum(array);
        System.out.println("Sum of all numbers in array: " + sum);
    }
}

