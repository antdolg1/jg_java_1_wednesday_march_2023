package students.nikolaj.antonov.lesson_3.level_5.Task_19;

class Dog {

    String dogName;
    int dogAge;

    Dog(String name, int age) {

        this.dogName = name;
        this.dogAge = age;
    }

    void voice() {
        System.out.println("Dog name is: " + dogName);
        System.out.println("Dog age is: " + dogAge);
    }

}
