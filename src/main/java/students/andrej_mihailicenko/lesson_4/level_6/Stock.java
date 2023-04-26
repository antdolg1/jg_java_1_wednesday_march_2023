package students.andrej_mihailicenko.lesson_4.level_6;

class Stock {
    String companyName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String companyName, double initialPrice) {
        this.companyName = companyName;
        this.currentPrice = initialPrice;
        this.maxPrice = initialPrice;
        this.minPrice = initialPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        return "Company = \"" + this.companyName + "\", Current Price = " + this.currentPrice + ", Min Price = " +
                this.minPrice + ", Max Price = " + this.maxPrice;
    }
}
