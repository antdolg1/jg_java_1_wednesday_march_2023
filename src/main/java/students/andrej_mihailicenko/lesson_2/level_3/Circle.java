package students.andrej_mihailicenko.lesson_2.level_3;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input circle radius: ");
        double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2.0); //Math.pow() возводит в степень
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
