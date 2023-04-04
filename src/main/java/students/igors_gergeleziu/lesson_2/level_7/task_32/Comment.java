package students.igors_gergeleziu.lesson_2.level_7.task_32;

import java.util.Scanner;

class Comment {
    //Main method opening
    public static void main(String[] args) {
        //Message for data input
        System.out.println("What is your name? ");
        /*Class Scanner
        object declaration
         */
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        //Data output
        System.out.println("Hello "+ name+"!");

    }
}
