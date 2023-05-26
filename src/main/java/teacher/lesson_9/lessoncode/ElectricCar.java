package teacher.lesson_9.lessoncode;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        if (batteryCapacity > 0) {
            System.out.println("Electric car switched ON!");
            batteryCapacity--;
        } else {
            System.out.println("Battery is dead, please recharge!");
        }
    }

    @Override
    public void stop() {
        System.out.println("Electric car switched OFF!");
    }

    @Override
    public boolean updateSystem() {
        if (batteryCapacity > 0) {
            System.out.println("Updating computer system...");
            batteryCapacity--;
            System.out.println("Computer system update finished!");
            return true;
        } else {
            System.out.println("Battery is empty! Please charge!");
            return false;
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }
}
