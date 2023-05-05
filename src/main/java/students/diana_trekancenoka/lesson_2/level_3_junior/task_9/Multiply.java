package students.diana_trekancenoka.lesson_2.level_3_junior.task_9;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(number + "x" + i + "=" + (number * i));


    }
}
