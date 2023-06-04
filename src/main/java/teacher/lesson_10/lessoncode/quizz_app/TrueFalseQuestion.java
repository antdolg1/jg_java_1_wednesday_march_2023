package teacher.lesson_10.lessoncode.quizz_app;

public class TrueFalseQuestion extends BaseQuestion {
    private boolean correctAnswer;

    public TrueFalseQuestion(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public QuestionType getType() {
        return QuestionType.TRUE_FALSE;
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        boolean selectedAnswer = Boolean.parseBoolean(userAnswer);
        return selectedAnswer == correctAnswer;
    }
}
