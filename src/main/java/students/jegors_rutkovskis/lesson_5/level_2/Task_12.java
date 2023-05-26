package students.jegors_rutkovskis.lesson_5.level_2;

import java.util.Random;

class Task_12 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 11);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " +numbers[i]);
        }
    }
}
