package students.andrej_mihailicenko.lesson_7.level_1;

class WordServiceApp {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String userText = wordService.getTextFromUser();
        String mostFrequentWord = wordService.findMostFrequentWord(userText);
        System.out.println("The most frequent word is: " + mostFrequentWord);
    }
}
