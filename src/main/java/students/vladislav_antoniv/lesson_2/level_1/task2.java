package students.vladislav_antoniv.lesson_2.level_1;
import java.util.Scanner;

public class task2 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        firstNumber=sc.nextDouble();
        secondNumber=sc.nextDouble();
        double sum,subs,mult,div;
        sum=firstNumber*secondNumber;
        subs=firstNumber-secondNumber;
        mult=firstNumber*secondNumber;
        div=firstNumber/secondNumber;
        System.out.println(sum);
        System.out.println(subs);
        System.out.println(mult);
        System.out.println(div);

    }
}
