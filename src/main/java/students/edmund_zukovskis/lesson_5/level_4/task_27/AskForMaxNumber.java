package students.edmund_zukovskis.lesson_5.level_4.task_27;

public class AskForMaxNumber {
    public static void main(String[] args) {

        int[] numbers = {34, 32, 76, 65, 99, -71};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array numbers are: " + numbers[i]);
        }
        System.out.println();

        int maxNumber = CustomArrayUtils.maxNumberInArray(numbers);
        System.out.println("Max number in array is: " + maxNumber);
    }
}
