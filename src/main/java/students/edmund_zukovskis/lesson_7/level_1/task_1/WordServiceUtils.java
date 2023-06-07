package students.edmund_zukovskis.lesson_7.level_1.task_1;

public class WordServiceUtils {
    public static void main(String[] args) {

        String text = "Hello my name is Edmund, Hello I am 25 years old, Hello I live in Latvia, Hello again.";
        WordService wordService = new WordService();
        String mostFrequentWord = wordService.findMostFrequentWord(text);
        System.out.println("Most frequent word is: " + mostFrequentWord);
    }
}
