package students.jegors_rutkovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class OddNumbersInArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-11, 11);
        }
        System.out.println("Random array is " + Arrays.toString(numbers));

        int oddArrSize = 0;
        for (int number : numbers) {
            if (number % 2 != 0){
                oddArrSize++;
            }
        }

        int[] oddArray = new int[oddArrSize];
        int j = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddArray[j] = number;
                j++;
            }
        }

        if (oddArrSize > 0){
            System.out.println("Odd numbers in array: " + Arrays.toString(oddArray));
        } else {
            System.err.println("There is no odd numbers in array!");
        }

    }
}
