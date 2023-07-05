package students.igors_gergeleziu.lesson_9.level_4;

class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "Circle");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
