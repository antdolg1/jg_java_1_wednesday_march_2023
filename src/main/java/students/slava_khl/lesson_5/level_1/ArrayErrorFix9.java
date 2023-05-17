package students.slava_khl.lesson_5.level_1;

public class ArrayErrorFix9 { // in ArrayLength3

    public static void main(String[] args) {
        int[] numbers = new int[2]; // it was: int numbers = new int[2];
        System.out.println("Array's length is: " + numbers.length); // it was: System.out.println(numbers.length());

    }

}
