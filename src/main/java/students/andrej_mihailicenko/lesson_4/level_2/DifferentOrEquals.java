package students.andrej_mihailicenko.lesson_4.level_2;

import java.util.Scanner;

public class DifferentOrEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;
        while (continueProgram) {

        System.out.println("Input first integer number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second integer number: ");
        int secondNumber = scanner.nextInt();


        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }


        System.out.println("Continue?(y/n)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                continueProgram = false;
            }
        }
    }
}