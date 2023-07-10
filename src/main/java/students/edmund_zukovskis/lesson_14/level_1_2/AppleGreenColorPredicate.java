package students.edmund_zukovskis.lesson_14.level_1_2;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
