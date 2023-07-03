package students.jegors_rutkovskis.lesson_14.level_1_2;

class GreenHeavyApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("green")
                && apple.getWeight() >= 150;
    }
}
