package teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class AnimalAppWithLambda {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("shark", false, true));
        animals.add(new Animal("duck", true, true));
        animals.add(new Animal("hamster", false, true));
        animals.add(new Animal("kangaroo", false, false));

        printInfo(animals, a -> a.isCanFly()); //is the same as printInfo(animals, new CheckCanSwim());

        printInfo(animals, (Animal a) -> {
            return a.isCanSwim();
        }); //same as on line 17, only on line 17 is simplified version

        //lambda expression without parameters
//        printInfo(animals, () -> true);

        //lambda expression with one parameter
        printInfo(animals, a -> a.isCanFly());

        //lambda expression with one parameter and its type
        printInfo(animals, (Animal a) -> a.isCanFly());

        //lambda expression with two parameters
//        printInfo(animals, (a, b) -> a.isCanFly());

        //lambda expression with two parameters and types
//        printInfo(animals, (Animal a, Animal b) -> a.isCanFly());




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
