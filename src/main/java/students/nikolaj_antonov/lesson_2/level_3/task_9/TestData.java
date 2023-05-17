package students.nikolaj_antonov.lesson_2.level_3.task_9;

import java.util.Scanner;

 class TestData {

    public static void main(String[] args) {
        System.out.println("Test Data: ");
        System.out.print("Input a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Expected Output: ");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

    }
}
