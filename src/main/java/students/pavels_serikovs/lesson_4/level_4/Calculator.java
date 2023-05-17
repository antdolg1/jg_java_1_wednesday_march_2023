package students.pavels_serikovs.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfTwoNumbersOne(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int equalsOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int threeNumbersOne(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && secondNumber > thirdNumber) {
        }
        return firstNumber;
    }

    public int threeNumbersTwo(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
        }
        return secondNumber;
    }

    public int threeNumbersThree(int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
        }
        return thirdNumber;
    }

    public int threeNumbersFour(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber > thirdNumber) {
        }
        return secondNumber;
    }

    public int threeNumbersFive(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber == firstNumber && secondNumber == thirdNumber) {
        }
        return firstNumber;
    }
}
