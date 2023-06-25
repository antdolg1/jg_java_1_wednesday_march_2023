package teacher.lesson_10.lessoncode.quizz_app;

abstract class BaseQuestion implements Question {

    protected String question;

    public BaseQuestion(String question) {
        this.question = question;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
    }
}
