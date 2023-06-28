package teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class AnimalAppNoLambda {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

//        Animal animal1 = new Animal("shark", false, true);
//        Animal animal2 = new Animal("duck", true, true);
//        Animal animal3 = new Animal("hamster", false, true);
//        Animal animal4 = new Animal("kangaroo", false, false);
//
//        animals.add(animal1);
//        animals.add(animal2);
//        animals.add(animal3);
//        animals.add(animal4);

        animals.add(new Animal("shark", false, true));
        animals.add(new Animal("duck", true, true));
        animals.add(new Animal("hamster", false, true));
        animals.add(new Animal("kangaroo", false, false));

//        printInfo(animals, new CheckCanSwim());
        printInfo(animals, new CheckCanFly());
    }

    private static void printInfo(List<Animal> animals, Checker checker) {
        for (Animal animal : animals) {
            if (checker.checkCanFlyOrSwim(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }

}
