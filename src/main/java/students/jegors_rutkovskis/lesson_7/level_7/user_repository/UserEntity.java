package students.jegors_rutkovskis.lesson_7.level_7.user_repository;

class UserEntity {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;
    private String personalCode;

    public UserEntity(String name, String surname, String personalCode) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "User [" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", personalCode = '" + personalCode + '\'' +
                ']';
    }
}

