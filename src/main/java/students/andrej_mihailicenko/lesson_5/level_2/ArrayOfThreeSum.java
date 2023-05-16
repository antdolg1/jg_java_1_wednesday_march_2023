package students.andrej_mihailicenko.lesson_5.level_2;
import java.util.Random;

class ArrayOfThreeSum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            sum = sum + numbers[i];
        }
        System.out.println("All numbers sum is: " + sum);
    }
}
