package students.pavels_serikovs.lesson_3.level_3;

public class Robot {
    public Robot() {
    }

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
