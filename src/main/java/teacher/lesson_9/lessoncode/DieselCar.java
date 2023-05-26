package teacher.lesson_9.lessoncode;

public class DieselCar extends Car {

    public DieselCar(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Start diesel engine!");
    }

    @Override
    public void stop() {
        System.out.println("Stop diesel engine!");
    }

    @Override
    public boolean updateSystem() {
        System.out.println("Update computer system!");
        return true;
    }
}
