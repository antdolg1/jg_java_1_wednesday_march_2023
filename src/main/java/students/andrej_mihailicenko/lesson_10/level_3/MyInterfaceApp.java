package students.andrej_mihailicenko.lesson_10.level_3;

class MyInterfaceApp {
    public static void main(String[] args) {
        MyInterface myLambda = () -> System.out.println("Beep");
        myLambda.makeSound();
    }
}
