package students.edmund_zukovskis.lesson_5.level_4.task_29;

import students.edmund_zukovskis.lesson_5.level_4.task_28.CustomArrayUtils1;

public class FindAllEvenNumbers {
    public static void main(String[] args) {

        int[] numbers = {34, 32, 76, 65, 99, -71};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] " + "= " + numbers[i]);
        }
        System.out.println();
        int evenNumbers = CustomArrayUtils2.evenNumberInArray(numbers);
    }
}