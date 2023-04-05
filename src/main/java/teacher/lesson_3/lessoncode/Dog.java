package teacher.lesson_3.lessoncode;

public class Dog {

    public String name;
    public int age;
    public boolean hungry;

    public Dog() {
    }

    public Dog(String name, int age, boolean hungry) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }

    public void bark() {
        System.out.println("Woof woof");
    }

    public void sleep() {
        System.out.println("Zzzzzzz...");
    }

}
