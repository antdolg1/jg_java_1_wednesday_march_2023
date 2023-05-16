package students.jegors_rutkovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class EvenNumbersInArray {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-101, 101);
        }
        System.out.println("Array = " + Arrays.toString(numbers));

        int evenArrSize = 0;
        for (int number : numbers) {
            if (number % 2 == 0){
                evenArrSize++;
            }
        }

        int[] evenArray = new int[evenArrSize];
        int j = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenArray[j] = number;
                j++;
            }
        }

        if (evenArrSize > 0){
            System.out.println("Even numbers in array: " + Arrays.toString(evenArray));
        } else {
            System.err.println("There is no even numbers in array!");
        }

    }
}
