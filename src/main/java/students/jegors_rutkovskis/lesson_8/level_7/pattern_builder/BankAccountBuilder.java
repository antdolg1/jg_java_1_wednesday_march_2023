package students.jegors_rutkovskis.lesson_8.level_7.pattern_builder;

class BankAccountBuilder {
    private String firstName;
    private String lastName;
    private String personalCode;
    private String country;
    private String city;
    private String street;
    private int id;

    public BankAccountBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BankAccountBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BankAccountBuilder setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
        return this;
    }

    public BankAccountBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public BankAccountBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public BankAccountBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public BankAccountBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public BankAccount build() {
        return new BankAccount(firstName, lastName,
                personalCode, country, city, street, id);
    }
}
