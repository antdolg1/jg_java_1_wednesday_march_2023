package students.edmund_zukovskis.lesson_5.lessoncode;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int userNumber = 0;

        while (userNumber <= 10) {
            System.out.println("Value is: " + userNumber + "\n");
            userNumber++;
        }

        int value = 10;

        while (value != 0) {
            System.out.println("Value is: " + value);
            value--;
        }

        int userNumberValue = 1;
        do {
            System.out.println("Value is: " + userNumberValue);
            userNumberValue++;
        } while (userNumberValue <= 20);
    }
}
