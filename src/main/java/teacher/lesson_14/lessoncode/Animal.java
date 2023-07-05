package teacher.lesson_14.lessoncode;

public class Animal {

    private String specie;
    private boolean canFly;
    private boolean canSwim;

    public Animal(String specie, boolean canFly, boolean canSwim) {
        this.specie = specie;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public String getSpecie() {
        return specie;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "specie='" + specie + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                '}';
    }
}
