package teacher.lesson_9.lessoncode;

public class CarDemo {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar("Tesla", 100);
        String electricCarInfo = electricCar.toString();
        System.out.println(electricCarInfo);

        DieselCar dieselCar = new DieselCar("VW Passat");
        dieselCar.start();
        dieselCar.updateSystem();
        dieselCar.stop();
        System.out.println("------------");

        electricCar.start();
        System.out.println(electricCar);
        electricCar.updateSystem();
        System.out.println(electricCar);
        electricCar.setBatteryCapacity(0);
        System.out.println(electricCar);
        electricCar.updateSystem();
        System.out.println("------------");

        Car car1 = new ElectricCar("Tesla 2", 100);
        Car car2 = new ElectricCar("Tesla 3", 200);
        Car car3 = new DieselCar("VW Golf");
        Car car4 = new GasolineCar("Ford Mustang");

        Car[] cars = new Car[4];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;

        for (Car car : cars) {
            car.start();
        }

    }
}
