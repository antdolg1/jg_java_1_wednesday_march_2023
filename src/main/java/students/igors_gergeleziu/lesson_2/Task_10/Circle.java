package students.igors_gergeleziu.lesson_2.Task_10;

import java.util.Scanner;
import java.math.*;

class Circle {
    public static void main(String[] args) {
        System.out.println("Test Data: ");
        System.out.println("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double square = 2 * Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Square is = " + square);
    }
}
