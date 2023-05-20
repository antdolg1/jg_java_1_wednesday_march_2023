package students.pavels_serikovs.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        Stock militaryStock = new Stock("Military stock", 12);
        String priceInformationMilitary = militaryStock.getPriceInformation();
        System.out.println(priceInformationMilitary);
        militaryStock.updatePrice(999);
        militaryStock.updatePrice(1);
        militaryStock.updatePrice(8);
        priceInformation = militaryStock.getPriceInformation();
        System.out.println(priceInformation);

        Stock petStock = new Stock("Pet stock", 5);
        String priceInformationPet = petStock.getPriceInformation();
        System.out.println(priceInformationPet);
        petStock.updatePrice(1000);
        petStock.updatePrice(9);
        petStock.updatePrice(27);
        priceInformation = petStock.getPriceInformation();
        System.out.println(priceInformation);
    }
}
