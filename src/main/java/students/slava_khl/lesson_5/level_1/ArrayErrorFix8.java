package students.slava_khl.lesson_5.level_1;

public class ArrayErrorFix8 { // in ArrayLength2

    public static void main(String[] args) {
        int[] numbers = new int[2]; // it was: int numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
//        System.out.println(numbers[2]); // error: Index 2 out of bounds for length 2
    }

}
