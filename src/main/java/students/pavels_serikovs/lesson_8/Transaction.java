package students.pavels_serikovs.lesson_8;

public class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getAmount() {
        return this.amount;
    }
}
