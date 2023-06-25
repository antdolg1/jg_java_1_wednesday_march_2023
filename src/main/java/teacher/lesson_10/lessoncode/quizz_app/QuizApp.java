package teacher.lesson_10.lessoncode.quizz_app;

public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz(2);

        //Add multiple-choice question
        String[] choices = { "Java", "C#", "C++", "Ruby" };
        String question = "Which programming language is used for Android development?";
        Question mcQuestion = new MultipleChoiceQuestion(question, choices, 1);
        quiz.addQuestion(0, mcQuestion);

        //Add true-false question
        String questionTf = "Java is functional programming language?";
        Question tfQuestion = new TrueFalseQuestion(questionTf, false);
        quiz.addQuestion(1, tfQuestion);

        quiz.conductQuiz();
    }
}
