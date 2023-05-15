package students.andrej_mihailicenko.lesson_5.level_4;

import java.util.Random;


class SmallestNumberRandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];

        System.out.println("Numbers in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Lowest number in array is: " + min);
    }
}