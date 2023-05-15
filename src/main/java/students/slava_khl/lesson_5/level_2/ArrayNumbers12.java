package students.slava_khl.lesson_5.level_2;

import java.util.Random;

public class ArrayNumbers12 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);
        int randomNumber3 = random.nextInt(10);


        int[] numbers = new int[3];

        numbers[0] = randomNumber1;
        numbers[1] = randomNumber2;
        numbers[2] = randomNumber3;

        // or

//        int[] numbers = {randomNumber1, randomNumber2, randomNumber3};

        System.out.println("Array numbers values are: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);

        // or

//        System.out.println("Array numbers values are: " + java.util.Arrays.toString(numbers));

    }

}
