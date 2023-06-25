package teacher.lesson_10.lessoncode.quizz_app;

import java.util.Scanner;

public class Quiz {

    private Question[] questions;

    public Quiz(int size) {
        questions = new Question[size];
    }

    public void addQuestion(int index, Question question) {
        questions[index] = question;
    }

    public void conductQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.displayQuestion();
            String userAnswer = scanner.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.length);
    }
}
