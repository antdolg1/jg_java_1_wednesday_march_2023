package students.igors_gergeleziu.lesson_9.level_4_and_level_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
      ShapeUtilDemo demo = new ShapeUtilDemo();
      demo.CircleDemo();
      demo.SquareDemo();
      demo.RectangleDemo();
      demo.TriangleDemo();
    }
    void CircleDemo(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        System.out.println("Circle area: "+circleArea);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle perimeter: "+circlePerimeter);
    }
    void SquareDemo(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square=shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        System.out.println("Square area: "+squareArea);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square perimeter: "+squarePerimeter);
    }
    void RectangleDemo(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle=shapeUtil.createRandomSquare();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        System.out.println("Rectangle area: "+rectangleArea);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle perimeter: "+rectanglePerimeter);
    }
    void TriangleDemo(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle=shapeUtil.createRandomSquare();
        double triangleArea = shapeUtil.calculateArea(triangle);
        System.out.println("Triangle area: "+triangleArea);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle perimeter: "+trianglePerimeter);
    }
}
