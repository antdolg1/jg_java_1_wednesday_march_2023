package teacher.lesson_10.lessoncode.quizz_app;

public class MultipleChoiceQuestion extends BaseQuestion {
    private String[] choices;
    private int correctChoice;

    public MultipleChoiceQuestion(String question, String[] choices, int correctChoice) {
        super(question);
        this.choices = choices;
        this.correctChoice = correctChoice;
    }

    @Override
    public QuestionType getType() {
        return QuestionType.MULTIPLE_CHOICE;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        int selectedChoice = Integer.parseInt(userAnswer);
        return selectedChoice == correctChoice;
    }
}
