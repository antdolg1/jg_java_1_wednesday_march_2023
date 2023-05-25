package students.jegors_rutkovskis.lesson_8.level_7.pattern_builder;

class BankAccDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccountBuilder()
                .setFirstName("Ivar")
                .setCountry("Latvia")
                .setCity("Riga")
                .build();

        BankAccount account2 = new BankAccountBuilder()
                .setFirstName("Alex")
                .setPersonalCode("250298-10523")
                .setId(1)
                .setStreet("Maskavas street")
                .setCity("Riga")
                .setLastName("Pankratov")
                .setCountry("Latvia")
                .build();

        System.out.println(account1);
        System.out.println(account2);
    }
}
