package students.romans_golubevs.lesson_2.level_2.task_8;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name!");
        String yourName = name.nextLine();
        System.out.println("Hello, " + yourName + "!");

    }
}