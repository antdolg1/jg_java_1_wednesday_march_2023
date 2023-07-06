package students.andrej_mihailicenko.lesson_14.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitStorageTest {

    private FruitStorage fruitStorage;
    private List<Apple> apples;

    @BeforeEach
    public void setUp() {
        fruitStorage = new FruitStorage();

        apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
    }

    @Test
    public void getAllGreenApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));

        List<Apple> actual = fruitStorage.findApples(apples, new AppleGreenColorPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void getAllRedApples() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));

        List<Apple> actual = fruitStorage.findApples(apples, new AppleRedColorPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void getApplesOver150Weight() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 160));
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        expected.add(new Apple("yellow", 170));

        List<Apple> actual = fruitStorage.findApples(apples, new AppleHeavyWeightPredicate());

        assertEquals(expected, actual);
    }

    @Test
    public void getApplesLower150Weight() {
        List<Apple> expected = new ArrayList<>();
        expected.add(new Apple("red", 100));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        expected.add(new Apple("yellow", 50));

        List<Apple> actual = fruitStorage.findApples(apples, new AppleLightWeightPredicate());

        assertEquals(expected, actual);
    }

}