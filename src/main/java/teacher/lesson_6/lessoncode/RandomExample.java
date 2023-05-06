package teacher.lesson_6.lessoncode;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();
        //returns a random integer
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);

        //returns a random integer value between 0 and the specified value (exclusive)
        int randomNumberWithLimit = random.nextInt(10);
        System.out.println("Random number with limit: " + randomNumberWithLimit);

        double randomDoubleNumber = random.nextDouble();
        System.out.println("Random double number: " + randomDoubleNumber);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean value: " + randomBoolean);
    }
}
