package students.vladislav_antoniv.lesson_5.level_2;

import java.util.Random;

public class ArrayOfThreeRandomSum {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
