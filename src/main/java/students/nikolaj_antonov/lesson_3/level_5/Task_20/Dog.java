package students.nikolaj_antonov.lesson_3.level_5.Task_20;

class Dog {
    String dogName;
    int dogAge;


    Dog(String name, int age) {

        this.dogName = name;
        this.dogAge = age;
    }

    void voice() {
        System.out.println(dogName);
        System.out.println("Dog age is: " + dogAge);
    }
    void happyBirthday() {
        dogAge++;
        System.out.println(dogName);
        System.out.println("Dog age is: " + dogAge);
    }

}
