package students.nikolaj.antonov.lesson_3.level_3.Task_11_12_13;

class Robot {
    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
