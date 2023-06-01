package students.jegors_rutkovskis.lesson_9.level_7.task_32;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
