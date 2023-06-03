package students.edmund_zukovskis.lesson_9.level_6.task_30;

public class Varargs {
    public static void main(String[] args) {

        printNumbers(1, 2, 3);
        printNumbers(7, 8, 5, 4);

    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
