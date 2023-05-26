package teacher.lesson_9.lessoncode;

public class GasolineCar extends Car implements Tunable, Flyable {
    public GasolineCar(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Start gasoline engine!");
    }

    @Override
    public void stop() {
        System.out.println("Start gasoline engine!");
    }

    @Override
    public boolean updateSystem() {
        return false;
    }

    @Override
    public void tune() {
        System.out.println("Pimping my ride!");
    }

    @Override
    public void fly() {
        System.out.println("Car is flying!");
    }
}
