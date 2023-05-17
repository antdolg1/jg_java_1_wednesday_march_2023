package students.edmund_zukovskis.lesson_5.level_4.task_30;

import students.edmund_zukovskis.lesson_5.level_4.task_29.CustomArrayUtils2;

public class FindAllOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {34, 32, 76, 65, 99, 71};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] " + "= " + numbers[i]);
        }
        System.out.println();
        int oddNumber = CustomArrayUtils3.oddNumberInArray(numbers);
    }
}
