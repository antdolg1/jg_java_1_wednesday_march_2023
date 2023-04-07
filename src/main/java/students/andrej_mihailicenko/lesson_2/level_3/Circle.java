package students.andrej_mihailicenko.lesson_2.level_3;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input circle radius: ");
        double rad = in.nextDouble();

        double per = 2 * Math.PI * rad;
        double area = Math.PI * Math.pow(rad,2.0); //Math.pow() возводит в степень
        System.out.println("Perimeter is = " + per);
        System.out.println("Area is = " + area);

    }
}
