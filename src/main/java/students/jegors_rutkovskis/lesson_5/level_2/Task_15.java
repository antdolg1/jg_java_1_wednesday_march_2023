package students.jegors_rutkovskis.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 10);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
