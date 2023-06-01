package students.jegors_rutkovskis.lesson_9.level_2.car;

class Car {
    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "[" +
                "releaseYear=" + releaseYear +
                ']';
    }
}
