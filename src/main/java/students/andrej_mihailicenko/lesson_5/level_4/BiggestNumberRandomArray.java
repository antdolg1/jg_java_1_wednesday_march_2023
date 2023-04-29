package students.andrej_mihailicenko.lesson_5.level_4;

import java.util.Random;

class BiggestNumberRandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];
        int max = array[0];

        System.out.println("Numbers in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Bigger number in array is: " + max);
    }
}
