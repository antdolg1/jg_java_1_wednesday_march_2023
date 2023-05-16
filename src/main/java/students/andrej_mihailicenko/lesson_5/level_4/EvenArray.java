package students.andrej_mihailicenko.lesson_5.level_4;

import java.util.Random;

class EvenArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[6];

        System.out.println("Arrays elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.println(array[i]);
        }

        System.out.println("Even elements: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
