package students.andrej_mihailicenko.lesson_5.level_2;

import java.util.Random;

class ArrayOfThreeAverage {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            sum = sum + numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Average of numbers array is " + average);
    }
}
