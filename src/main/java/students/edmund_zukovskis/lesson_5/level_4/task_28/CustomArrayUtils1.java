package students.edmund_zukovskis.lesson_5.level_4.task_28;

public class CustomArrayUtils1 {

    static int minNumberInArray(int[] numbers) {
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
