package students.andrej_mihailicenko.lesson_3.level_2;
import java.util.Scanner;
class StringGreeting {
    public static void main(String[] args) {
            Scanner userName = new Scanner(System.in);
            System.out.println("Hello, what's your name? ");
            String name = userName.nextLine();
            System.out.println("Hello " + name +"!");
    }
}
