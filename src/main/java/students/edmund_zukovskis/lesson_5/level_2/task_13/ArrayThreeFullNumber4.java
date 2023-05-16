package students.edmund_zukovskis.lesson_5.level_2.task_13;

class ArrayThreeFullNumber4 {
    public static void main(String[] args) {

        int[] numbers = {11, 22, 33};
        int sumNumbers = 0;

        for (int number : numbers) {
            sumNumbers = sumNumbers + number;
        }
        System.out.println("Sum of all three numbers = " + sumNumbers);
    }
}
