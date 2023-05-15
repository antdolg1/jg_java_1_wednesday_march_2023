package students.igors_gergeleziu.lesson_4.level_1;

import java.util.Scanner;

 public class Numbers {
    int wholeNumber;
    int number1;
    int number2;
    int number3;

    Numbers(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    public Numbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Numbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public void setThreeNumbers() {
        System.out.println("Enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        this.number1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        this.number2 = scanner.nextInt();
        System.out.println("Enter your third number: ");
        this.number3 = scanner.nextInt();
    }

    public void setTwoNumbers() {
        System.out.println("Enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        this.number1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        this.number2 = scanner.nextInt();
    }

    void setWholeNumber() {
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        this.wholeNumber = scanner.nextInt();
    }

    String isNumberPositiveOrNegative() {
        if (wholeNumber > 0) {
            System.out.println(wholeNumber + " is positive");
            return "Positive";
        } else System.out.println(wholeNumber + " is negative");
        return "Negative";

    }

    String isNumberPositiveOrNegativeOrZero() {
        if (wholeNumber == 0) {
            System.out.println(wholeNumber + " is zero number");
            return "Zero";
        } else if (wholeNumber > 0) {
            System.out.println(wholeNumber + " is positive");
            return "Positive";
        } else System.out.println(wholeNumber + " is negative");
        return "Negative";
    }

    String dayOfTheWeek() {
        switch (wholeNumber) {
            case 1 -> {
                System.out.println("It is Monday");
                return "Monday";
            }
            case 2 -> {
                System.out.println("It is Tuesday");
                return "Tuesday";
            }
            case 3 -> {
                System.out.println("It is Wednesday");
                return "Wednesday";
            }
            case 4 -> {
                System.out.println("It is Thursday");
                return "Thursday";
            }
            case 5 -> {
                System.out.println("It is Friday");
                return "Friday";
            }
            case 6 -> {
                System.out.println("It is Saturday");
                return "Saturday";
            }
            case 7 -> {
                System.out.println("It is Sunday");
                return "Sunday";
            }
            default -> {
                return "No such day in our reality";
            }
        }
    }

    String evenOrOddNumber() {
        if (wholeNumber % 2 == 0) {
            System.out.println(wholeNumber + " is even");
            return "Even";
        } else System.out.println(wholeNumber + " is odd");
        return "Odd";
    }

    public int higherNumber() {
        if (number1 > number2) {
            System.out.println(number1 + " is higher than " + number2);
            return number1;
        } else if (number2 > number1) {
            System.out.println(number2 + " is higher than " + number1);
            return number2;
        } else System.out.println(number1 + " and " + number2 + " are equal, no higher value");
        return 0;


    }

    public int smallerNumber() {
        if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2);
            return number1;
        } else if (number2 < number1) {
            System.out.println(number2 + " is smaller than " + number1);
            return number2;
        } else System.out.println(number1 + " and " + number2 + " are equal, no smaller value");
        return 0;

    }

    public String equalOrDifferentNumbers() {
        if (number1 == number2) {
            System.out.println(number1 + " and " + number2 + " are equal numbers");
            return "Equal";
        } else System.out.println(number1 + " and " + number2 + " are different numbers");
        return "Different";
    }

    public String equalOrDifferentThreeNumbers() {
        if (number1 == number2 && number2 == number3) {
            System.out.println(number1 + ", " + number2 + " and " + number3 + " are all equal");
            return "Equal";
        } else if (number1 != number2 && number2 != number3 && number3 != number1) {
            System.out.println(number1 + ", " + number2 + " and " + number3 + " are all different");
            return "Different";
        } else System.out.println("Neither all are equal or different");
        return "None";
    }

    public String increasingOrDecreasingOrderOfNumbers() {
        if (number1 < number2 && number2 < number3) {
            System.out.println(number1 + ", " + number2 + " and " + number3 + " are all in increasing order");
            return "Increasing";
        } else if (number1 > number2 && number2 > number3) {
            System.out.println(number1 + ", " + number2 + " and " + number3 + " are all in decreasing order");
            return "Decreasing";
        } else System.out.println("Neither increasing or decreasing order");
        return "None";
    }

    public int highestOfThreeNumbers() {
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is highest number");
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is highest number");
            return number2;
        } else if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is highest number");
            return number3;
        } else System.out.println(number1 + ", " + number2 + " and " + number3 + " are all equal");
        return 0;

    }
}
