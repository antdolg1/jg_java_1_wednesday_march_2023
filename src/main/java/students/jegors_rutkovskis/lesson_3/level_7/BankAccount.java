package students.jegors_rutkovskis.lesson_3.level_7;

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

