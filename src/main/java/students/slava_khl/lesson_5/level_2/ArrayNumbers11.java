package students.slava_khl.lesson_5.level_2;

import java.util.Scanner;

public class ArrayNumbers11 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter first number");
        int enteredNumber1 = reader.nextInt();
        numbers[0] = enteredNumber1;

        System.out.println("Enter second number");
        int enteredNumber2 = reader.nextInt();
        numbers[1] = enteredNumber2;

        System.out.println("Enter third number");
        int enteredNumber3 = reader.nextInt();
        numbers[2] = enteredNumber3;

        System.out.println("Array cell [0] is: " + numbers[0]);
        System.out.println("Array cell [1] is: " + numbers[1]);
        System.out.println("Array cell [2] is: " + numbers[2]);

//        or

        for (int i : numbers) {
            System.out.print(i);
            System.out.print(";");
        }
    }
}
