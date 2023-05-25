package students.igors_gergeleziu.lesson_7.level_6.task_10;

import students.igors_gergeleziu.lesson_7.level_6.task_10.CreditCard;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCard test = new CreditCard(123456, 1234);
        test.setCreditLimit(1234, 100);
        test.deposit(1234, 101);
        System.out.println("Balance: "+test.getBalance());
        System.out.println("Credit Loan: "+test.getCreditLoan());
        test.withdraw(1234, 101);
        System.out.println("Balance: "+test.getBalance());
        System.out.println("Credit Loan: "+test.getCreditLoan());
    }
}
