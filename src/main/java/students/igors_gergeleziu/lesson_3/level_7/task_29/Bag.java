package students.igors_gergeleziu.lesson_3.level_7.task_29;

class Bag {
    String bagBrand;
    String bagColor;
    String bagSize;
    int itemAmount;

    Bag(String bagBrand, String bagColor, String bagSize) {
        this.bagBrand = bagBrand;
        this.bagColor = bagColor;
        this.bagSize = bagSize;
    }

    void printBagInformation() {
        System.out.println("Bag: " + bagBrand);
        System.out.println("Color: " + bagColor);
        System.out.println("Size: " + bagSize);

    }

    void setItemAmount(int items) {
        this.itemAmount += items;
    }

    void printItemAmount() {
        System.out.println(bagBrand + " contains " + this.itemAmount + " items");
    }

    void bagUnpack() {
        System.out.println("Unpacking bag...");
        this.itemAmount = 0;
    }

    void isBagEmpty() {
        if (this.itemAmount >= 1) {
            System.out.println("Bag is not empty");
        } else {
            System.out.println("Bag is empty");
        }
    }

}
