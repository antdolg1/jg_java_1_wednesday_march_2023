package students.jegors_rutkovskis.lesson_9.level_7.task_32;

class Subtraction extends TwoArgumentMathOperation {

    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }
}
