package students.edmund_zukovskis.lesson_5.level_4.task_27;

public class CustomArrayUtils {

    static int maxNumberInArray(int[] numbers) {
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }
}
