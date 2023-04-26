package students.andrej_mihailicenko.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        Stock apple = new Stock("AAPL", 100);
        String priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);
        apple.updatePrice(200);
        apple.updatePrice(50);
        apple.updatePrice(150);
        priceInformation = apple.getPriceInformation();
        System.out.println(priceInformation);





        Stock google = new Stock("GOOG", 10);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
