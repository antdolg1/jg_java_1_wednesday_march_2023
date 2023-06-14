package students.vladislav_antoniv.lesson9.level_2;

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public static void main(String[] args) {
        Porsche911 porsche911 = new Porsche911(2022, 250);
        System.out.println("ReleaseYear: " + porsche911.getReleaseYear());
        System.out.println("Top Speed: " + porsche911.getTopSpeed());
    }

}