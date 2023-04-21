package students.igors_gergeleziu.lesson_4.level_4;

class Calculator {
    int number1;
    int number2;
    int number3;

    int addition(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        return number1 + number2;
    }

    int subtraction(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        return number1 - number2;
    }

    int multiplication(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        return number1 * number2;
    }

    float division(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        return number1 / (float) number2;
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
            return true;
        } else System.out.println("Number " + number + " is odd");
        return false;
    }

    int maxOfTwoNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        if (number1 == number2) {
            System.out.println(number1 + " and " + number2 + " are equal");
            return number1;
        } else if (number1 > number2) {
            System.out.println("Max number: " + number1);
            return number1;
        } else System.out.println("Max number: " + number2);
        return number2;
    }

    int maxOfThreeNumbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        if (number1 == number2 && number2 == number3 && number3 == number1) {
            System.out.println(number1 + ", " + number2 + " and " + number3 + " are equal");
            return number1;
        } else if ((number1 == number2) && number1 > number3) {
            System.out.println(number1 + " and " + number2 + " are equal and higher than " + number3);
            return number1;
        } else if ((number2 == number3) && number2 > number1) {
            System.out.println(number2 + " and " + number3 + " are equal and higher than " + number1);
            return number2;
        } else if ((number3 == number1) && number3 > number2) {
            System.out.println(number3 + " and " + number1 + " are equal and higher than " + number2);
            return number3;
        } else if (number1 > number2 && number1 > number3) {
            System.out.println("Max number: " + number1);
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Max number: " + number2);
            return number2;
        }else System.out.println("Max number: " + number3);
        return number3;


    }
}
