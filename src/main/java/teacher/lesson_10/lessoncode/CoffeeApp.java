package teacher.lesson_10.lessoncode;

public class CoffeeApp {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee("Espresso", CoffeeSize.SMALL);
        Coffee coffee2 = new Coffee("Cappuccino", CoffeeSize.MEDIUM);
        Coffee coffee3 = new Coffee("Latte", CoffeeSize.LARGE);

        System.out.println(coffee1);
        System.out.println(coffee2);
        System.out.println(coffee3);

        System.out.println("Available sizes:");
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size + " - " + size.getOunces() + " oz");
        }

    }
}
