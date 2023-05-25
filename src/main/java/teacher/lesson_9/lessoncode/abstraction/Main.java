package teacher.lesson_9.lessoncode.abstraction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area is: " + circle.calculateArea());
        System.out.println("Circle perimeter is: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Rectangle area is: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is: " + rectangle.calculatePerimeter());
    }
}
