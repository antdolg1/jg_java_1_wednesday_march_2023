package students.slava_khl.lesson_2.level_1;

import java.util.Scanner;

public class doubleMathActions {

    public static void main(String[] args) {

        System.out.println("Enter first num:");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        System.out.print("Enter second num:");
        double secondNum = scanner.nextDouble();
        double addition = firstNum + secondNum;
        double substraction = firstNum - secondNum;
        double multiplication = firstNum * secondNum;
        double division = firstNum / secondNum;
        System.out.println("Actions:");
        System.out.println(firstNum + "+" + secondNum + "=" + addition);
        System.out.println(firstNum + "-" + secondNum + "= " + substraction);
        System.out.println(firstNum + "*" + secondNum + "= " + multiplication);
        System.out.println(firstNum + ":" + secondNum + "= " + division);

    }
}
