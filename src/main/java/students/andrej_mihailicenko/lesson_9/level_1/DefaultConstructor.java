package students.andrej_mihailicenko.lesson_9.level_1;

class DefaultConstructor {
    private String firstName;
    private String lastName;

    public DefaultConstructor(){
    firstName = "Andrey";
    lastName = "Andreev";
    }

    @Override
    public String toString() {
        return "Student " +
                "first name is " + firstName +
                " and last name is " + lastName +
                ' ';
    }
}
