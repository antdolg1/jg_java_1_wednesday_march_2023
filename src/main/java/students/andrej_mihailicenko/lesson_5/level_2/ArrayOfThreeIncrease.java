package students.andrej_mihailicenko.lesson_5.level_2;

import java.util.Random;

class ArrayOfThreeIncrease {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        int sum = 0;
        int inc = 2;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Number = " + i + " Before increase " + numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + inc;
            System.out.println("Number = " + i + " After increase " + numbers[i]);
        }

    }
}
