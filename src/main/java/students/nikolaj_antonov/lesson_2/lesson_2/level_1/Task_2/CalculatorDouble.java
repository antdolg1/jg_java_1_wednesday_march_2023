package students.nikolaj_antonov.lesson_2.lesson_2.level_1.Task_2;

import java.util.Scanner;

class CalculatorDouble {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second number");
        double secondDoubleNumber = scanner.nextDouble();

        double addition = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Sum = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

    }

}

