package students.igors_gergeleziu.lesson_8.level_1;

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
        return "Transaction {" +
                "trader = " + trader +
                ", amount=" + amount +
                '}'+" ";
    }
}
