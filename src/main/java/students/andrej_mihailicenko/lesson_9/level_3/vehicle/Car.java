package students.andrej_mihailicenko.lesson_9.level_3.vehicle;


class Car extends Vehicle {
    private int doorsNumber;

    public Car(String brand, String model, int year, int doorsNumber){
        super(brand,model,year);
        this.doorsNumber = doorsNumber;
    }

    public int getDoorsNumber(){
        return doorsNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", doorsNumber=" + doorsNumber +
                '}';
    }
}
