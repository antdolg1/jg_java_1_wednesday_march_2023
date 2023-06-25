package teacher.lesson_10.lessoncode.quizz_app;

public interface Question {

    QuestionType getType();

    void displayQuestion();

    boolean checkAnswer(String userAnswer);

}
