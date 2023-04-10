package students.jegors_rutkovskis.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Alex");
        Robot robot2 = new Robot("John");
        Robot robot3 = new Robot("Bob");
        Robot robot4 = new Robot("TERMINATOR");

        robot1.sayHello();
        robot1.sayYourName();

        robot2.sayHello();
        robot2.sayYourName();

        robot3.sayYourName();
        robot4.sayYourName();
    }
}
