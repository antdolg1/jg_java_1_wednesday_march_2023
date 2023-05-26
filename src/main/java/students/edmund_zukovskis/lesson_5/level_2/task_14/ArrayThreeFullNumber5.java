package students.edmund_zukovskis.lesson_5.level_2.task_14;

class ArrayThreeFullNumber5 {
    public static void main(String[] args) {

        int[] numbers = {40, 60, 50};
        int result = 0;

        for (int number : numbers) {
            result += number;
        }
        System.out.println("Average number is = " + result / numbers.length);
    }
}
