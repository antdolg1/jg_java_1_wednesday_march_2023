package students.jegors_rutkovskis.lesson_12.level_3;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number: ");
            try {
                int number = Integer.parseInt(sc.nextLine());
                System.out.println("Your number is " + number);
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
    }
}
