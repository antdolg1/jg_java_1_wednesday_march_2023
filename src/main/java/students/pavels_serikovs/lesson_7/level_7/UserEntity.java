package students.pavels_serikovs.lesson_7.level_7;

public class UserEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String personalCode;

    public UserEntity(int id, String firstName, String lastName, String personalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
