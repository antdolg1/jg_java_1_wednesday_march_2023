package students.nikolaj_antonov.lesson_3.level_5.task_19;

class Dog {
    String dogName;
    int dogAge;

    Dog(String name, int age) {
        this.dogName = name;
        this.dogAge = age;
    }

    void voice() {
        System.out.println("Dog name is: " + dogName + ", age is: "+ dogAge);
    }

}
