package students.igors_gergeleziu.lesson_3.level_4.task_16;

import students.igors_gergeleziu.lesson_3.level_4.task_16.Car;

class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
