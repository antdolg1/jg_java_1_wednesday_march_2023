package students.slava_khl.lesson_3.level_1;

public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot();
        robot1.name = "ROBO1";

        System.out.println("Robot name:" + robot1.name);

        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.name = "ROBO2";

        System.out.println("Robot name:" + robot2.name);

        robot2.sayHello();
        robot2.sayYourName();
    }
}