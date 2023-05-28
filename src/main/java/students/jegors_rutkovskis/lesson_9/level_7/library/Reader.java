package students.jegors_rutkovskis.lesson_9.level_7.library;

class Reader {
    private String firstName;
    private String lastName;
    private String personalCode;
    private String street;
    private String city;
    private int phoneNumber;

    public Reader(String firstName, String lastName, String personalCode,
                  String street, String city, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
        this.street = street;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public Reader setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Reader setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public Reader setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Reader setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Reader setCity(String city) {
        this.city = city;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Reader setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
