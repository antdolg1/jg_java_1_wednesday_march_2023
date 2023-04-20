package students.jegors_rutkovskis.lesson_4.level_6;

class Stock {
    String stockName;
    double currentPrice;
    double minPrice;
    double maxPrice;

    public Stock(String stockName, double currentPrice) {
        this.stockName = stockName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }
    public void updatePrice(double price){
        currentPrice = price;

        if (maxPrice < price){
            maxPrice = price;
        }
        if (minPrice > price){
            minPrice = price;
        }
    }
    public String getPriceInformation(){
        return "Company = \"" + stockName
                + "\", Current price = "
                + currentPrice
                + ", Min price = "
                + minPrice
                + ", Max price = "
                + maxPrice;
    }
}
