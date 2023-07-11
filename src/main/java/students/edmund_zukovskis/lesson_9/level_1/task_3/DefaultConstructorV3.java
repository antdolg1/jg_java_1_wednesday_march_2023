package students.edmund_zukovskis.lesson_9.level_1.task_3;

public class DefaultConstructorV3 {
    private String fullName;
    private int age;
    private boolean male;
    private Boolean female;

    public DefaultConstructorV3(String fullName, int age, boolean male, Boolean female) {
        this.fullName = fullName;
        this.age = age;
        this.male = male;
        this.female = female;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public Boolean isFemale() {
        return female;
    }
}
