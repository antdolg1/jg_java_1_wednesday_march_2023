package students.edmund_zukovskis.lesson_3.level_7.task_32;

class BankAccount {
    String owner;
    int money;

    BankAccount(String name, int money) {
        this.owner = name;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
