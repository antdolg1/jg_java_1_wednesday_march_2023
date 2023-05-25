package students.andrej_mihailicenko.lesson_8.level_1;

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
    public void setAmount(int amount){
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }
    public Trader getTrader(){
        return this.trader;
    }
}
