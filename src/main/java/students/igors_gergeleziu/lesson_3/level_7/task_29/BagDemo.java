package students.igors_gergeleziu.lesson_3.level_7.task_29;

class BagDemo {
    public static void main(String[] args) {
        Bag bag1=new Bag("Nike", "Black","L");
        Bag bag2=new Bag("Adidas", "Green", "M");
        bag1.getBagInformation();
        bag2.getBagInformation();
        bag1.setItemAmount(6);
        System.out.println("Is "+bag1.bagBrand+" bag empty? "+bag1.isBagEmpty());
        System.out.println(bag1.bagBrand+" contains "+bag1.getItemAmount()+" items");
        bag1.bagUnpack();
        System.out.println(bag1.bagBrand+" contains "+bag1.getItemAmount()+" items");
        System.out.println("Is bag empty? "+bag1.isBagEmpty());

    }
}
