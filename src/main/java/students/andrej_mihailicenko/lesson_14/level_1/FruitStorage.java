package students.andrej_mihailicenko.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }



// Моя реализация
//    public List<String> findApplesByColour(List<Apple> apples, String colour) {
//        String greenApples = getAllApples().stream()
//                .filter(a -> a.getColor().equals(colour))
//                .collect(Collectors.toList()).toString();
//
//        ArrayList<String> findApple = new ArrayList<>();
//        apples.iterator();
//        findApple.add(greenApples);
//        return findApple;
//    }
//
//    public List<String> findApplesByWeight(List<Apple> apples, int weight) {
//        String greenApples = getAllApples().stream()
//                .filter(a -> a.getWeight() >= weight )
//                .collect(Collectors.toList()).toString();
//
//        ArrayList<String> findApple = new ArrayList<>();
//        apples.iterator();
//        findApple.add(greenApples);
//        return findApple;
//    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
