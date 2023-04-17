package students.pavels_serikovs.lesson_2.level_3.task_10;

import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = scan.nextDouble();
        System.out.println("Perimeter is =" + (2 * Math.PI * radius));
        System.out.println("Area is =" + (Math.PI * radius * radius));
    }
}



