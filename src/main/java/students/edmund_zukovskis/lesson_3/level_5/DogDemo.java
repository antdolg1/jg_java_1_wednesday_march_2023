package students.edmund_zukovskis.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog ("Kalabok", 3, "Red");

        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Black");

        dog.voice();

    }
}
