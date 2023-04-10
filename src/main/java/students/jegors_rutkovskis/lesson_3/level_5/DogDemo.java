package students.jegors_rutkovskis.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Barry", 5, "Black");

        dog.voice();
        dog.happyBirthday();
        dog.changeColor("White");

        dog.voice();

    }
}
