package students.igors_gergeleziu.lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {
        Stock google = new Stock("Google", 10);
        google.printInformation();
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        google.printInformation();
        Stock apple = new Stock("Apple", 10);
        apple.printInformation();
        apple.updatePrice(12);
        apple.updatePrice(5);
        apple.updatePrice(7);
        apple.updatePrice(99);
        apple.updatePrice(77);
        apple.printInformation();
        Stock microsoft = new Stock("Microsoft", 10);
        microsoft.printInformation();
        microsoft.updatePrice(12);
        microsoft.updatePrice(5);
        microsoft.updatePrice(7);
        microsoft.updatePrice(99);
        microsoft.updatePrice(77);
        microsoft.printInformation();
    }
}
