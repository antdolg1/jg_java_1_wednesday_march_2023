package students.andrej_mihailicenko.lesson_14.level_1;

public class AppleGreenColorPredicate implements ApplePredicate{

    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }

}
