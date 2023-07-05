package students.igors_gergeleziu.lesson_9.level_4;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test= new ShapeUtilTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }
    void calculateAreaTest(){
        ShapeUtil shapeUtil= new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3, "Circle");
        shapes[1] = new Square(5, "Square");
        shapes[2] = new Rectangle(6, 4, "Rectangle");
        shapes[3] = new Triangle(7, "Triangle");
        System.out.println("Sum of shapes area: "+shapeUtil.calculateArea(shapes));
    }
    void calculatePerimeterTest(){
        ShapeUtil shapeUtil= new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4, "Circle");
        shapes[1] = new Square(6, "Square");
        shapes[2] = new Rectangle(3, 7, "Rectangle");
        shapes[3] = new Triangle(5, "Triangle");
        System.out.println("Sum of shapes perimeter: "+shapeUtil.calculatePerimeter(shapes));
    }
}
