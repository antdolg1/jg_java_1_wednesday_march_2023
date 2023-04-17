package students.igors_gergeleziu.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 3, "black");
        dog1.voice();
        dog1.voice3();
        dog1.happyBirthday();
        dog1.changeColor("white");
        dog1.voice3();
    }
}
