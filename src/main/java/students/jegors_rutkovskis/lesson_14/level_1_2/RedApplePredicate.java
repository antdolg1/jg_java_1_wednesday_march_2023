package students.jegors_rutkovskis.lesson_14.level_1_2;

class RedApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("red");
    }
}
