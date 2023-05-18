package students.jegors_rutkovskis.lesson_7.level_6;

class CreditCard {
    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;
    private boolean isBlocked;
    private int attempts;
    private final static int MAX_ATTEMPTS = 3;
    public CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.creditDebt = 0;
        this.isBlocked = false;
        this.attempts = MAX_ATTEMPTS;
    }
    public boolean deposit(String pinCode, double amount){
        if (isBlocked()) {
            return false;
        }
        if (!checkPinCode(pinCode)) {
            return false;
        }
        if (isNegativeAmount(amount)) {
            return false;
        }
        if (isCreditDebt()) {
            amount = payOffDebt(amount);
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(String pinCode, double amount){
        if (isBlocked()) {
            return false;
        }
        if (!checkPinCode(pinCode)) {
            return false;
        }
        if (isNegativeAmount(amount)) {
            return false;
        }
        if (amount > getAvailableBalance()) {
            System.err.println("Error: You have not enough money");
            return false;
        } else {
            executeWithdraw(amount);
        }
        return true;
    }
    private boolean checkPinCode(String pinCode) {
        if (!this.pinCode.equals(pinCode)) {
            reduceAttempts();
            return false;
        } else {
            attempts = MAX_ATTEMPTS;
            return true;
        }
    }
    private void reduceAttempts() {
        attempts--;
        System.out.println("Wrong PIN! Attempts left: " + attempts);
        if (attempts <= 0) {
            System.err.println("Your card is blocked!");
            block();
        }
    }
    private boolean isNegativeAmount(double amount) {
        if (amount <= 0) {
            System.err.println("Error: negative or zero amount");
            return true;
        }
        return false;
    }
    private boolean isCreditDebt() {
        return creditDebt > 0;
    }
    private double getAvailableBalance() {
        return balance + creditLimit - creditDebt;
    }
    private double payOffDebt(double amount) {
        if (amount > creditDebt) {
            amount -= creditDebt;
            creditDebt = 0;
        } else {
            creditDebt -= amount;
            amount = 0;
        }
        return amount;
    }
    private void executeWithdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            double creditWithdraw = getAvailableBalance() - amount;
            creditDebt = creditLimit - creditWithdraw;
            balance = 0;
        }
    }
    private void block() {
        isBlocked = true;
    }
    void unBlock() {
        attempts = MAX_ATTEMPTS;
        isBlocked = false;
    }
    boolean isBlocked() {
        return isBlocked;
    }
    double getBalance() {
        if (creditDebt > 0){
            return balance - creditDebt;
        }
        return balance;
    }
    int getAttempts() {
        return attempts;
    }

    String getCardNumber() {
        return cardNumber;
    }
    void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    double getCreditLimit() {
        return creditLimit;
    }
    double getCreditDebt() {
        return creditDebt;
    }

    @Override
    public String toString() {
        return "CreditCard [" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                ", isBlocked=" + isBlocked +
                ", attempts=" + attempts +
                ']';
    }
}
