package students.slava_khl.lesson_4.level_1;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter whole number : ");

        int enteredNumber = reader.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println(enteredNumber + " it is Even number");
        } else {
            System.out.println(enteredNumber + " it is Odd number");
        }
    }
}