package students.slava_khl.lesson_5.level_1;

public class ArrayErrorFix7 { // in ArrayLength1

    public static void main(String[] args) {

        int[] numbers = new int[2]; // it was: int numbers = new int[2];
        System.out.println(numbers[0]); // it was: System.out.println(numbers[-1]);
        // or
        System.out.println(numbers[1]); // it was: System.out.println(numbers[-1]);

    }


}
