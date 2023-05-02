package students.edmund_zukovskis.lesson_5.level_2.task_12;

import java.util.Arrays;

class ArrayThreeFullNumber3 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 12;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
    }
}
