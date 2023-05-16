package students.slava_khl.lesson_5.level_2;

import java.util.Random;

public class ArrayNumbers15 {

    public static void main(String[] args) {

//        int[] numbers = new int[3];

        Random random = new Random();

        int randomNumber1 = random.nextInt(20);
        int randomNumber2 = random.nextInt(20);
        int randomNumber3 = random.nextInt(20);

        int[] numbers = {randomNumber1, randomNumber2, randomNumber3};
//        numbers[1] = randomNumber2;
//        numbers[2] = randomNumber3;

        System.out.println("Array numbers values are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " = " + numbers[i]);
        }

        System.out.println("Array numbers values after addition are: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 2;
            System.out.println(i + " = " + numbers[i]);
        }
    }
}

