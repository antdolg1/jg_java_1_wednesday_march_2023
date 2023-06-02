package students.andrej_mihailicenko.lesson_9.level_4;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Shape = " + circle + " Circle area = " + circleArea + " Circle perimeter = " + circlePerimeter);

        Shape randomShape = shapeUtil.createRandomShape();
        double randomShapeArea = shapeUtil.calculateArea(randomShape);
        double randomShapePerimeter = shapeUtil.calculatePerimeter(randomShape);
        System.out.println("Random shape = " + randomShape + " Random shape area = " + randomShapeArea + " Random shape perimeter = " + randomShapePerimeter);
    }
}
