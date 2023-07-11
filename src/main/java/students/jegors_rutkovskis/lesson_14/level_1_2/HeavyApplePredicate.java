package students.jegors_rutkovskis.lesson_14.level_1_2;

class HeavyApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 150;
    }
}
