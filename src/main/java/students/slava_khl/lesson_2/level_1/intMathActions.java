package students.slava_khl.lesson_2.level_1;

import java.util.Scanner;

public class intMathActions {

    public static void main(String[] args) {

        System.out.println("Enter first num: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Enter second num: ");
        int secondNum = scanner.nextInt();
        int addition = firstNum + secondNum;
        int substraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        int division = firstNum / secondNum;
        System.out.println("Actions: ");
        System.out.println(firstNum + "+" + secondNum + "=" + addition);
        System.out.println(firstNum + "-" + secondNum + "= " + substraction);
        System.out.println(firstNum + "*" + secondNum + "= " + multiplication);
        System.out.println(firstNum + ":" + secondNum + "= " + division);


    }


}
