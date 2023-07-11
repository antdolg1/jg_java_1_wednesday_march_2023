package students.pavels_serikovs.lesson_7.level_1;

public class WordServiceLauncher {
    public static void main(String[] args) {
        WordService service = new WordService();
        String userText = service.getTextFromUser();
        String mostFrequentWord = service.findMostFrequentWord(userText);
        System.out.println("The most frequented word in text is " + mostFrequentWord);
    }
}
