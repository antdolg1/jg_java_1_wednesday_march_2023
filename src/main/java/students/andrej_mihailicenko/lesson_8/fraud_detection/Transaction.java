package students.andrej_mihailicenko.lesson_8.fraud_detection;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.amount = amount;
        this.trader = trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }

    public Trader getTrader() {
        return this.trader;
    }

    @Override
    public String toString() {
        return "Transaction [" +
                "trader = " + trader +
                ", amount = " + amount +
                ']';
    }
}
