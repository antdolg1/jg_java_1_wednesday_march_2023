package students.edmund_zukovskis.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        System.out.println("Please input number from 1 to 6:");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        switch (inputNumber ) {
            case 1:
                System.out.println("Intern");
                break;
            case 2:
                System.out.println("Junior");
                break;
            case 3:
                System.out.println("Middle");
                break;
            case 4:
                System.out.println("Senior");
                break;
            case 5:
                System.out.println("Solution architect");
                break;
            case 6:
                System.out.println("CTO");
                break;
            default:
                System.out.println("Wrong number entered!");
                break;
        }

    }
}
