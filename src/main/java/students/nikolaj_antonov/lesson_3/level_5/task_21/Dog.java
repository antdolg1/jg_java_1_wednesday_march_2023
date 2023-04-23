package students.nikolaj_antonov.lesson_3.level_5.task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String name, int age, String color) {
        this.dogName = name;
        this.dogAge = age;
        this.dogColor = color;
    }
    void voice() {
        System.out.println("Dog name is: " + dogName + ", age is: "+ dogAge + ", color is: " + dogColor);
    }

}
