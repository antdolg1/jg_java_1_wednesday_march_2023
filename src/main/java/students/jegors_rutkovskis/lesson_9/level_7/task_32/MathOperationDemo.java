package students.jegors_rutkovskis.lesson_9.level_7.task_32;

class MathOperationDemo {
    public static void main(String[] args) {
        MathOperation sub, div, multiply;
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(10);
        Argument arg3 = new Argument(20);

        // build (10 - 5) * (20 / 5)
        sub = new Subtraction(arg2, arg1);
        div = new Division(arg3, arg1);
        multiply = new Multiply(sub, div);
        System.out.println("(10 - 5) * (20 / 5) = " + multiply.calculate());
    }
}
