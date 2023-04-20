package students.jegors_rutkovskis.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        Stock apple = new Stock("AAPL", 10);
        System.out.println(apple.getPriceInformation());

        apple.updatePrice(12);
        apple.updatePrice(5);
        apple.updatePrice(7);
        apple.updatePrice(99);
        apple.updatePrice(77);

        System.out.println(apple.getPriceInformation());
    }
}
