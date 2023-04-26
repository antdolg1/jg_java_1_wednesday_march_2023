package students.pavels_serikovs.lesson_3.level_5;

public class Dog {

    public String dogName;
    public int dogAge;
    public String dogColor;

    public Dog(String newDogName, int newDogAge, String newDogColor) {
        this.dogName = newDogName;
        this.dogAge = newDogAge;
        this.dogColor = newDogColor;
    }

    public String getDogName() {
        return this.dogName;
    }

    public int getDogAge() {
        return this.dogAge;
    }

    public String getDogColor() {
        return this.dogColor;
    }

    public void bark() {
        System.out.println("Gav!!!");
    }

    public void happyBirthday() {
        dogAge++; //same as dogAge=dogAge+1
        System.out.println("Happy Birthday " + dogName + "!!! " + dogAge + " years!!!");
    }

    public void changeDogColor(String dogColor) {
        this.dogColor = dogColor;
        System.out.println("My dog's new color is " + dogColor);
    }
}
