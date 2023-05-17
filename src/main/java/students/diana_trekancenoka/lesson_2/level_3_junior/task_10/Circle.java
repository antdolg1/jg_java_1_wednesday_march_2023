package students.diana_trekancenoka.lesson_2.level_3_junior.task_10;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is = " + area);

    }
}
