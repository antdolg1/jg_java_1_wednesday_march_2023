package students.igors_gergeleziu.lesson_3.level_7.task_30;
class Circle {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return Math.PI*Math.pow(this.radius,2);

    }
}
