package students.edmund_zukovskis.lesson_4.lessoncode;

import java.util.Scanner;

public class AndOrOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter month number: ");
        int morthNumber = scanner.nextInt();

        if (morthNumber == 12 || morthNumber == 1 || morthNumber == 2) {
            System.out.println("WINTER");
        } else if (morthNumber == 3 || morthNumber == 4 || morthNumber == 5) {
            System.out.println("SPRING");
        } else if (morthNumber == 6 || morthNumber == 7 || morthNumber == 8){
            System.out.println("SUMMER");
        } else if (morthNumber == 9 || morthNumber == 10 || morthNumber == 11) {
            System.out.println("AUTUMN");
        } else {
            System.out.println("Are you from this planet? ");
        }



    }
}
