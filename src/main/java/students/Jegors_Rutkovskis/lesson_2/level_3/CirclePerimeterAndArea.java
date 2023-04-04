package students.Jegors_Rutkovskis.lesson_2.level_3;

import java.util.Scanner;

class CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Test data: \nRadius = " + radius + "\n");
        System.out.println("Expected output \nPerimeter is = " + perimeter);
        System.out.println("Radius is = " + area);
    }
}
