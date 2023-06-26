package teacher.lesson_12.lessoncode;

import java.io.IOException;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter number from 1 to 9");
            int number = scanner.nextInt();

            if (number == 0) {
                throw new CustomException("Wrong number entered");
            }
        }

    }
}
