package students.pavels_serikovs.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog = new Dog("Laika", 9, "Brown");
        String myDogName = myDog.getDogName();
        int myDogAge = myDog.getDogAge();
        String myDogColor = myDog.getDogColor();
        myDog.bark();
        System.out.println("My dog's name is " + myDogName + ";");
        System.out.println("My dog is " + myDogAge + " years old;");
        System.out.println("My dog's color is " + myDogColor + ";");
        myDog.happyBirthday();
        myDog.bark();
        myDog.changeDogColor("Black.");
    }
}
