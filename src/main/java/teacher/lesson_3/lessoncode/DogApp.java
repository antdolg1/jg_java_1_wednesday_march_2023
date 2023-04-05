package teacher.lesson_3.lessoncode;

public class DogApp {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.age = 3;
        dog1.name = "Bobik";
        dog1.hungry = true;

        System.out.println("Dog1 name: " + dog1.name);
        System.out.println("Dog1 age: " + dog1.age);
        System.out.println("Is dog1 hungry? " + dog1.hungry);

        dog1.bark();
        dog1.sleep();

        Dog dog2 = new Dog();
        dog2.name = "Sharik";
        dog2.hungry = false;
        dog2.age = 12;

        System.out.println("Dog2 name: " + dog2.name);
        System.out.println("Dog2 age: " + dog2.age);
        System.out.println("Is dog2 hungry? " + dog2.hungry);

        Dog dog3 = new Dog("Strelka", 5, true);
        System.out.println("Dog3 name: " + dog3.name);
        System.out.println("Dog3 age: " + dog3.age);
        System.out.println("Dog3 is hungry? " + dog3.hungry);

    }
}
