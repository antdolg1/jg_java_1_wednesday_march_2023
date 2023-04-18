package students.jegors_rutkovskis.lesson_4.level_4;

class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }
    public int division(int a, int b){
        return a / b;
    }
    public int multiplication(int a, int b){
        return  a * b;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public int maxOfTwoNumbers(int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
    public int maxOfThreeNumbers(int a, int b, int c){
        if (a >= b && a >= c){
            return  a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
