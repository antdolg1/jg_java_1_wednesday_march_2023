package teacher.lesson_5.lessoncode;

import java.util.*;

public class ArraysDemo {

    public static void main(String[] args) {

        String[] animals = new String[5];

        animals[0] = "Dog";
        animals[1] = "Cat";
        animals[2] = "Lion";
        animals[3] = "Hamster";
        animals[4] = "Giraffe";
        animals[1] = "NewCat"; //this overrides value stored in second cell in animals array


//        System.out.println(animals[1]);
//
//        //String[] birds = new String[] {"Eagle", "Flamingo"}; new String[] can be ignored in this case
//        String[] birds = {"Eagle", "Flamingo", "Swan"};
//
//        System.out.println("Arrays birds length is: " + birds.length);
//
//        System.out.println("Birds array content = " + java.util.Arrays.toString(birds));


//        for (int i = 0; i < birds.length ; i++) {
//            System.out.println("[" + i + "]" + " = " + birds[i]);
//        }

//        for (String bird : birds) {
//            System.out.println(bird);
//        }
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sumNumbers = 0;
//
//        for (int number : numbers) {
//            sumNumbers = sumNumbers + number; //or sumNumbers += number;
//        }
//
//        System.out.println("Sum of all numbers in number array is: " + sumNumbers);

        int[] numbers = {12, 434, 133, 3, 0, -8, 54, -76};

        int sum = CustomArrayUtils.sumOfArrayNumbers(numbers);
        System.out.println("Sum or array numbers is: " + sum);

        int minNumber = CustomArrayUtils.minNumberInArray(numbers);
        System.out.println("Min number in array numbers is: " + minNumber);

        int maxNumber = CustomArrayUtils.maxNumberInArray(numbers);
        System.out.println("Max number in array numbers is: " + maxNumber);

        Arrays.sort(numbers, 0, numbers.length);

        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 133);

        System.out.println("Number 133 index is: " + index);

//        System.out.println(numbers[8]);

    }
}
