package students.edmund_zukovskis.lesson_14.level_1_2;

public class HeavyGreenApplePredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
