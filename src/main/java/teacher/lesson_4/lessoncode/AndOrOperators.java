package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class AndOrOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter month number: ");
//        int monthNumber = scanner.nextInt();
//
//        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
//            System.out.println("WINTER");
//        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
//            System.out.println("SPRING");
//        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
//            System.out.println("SUMMER");
//        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
//            System.out.println("AUTUMN");
//        } else {
//            System.out.println("Are you from this planet?");
//        }


        System.out.println("Please input number: ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("Number is between 10 and infinity");
        } else if (number == 7) {
            System.out.println("This is lucky seven!");
        } else if (number < 7 && number > 0) {
            System.out.println("Number is between 1 and 6");
        } else if (number >= -2) {
            System.out.println("Number is -2 or greater");
        }
    }
}
