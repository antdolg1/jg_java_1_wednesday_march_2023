package students.andrej_mihailicenko.lesson_3.level_1;

class Robot {

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public void hello() {

        System.out.println("");
        System.out.println("Hello!");

    }

    /*public void sayYourName() {
      System.out.println("My name is Robo!");
    } */

    public Robot() {

    }
}