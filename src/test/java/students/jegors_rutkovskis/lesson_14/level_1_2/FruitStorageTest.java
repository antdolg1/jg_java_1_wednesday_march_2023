package students.jegors_rutkovskis.lesson_14.level_1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    private FruitStorage storage;
    private List<Apple> inventory;
    @BeforeEach
    void setUp() {
        storage = new FruitStorage();
        inventory = new ArrayList<>();
        inventory.add(new Apple("red", 100));
        inventory.add(new Apple("red", 160));
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("green", 200));
        inventory.add(new Apple("green", 90));
        inventory.add(new Apple("green", 50));
        inventory.add(new Apple("yellow", 50));
        inventory.add(new Apple("yellow", 170));
    }

    @Test
    void getAllApplesTest() {
        assertEquals(inventory, storage.getAllApples());
    }

    @Test
    void getAllGreenApplesTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = storage.findApplesByColor(inventory, "green");
        assertEquals(expected, actual);
    }
    @Test
    void getAllRedApplesTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        List<Apple> actual = storage.findApplesByColor(inventory, "red");
        assertEquals(expected, actual);
    }
    @Test
    void getAllApplesWithWeight150Test() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        List<Apple> actual = storage.findApplesByWeight(inventory, 150);
        assertEquals(expected, actual);
    }

    @Test
    void findApplesByGreenColorTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = storage.filterApples(inventory, new GreenApplePredicate());
        assertEquals(expected, actual);
    }
    @Test
    void findApplesByRedColorTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        List<Apple> actual = storage.filterApples(inventory, new RedApplePredicate());
        assertEquals(expected, actual);
    }
    @Test
    void findHeavyApplesTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        List<Apple> actual = storage.filterApples(inventory, new HeavyApplePredicate());
        assertEquals(expected, actual);
    }
    @Test
    void findLightApplesTest() {
        List<Apple> expected = List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        );
        List<Apple> actual = storage.filterApples(inventory, new LightApplePredicate());
        assertEquals(expected, actual);
    }
    @Test
    void findGreenHeavyApplesTest() {
        List<Apple> expected = List.of(
                new Apple("green", 200)
        );
        List<Apple> actual = storage.filterApples(inventory, new GreenHeavyApplePredicate());
        assertEquals(expected, actual);
    }

    @Test
    void findGreenApplesAnonymousClassTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = storage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equalsIgnoreCase("green");
            }
        });
        assertEquals(expected, actual);
    }
    @Test
    void findRedApplesAnonymousClassTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        List<Apple> actual = storage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equalsIgnoreCase("red");
            }
        });
        assertEquals(expected, actual);
    }
    @Test
    void findHeavyApplesAnonymousClassTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        List<Apple> actual = storage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() >= 150;
            }
        });
        assertEquals(expected, actual);
    }
    @Test
    void findLightApplesAnonymousClassTest() {
        List<Apple> expected = List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        );
        List<Apple> actual = storage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(expected, actual);
    }

        // ********** Lambda tests ************************
    @Test
    void findGreenHeavyApplesLambdaTest() {
        List<Apple> expected = List.of(
                new Apple("green", 200)
        );
        List<Apple> actual = storage.filterApples(inventory,
                a -> a.getWeight() >= 150
                        && a.getColor().equalsIgnoreCase("green"));
        assertEquals(expected, actual);
    }
    @Test
    void findGreenApplesLambdaTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = storage.filterApples(inventory,
                apple -> apple.getColor().equalsIgnoreCase("green"));
        assertEquals(expected, actual);
    }
    @Test
    void findRedApplesLambdaTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 100),
                new Apple("red", 160),
                new Apple("red", 200)
        );
        List<Apple> actual = storage.filterApples(inventory,
                apples -> apples.getColor().equalsIgnoreCase("red"));
        assertEquals(expected, actual);
    }
    @Test
    void findHeavyApplesLambdaTest() {
        List<Apple> expected = Arrays.asList(
                new Apple("red", 160),
                new Apple("red", 200),
                new Apple("green", 200),
                new Apple("yellow", 170)
        );
        List<Apple> actual = storage.filterApples(inventory,
                a -> a.getWeight() >= 150);
        assertEquals(expected, actual);
    }
    @Test
    void findLightApplesLambdaTest() {
        List<Apple> expected = List.of(
                new Apple("red", 100),
                new Apple("green", 90),
                new Apple("green", 50),
                new Apple("yellow", 50)
        );
        List<Apple> actual = storage.filterApples(inventory,
                a -> a.getWeight() < 150);
        assertEquals(expected, actual);
    }
}