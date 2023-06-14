package students.romans_golubevs.lesson_3.level_2.task_9;

import java.util.Scanner;

public class HelloName {

    public static void main(java.lang.String[] args) {

        Scanner userName = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String yourName = userName.nextLine();
        System.out.println("Hello, " + yourName + "!");
    }
}