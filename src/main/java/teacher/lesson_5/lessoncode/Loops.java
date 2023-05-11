package teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int userNumberValue = 1;

//        while (userNumberValue < 11) {
//            System.out.println("Value is: " + userNumberValue + "\n");
//            userNumberValue++;
//        }

        int value = 10;

//        while(value != 0) {
//            System.out.println("Value is: " + value);
//            value--;
//        }

        //---------------------

//        do {
//            System.out.println("Value is: " + userNumberValue);
//            userNumberValue++;
//        } while (userNumberValue <= 20);

//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Please enter number:");
//            value = scanner.nextInt();
//        } while(value != 8);
//
//        System.out.println("Got 8!!!");

        //-------

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }


    }

}
