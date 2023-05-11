package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please input number from 1 to 6:");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1:
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

        //enhanced switch, available since java 13
        switch (inputNumber) {
            case 1, 2 -> System.out.println("Junior");
            case 3 -> System.out.println("Middle");
            case 4 -> System.out.println("Senior");
            case 5 -> System.out.println("Solution architect");
            case 6 -> System.out.println("CTO");
            default -> System.out.println("Wrong number entered!");
        }

    }
}
