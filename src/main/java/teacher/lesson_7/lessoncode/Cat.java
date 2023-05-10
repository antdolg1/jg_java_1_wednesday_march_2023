package teacher.lesson_7.lessoncode;

public class Cat {

    private int age;
    private String nickname;

    public Cat(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Cats age cannot be negative");
        } else {
            this.age = age;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
