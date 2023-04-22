package students.igors_gergeleziu.lesson_3.level_7.task_29;

class BagDemo {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Nike", "Black", "L");
        Bag bag2 = new Bag("Adidas", "Green", "M");
        bag1.printBagInformation();
        bag2.printBagInformation();
        bag1.setItemAmount(6);
        bag1.isBagEmpty();
        bag1.printItemAmount();
        bag1.bagUnpack();
        bag1.printItemAmount();
        bag1.isBagEmpty();

    }
}
