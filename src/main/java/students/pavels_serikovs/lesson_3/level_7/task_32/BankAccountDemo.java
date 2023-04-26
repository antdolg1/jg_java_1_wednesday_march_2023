package students.pavels_serikovs.lesson_3.level_7.task_32;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
