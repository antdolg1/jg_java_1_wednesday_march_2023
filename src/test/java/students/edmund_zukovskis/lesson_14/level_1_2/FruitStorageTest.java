package students.edmund_zukovskis.lesson_14.level_1_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FruitStorageTest {

    @Test
    public void findApplesByColorTest() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();

        List<Apple> greenApples = fruitStorage.findApplesByColor(allApples, "green");
        List<Apple> redApples = fruitStorage.findApplesByColor(allApples, "red");
        List<Apple> yellowApples = fruitStorage.findApplesByColor(allApples, "yellow");

        int expectedGreenCount = 3;
        int expectedRedCount = 3;
        int expectedYellowCount = 2;

        assertEquals(expectedGreenCount, greenApples.size());
        assertEquals(expectedRedCount, redApples.size());
        assertEquals(expectedYellowCount, yellowApples.size());
    }

    //    @Test
    //   void testFindApplesByWeight() {
    //      FruitStorage fruitStorage = new FruitStorage();
    //      List<Apple> allApples = fruitStorage.getAllApples();

    //      List<Apple> heavyApples = fruitStorage.findApplesByWeight(allApples, apple -> apple.getWeight() > 150);
    //      List<Apple> lightApples = fruitStorage.findApplesByWeight(allApples, apple -> apple.getWeight() <= 150);

    //      int expectedHeavyCount = 3;
    //      int expectedLightCount = 5;

    //      assertEquals(expectedHeavyCount, heavyApples.size());
    //      assertEquals(expectedLightCount, lightApples.size());
    //  }

    @Test
    public void testFindGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );

        List<Apple> greenApples = fruitStorage.findApples(inventory, new AppleGreenColorPredicate());
        assertEquals(2, greenApples.size());
    }

    @Test
    public void testFindRedApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );

        List<Apple> redApples = fruitStorage.findApples(inventory, new AppleRedColorPredicate());
        assertEquals(1, redApples.size());
    }

    @Test
    public void testFindHeavyApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );

        List<Apple> heavyApples = fruitStorage.findApples(inventory, new AppleHeavyWeightPredicate());
        assertEquals(1, heavyApples.size());
    }

    @Test
    public void testFindLightApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );

        List<Apple> lightApples = fruitStorage.findApples(inventory, new AppleLightWeightPredicate());
        assertEquals(2, lightApples.size());
    }

    @Test
    public void testFindHeavyGreenApples() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );

        List<Apple> heavyGreenApples = fruitStorage.findApples(inventory, new HeavyGreenApplePredicate());
        assertEquals(1, heavyGreenApples.size());
    }

    @Test
    public void testFindGreenApplesWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );
        List<Apple> greenApples = fruitStorage.findApples(inventory, apple -> "green".equals(apple.getColor()));
        assertEquals(2, greenApples.size());
    }

    @Test
    void testFindRedApplesWithAnonymousClass() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 100),
                new Apple("red", 150),
                new Apple("green", 180),
                new Apple("yellow", 120)
        );
        List<Apple> redApples = fruitStorage.findApples(inventory, apple -> "red".equals(apple.getColor()));
        assertEquals(1, redApples.size());
    }

}