package students.jegors_rutkovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-1000, 1000);
        }
        System.out.println("Array = " + Arrays.toString(numbers));

        int min = numbers[0];
        for (int number : numbers) {
            if (number < min){
                min = number;
            }
        }
        System.out.println("The biggest number in array = " + min);
    }
}
