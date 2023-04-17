package students.igors_gergeleziu.lesson_3.level_5;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void voice() {
        System.out.println(dogName + "," + dogName + "," + dogName + "!");
    }

    void voice2() {
        System.out.println(dogName + ", " + dogAge + " years old.");
    }

    void voice3() {
        System.out.println(dogName + ", " + dogAge + " years old, " + dogColor + " color.");
    }

    void happyBirthday() {
        this.dogAge += 1;
    }

    void changeColor(String newColor) {
        this.dogColor = newColor;
    }

}
