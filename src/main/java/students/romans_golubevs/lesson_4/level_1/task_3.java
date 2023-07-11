package students.romans_golubevs.lesson_4.level_1;

import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of the week number:");

        int number = sc.nextInt();

        switch (number){

            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;

            default: System.out.println("You can enter number only between 1 and 7!"); break;
        }
    }
}