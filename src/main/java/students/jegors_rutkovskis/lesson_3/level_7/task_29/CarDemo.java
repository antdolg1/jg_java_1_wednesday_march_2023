package students.jegors_rutkovskis.lesson_3.level_7.task_29;

class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car("BMW X5", "Black", 200);
        bmw.printCarState();
        bmw.accelerate(100);
        bmw.printCarState();

        bmw.brake();
        bmw.printCarState();

        bmw.accelerate(200);
        bmw.accelerate(1);

        bmw.brake();

        bmw.printCarState();

        bmw.refuel(20);

    }

}
