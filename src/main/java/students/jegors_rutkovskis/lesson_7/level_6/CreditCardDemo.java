package students.jegors_rutkovskis.lesson_7.level_6;

class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("111-222", "0000");
        card.setCreditLimit(500);
        System.out.println(card);
        card.withdraw("0000", 500);
        System.out.println(card);
        System.out.println("Balance - creditDebt = " + card.getBalance());

        card.deposit("0000", 1000);
        System.out.println(card);
        System.out.println("Balance - creditDebt = " + card.getBalance());
    }
}
