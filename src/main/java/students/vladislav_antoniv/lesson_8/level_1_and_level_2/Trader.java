package students.vladislav_antoniv.lesson_8.level_1_and_level_2;

class Trader {

    private String fullName;
    private String city;

    public void Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }
}