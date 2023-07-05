package students.igors_gergeleziu.lesson_9.level_4;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4,"Rectangle");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
