package teacher.lesson_7.lessoncode;

import java.util.Objects;

public class Car {

    String model;
    String color;
    int maxSpeed;
    double engineVolume;

    @Override
    public String toString() {
        return "Car [" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Double.compare(car.engineVolume, engineVolume) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, engineVolume);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "VW";
        car1.color = "red";
        car1.maxSpeed = 200;
        car1.engineVolume = 2.0;

        Car car4 = new Car();
        car4.model = "VW";
        car4.color = "red";
        car4.maxSpeed = 200;
        car4.engineVolume = 2.0;

        System.out.println("Car model is " + car1.model + ", color is " + car1.color);
        System.out.println(car1);

        Car car2 = new Car();
        car1.model = "Ford";
        car1.color = "green";
        car1.maxSpeed = 180;
        car1.engineVolume = 2.2;

        Car car3 = car1;

        System.out.println("car1 == car3 - " + (car1 == car3));
        System.out.println("car1 is same as car4 - " + car1.equals(car4));

    }

}
