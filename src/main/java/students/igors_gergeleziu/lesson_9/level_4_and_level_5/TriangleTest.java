package students.igors_gergeleziu.lesson_9.level_4_and_level_5;

class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,"Triangle");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
