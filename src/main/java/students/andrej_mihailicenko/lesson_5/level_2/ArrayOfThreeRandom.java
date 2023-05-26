package students.andrej_mihailicenko.lesson_5.level_2;

import java.util.Random;

class ArrayOfThreeRandom {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (  int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println("Number " + i + " = " + numbers[i]);
        }
    }
}
