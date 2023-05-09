package students.slava_khl.lesson_5.level_2;

import teacher.lesson_5.lessoncode.CustomArrayUtils;

import java.util.Random;

public class ArrayNumbers13 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();
        int randomNumber1 = random.nextInt(20);
        int randomNumber2 = random.nextInt(20);
        int randomNumber3 = random.nextInt(20);

        numbers[0] = randomNumber1;
        numbers[1] = randomNumber2;
        numbers[2] = randomNumber3;

        System.out.println("Array numbers values are: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array numbers is: " + sum);

    }
}
