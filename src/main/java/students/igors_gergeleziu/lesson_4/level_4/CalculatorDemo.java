package students.igors_gergeleziu.lesson_4.level_4;

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int summary= calculator.addition(1,2);
        System.out.println(calculator.number1+"+"+calculator.number2+"="+summary);
        int subtraction= calculator.subtraction(4,2);
        System.out.println(calculator.number1+"-"+calculator.number2+"="+subtraction);
        int multiplication= calculator.multiplication(3,6);
        System.out.println(calculator.number1+"*"+calculator.number2+"="+multiplication);
        float division= calculator.division(6, 2);
        System.out.println(calculator.number1+"/"+calculator.number2+"="+division);

    }
}
