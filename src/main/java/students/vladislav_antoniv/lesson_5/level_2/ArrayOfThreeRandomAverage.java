package students.vladislav_antoniv.lesson_5.level_2;

import java.util.Random;

public class ArrayOfThreeRandomAverage {
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
        int average = sum / 3;
        System.out.println(average);
    }
}