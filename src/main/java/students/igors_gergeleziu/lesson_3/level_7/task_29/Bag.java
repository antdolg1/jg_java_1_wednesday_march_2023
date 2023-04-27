package students.igors_gergeleziu.lesson_3.level_7.task_29;

class Bag {
    String bagBrand;
    String bagColor;
    String bagSize;
    int itemAmount;
    boolean isBagEmpty = true;

    Bag(String bagBrand, String bagColor, String bagSize) {
        this.bagBrand = bagBrand;
        this.bagColor = bagColor;
        this.bagSize = bagSize;
    }

    void getBagInformation() {
        System.out.println("Bag: " + bagBrand);
        System.out.println("Color: " + bagColor);
        System.out.println("Size: " + bagSize);

    }

    void setItemAmount(int items) {
        this.itemAmount += items;
    }

    int getItemAmount() {
        return this.itemAmount;
    }

    void bagUnpack() {
        System.out.println("Unpacking bag...");
        this.itemAmount = 0;
    }

    boolean isBagEmpty() {
        if (this.itemAmount >= 1) this.isBagEmpty = false;
        else this.isBagEmpty = true;
        return isBagEmpty;
    }

}