package students.jegors_rutkovskis.lesson_8.level_1_2_3_4_5_6;

class Trader {
    private String fullName;
    private String city;

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "[" +
                "fullName = '" + fullName + '\'' +
                ", city = '" + city + '\'' +
                ']';
    }
}
