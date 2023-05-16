package students.edmund_zukovskis.lesson_5.level_4.task_29;

public class CustomArrayUtils2 {

    static int evenNumberInArray(int[] numbers) {
        int evenNumbers = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                System.out.println("[" + i + "] " + "= " + numbers[i]);
            evenNumbers = numbers[i];
        }
        return evenNumbers;
    }
}
