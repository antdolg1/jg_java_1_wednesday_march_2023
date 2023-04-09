package students.andrej_mihailicenko.lesson_2.level_2;
import java.util.Scanner;
public class Helloapp {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("Who Are You? ");
        String name = userName.nextLine();
        System.out.println("Hello " + name +"!");

    }
}
