package students.edmund_zukovskis.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        Stock grapes = new Stock("Grape Industry", 10);
        System.out.println(grapes.getPriceInformation());

        grapes.updatePrice(12);
        grapes.updatePrice(5);
        grapes.updatePrice(7);
        grapes.updatePrice(99);
        grapes.updatePrice(77);

        System.out.println(grapes.getPriceInformation());
    }
}
