package students.andrej_mihailicenko.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Rider");
        robot1.hello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.hello();
        robot2.sayYourName();

    }
}
