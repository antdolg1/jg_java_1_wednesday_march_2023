package students.jegors_rutkovskis.lesson_9.level_4_5.shapes;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        Shape square = shapeUtil.createRandomSquare();
        Shape rectangle = shapeUtil.createRandomRectangle();
        Shape triangle = shapeUtil.createRandomTriangle();

        Shape randomShape = shapeUtil.createRandomShape();
        System.out.println(randomShape);
        System.out.println("-------------");

        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println(triangle);
        System.out.println("Area = " + triangleArea);
        System.out.println("Perimeter = " + trianglePerimeter);
        System.out.println();


        Shape[] shapes = {
                circle,
                square,
                rectangle,
                triangle
        };
        double sumOfShapesAreas = shapeUtil.calculateArea(shapes);
        double sumOfShapesPerimeters = shapeUtil.calculatePerimeter(shapes);

        System.out.println("Sum of ares = " + Math.round(sumOfShapesAreas));
        System.out.println("Sum of perimeters = " + Math.round(sumOfShapesPerimeters));
    }
}
