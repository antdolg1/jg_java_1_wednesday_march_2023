package students.edmund_zukovskis.lesson_9.level_4_5;

public class ShapeDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);
    }
}
