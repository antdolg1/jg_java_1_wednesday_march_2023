package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction [" +
                "trader = " + trader +
                ", amount = " + amount +
                ']';
    }
}
