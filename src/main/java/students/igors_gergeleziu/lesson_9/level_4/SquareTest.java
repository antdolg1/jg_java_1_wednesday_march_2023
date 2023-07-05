package students.igors_gergeleziu.lesson_9.level_4;

class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(3, "Square");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
    }
}
