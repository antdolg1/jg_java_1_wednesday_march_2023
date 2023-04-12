package students.jegors_rutkovskis.lesson_3.level_7;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        double circleArea = circle.calculateArea();
        System.out.println("Circle radius is " + circle.radius);
        System.out.println("Circle area is " + circleArea);
    }
}
