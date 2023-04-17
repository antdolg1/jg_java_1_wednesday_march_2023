package students.igors_gergeleziu.lesson_4.level_4;
class Calculator {
    int number1;
    int number2;

    int addition(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
        return number1+number2;
    }
    int subtraction(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
        return number1-number2;
    }
    int multiplication(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
        return number1*number2;
    }
    float division(int number1, int number2){
        this.number1=number1;
        this.number2=number2;
        return number1/(float)number2;
    }
}
