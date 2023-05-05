package students.pavels_serikovs.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        return "Company " + this.companyName + " Current price = " + this.currentPrice + " Min price = " + this.minPrice + " Max price = " + this.maxPrice;
    }
}
