package students.edmund_zukovskis.lesson_5.level_4.task_30;

public class CustomArrayUtils3 {

    static int oddNumberInArray(int[] numbers) {
        int oddNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1)
                System.out.println("[" + i + "] " + "= " + numbers[i]);
            oddNumber = numbers[i];
        }
        return oddNumber;
    }
}
