package students.igors_gergeleziu.lesson_3.level_7.task_30;
import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        System.out.println("Enter circle radius: ");
        Scanner scanner= new Scanner(System.in);
        double radius=scanner.nextDouble();
        Circle circle1= new Circle(radius);
        System.out.println("Circle area: "+circle1.calculateArea());


    }
}
