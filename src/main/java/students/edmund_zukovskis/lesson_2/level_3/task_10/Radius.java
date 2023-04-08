package students.edmund_zukovskis.lesson_2.level_3.task_10;

import java.util.Scanner;

class Radius {
    public static void main(String[] args) {
        System.out.println("Test Data ");
        System.out.println("Enter Radius ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 3 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 3);

        System.out.println("perimeter is /n = " + perimeter);
        System.out.println("radius is = /n " + area );

    }
}
