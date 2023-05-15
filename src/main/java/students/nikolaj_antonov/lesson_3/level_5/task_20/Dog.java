package students.nikolaj_antonov.lesson_3.level_5.task_20;

class Dog {
    String dogName;
    int dogAge;

    Dog(String name, int age) {
        this.dogName = name;
        this.dogAge = age;
    }
    void bark() {
        System.out.println("Woof woof");
    }
    void voice() {
        System.out.println("Dog name is: " + dogName + ", age is: "+ dogAge);
    }
    void happyBirthday() {
        dogAge++;
        System.out.println("Dog age is: "+ dogAge);
    }

}
