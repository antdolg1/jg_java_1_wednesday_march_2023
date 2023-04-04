package students.igors_gergeleziu.lesson_2.level_2.task_8;
import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
      System.out.println("What is your name? ");
      Scanner scanner= new Scanner(System.in);
      String name= scanner.nextLine();
      System.out.println("Hello "+ name+"!");
    }

}
