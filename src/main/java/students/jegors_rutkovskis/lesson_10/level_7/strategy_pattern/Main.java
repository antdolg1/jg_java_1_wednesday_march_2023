package students.jegors_rutkovskis.lesson_10.level_7.strategy_pattern;

class Main {
    public static void main(String[] args) {
        Context context;
        double a = 10;
        double b = 10;

        context = new Context(new Sum());
        double sumResult = context.executeStrategy(a, b);
        System.out.println(a + " + " + b + " = " + sumResult);

        context = new Context(new Subtraction());
        double subtractionResult = context.executeStrategy(a, b);
        System.out.println(a + " - " + b + " = " + subtractionResult);

        context = new Context(new Division());
        double divisionResult = context.executeStrategy(a, b);
        System.out.println(a + " / " + b + " = " + divisionResult);

        context = new Context(new Multiplication());
        double multiplyResult = context.executeStrategy(a, b);
        System.out.println(a + " * " + b + " = " + multiplyResult);
    }
}
