package students.slava_khl.lesson_4.level_1;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7: ");

        int enteredNumber = scan.nextInt();

        switch (enteredNumber) {
            case 1 -> System.out.println("This is Monday");
            case 2 -> System.out.println("This is Tuesday");
            case 3 -> System.out.println("This is Wednesday");
            case 4 -> System.out.println("This is Thursday");
            case 5 -> System.out.println("This is Friday");
            case 6 -> System.out.println("This is Saturday");
            case 7 -> System.out.println("This is Sunday");
            default -> System.out.println("Wrong number entered!");
        }
    }
}
