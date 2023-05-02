package students.edmund_zukovskis.lesson_5.level_4.task_28;

import students.edmund_zukovskis.lesson_5.level_4.task_27.CustomArrayUtils;

public class AskForMinNumber {
    public static void main(String[] args) {

        int[] numbers = {34, 32, 76, 65, 99, -71};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array numbers are: " + numbers[i]);
        }
        System.out.println();

        int minNumber = CustomArrayUtils1.minNumberInArray(numbers);
        System.out.println("Min number in array is: " + minNumber);
    }
}
