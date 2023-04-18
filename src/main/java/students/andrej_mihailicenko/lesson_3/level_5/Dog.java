package students.andrej_mihailicenko.lesson_3.level_5;

class Dog {
    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void voice() {
        System.out.println("The dogs name is: " + name.repeat(3));
        System.out.println("The dogs age is: " + age);
        System.out.println("The dogs color is: " + color);
    }

    void happyBirthday() {
        age++;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
