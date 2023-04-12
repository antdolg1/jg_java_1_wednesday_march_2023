package students.jegors_rutkovskis.lesson_3.level_7;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
