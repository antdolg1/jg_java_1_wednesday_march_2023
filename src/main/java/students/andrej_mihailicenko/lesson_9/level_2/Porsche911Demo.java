package students.andrej_mihailicenko.lesson_9.level_2;

public class Porsche911Demo {
    public static void main(String[] args) {
        Porsche911 car = new Porsche911(1976, 300);
        System.out.println("Porche 911 release year: "+ car.getReleaseYear() + "\n" +"Porche 911 top speed: " + car.getTopSpeed());
    }
}
