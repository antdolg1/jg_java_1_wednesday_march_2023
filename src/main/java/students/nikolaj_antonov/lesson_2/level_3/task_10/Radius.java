package students.nikolaj_antonov.lesson_2.level_3.task_10;

import java.util.Scanner;

class Radius {

    public static void main(String[] args) {

        System.out.println("Test Data: ");
        System.out.print("Radius = ");
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area  is = " + area);

    }
}
