package students.jegors_rutkovskis.lesson_9.level_2.car;

class Porsche911 extends Car {
    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911 [" +
                "topSpeed=" + topSpeed +
                "] " + super.toString();
    }
}
