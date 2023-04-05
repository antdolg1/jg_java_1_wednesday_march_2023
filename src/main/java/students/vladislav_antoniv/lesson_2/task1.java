package students.vladislav_antoniv.lesson_2;

import java.util.Scanner;

public class task1 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int sum=firstNumber+secondNumber;
        int subs=firstNumber-secondNumber;
        int mult=firstNumber*secondNumber;
        int div=firstNumber/secondNumber;
        System.out.println(sum);
        System.out.println(subs);
        System.out.println(mult);
        System.out.println(div);
    }
}