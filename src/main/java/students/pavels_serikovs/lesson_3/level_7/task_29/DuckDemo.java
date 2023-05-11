package students.pavels_serikovs.lesson_3.level_7.task_29;

public class DuckDemo {
    public static void main(String[] args) {
        Duck duck1 = new Duck("grey", 5, "Kra, kra!!!");
        System.out.println("Duck is " + duck1.duckAge + " years old." + " Duck's color is " + duck1.duckColor);
        System.out.println(duck1.duckSay);
    }
}
