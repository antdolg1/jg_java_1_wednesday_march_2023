package students.edmund_zukovskis.lesson_3.level_5;

class Dog {
    private String name;
    private int age;
    private String color;
    Dog(String dogName, int age, String dogColor) {
        name = dogName;
        this.age = age;
        color = dogColor;
    }


    void voice(){
        System.out.println(name + " " + name + " " + name);
        System.out.println("Dog age is " + age);
        System.out.println("Dog color is " + color);
    }
    void happyBirthday() {
        age++;
    }
    void changeColor(String color) {
        this.color = color;
    }
}
