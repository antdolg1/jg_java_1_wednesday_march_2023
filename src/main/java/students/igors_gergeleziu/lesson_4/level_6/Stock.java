package students.igors_gergeleziu.lesson_4.level_6;

class Stock {
    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;
    }

    void updatePrice(int update) {
        currentPrice = update;
        if (currentPrice < minPrice) minPrice = currentPrice;
        else if (currentPrice > maxPrice) maxPrice = currentPrice;
    }

    void printInformation() {
        System.out.println("Company = \"" + company + "\", Current price = " + currentPrice +
                ", Min price = " + minPrice + ", Max price = " + maxPrice);
    }
}