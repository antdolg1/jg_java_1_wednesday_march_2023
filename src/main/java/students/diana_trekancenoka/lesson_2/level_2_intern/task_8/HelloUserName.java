package students.diana_trekancenoka.lesson_2.level_2_intern.task_8;

import java.util.Scanner;

public class HelloUserName {
    public static void main(String[] args) {
        Scanner helloUserName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = helloUserName.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
