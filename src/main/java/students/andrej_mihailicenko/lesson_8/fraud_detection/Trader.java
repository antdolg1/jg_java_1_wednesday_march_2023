package students.andrej_mihailicenko.lesson_8.fraud_detection;

class Trader {

    private String fullName;
    private String city;


    public void Trader(String fullName, String city) {
        this.city = city;
        this.fullName = fullName;
    }

    public String getCity() {
        return this.city;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader [" +
                "fullName = '" + fullName + '\'' +
                ", city = '" + city + '\'' +
                ']';
    }
}
