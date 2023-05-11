package students.pavels_serikovs.lesson_3.level_7.task_30;

public class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setCircleRadius(2);
        double radius = myCircle.getCircleRadius();
        myCircle.setCalculateArea(2 * Math.PI * radius * radius);
        double area = myCircle.getCalculateArea();
        System.out.println("The circle radius is " + radius);
        System.out.println("The circle area is " + area);
    }
}
