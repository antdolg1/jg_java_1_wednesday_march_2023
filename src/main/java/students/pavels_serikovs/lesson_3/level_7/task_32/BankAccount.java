package students.pavels_serikovs.lesson_3.level_7.task_32;

public class BankAccount {
    String owner;
    int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
