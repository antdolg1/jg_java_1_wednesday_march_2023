package students.andrej_mihailicenko.lesson_14.level_1;

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }
}
