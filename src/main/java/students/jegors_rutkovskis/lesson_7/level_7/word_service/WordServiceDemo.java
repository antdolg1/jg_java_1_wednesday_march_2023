package students.jegors_rutkovskis.lesson_7.level_7.word_service;

class WordServiceDemo {
    public static void main(String[] args) {
        WordService service = new WordService();
        String text = "One one two THREE and three one But one more three";
        System.out.println(text);
        System.out.println(service.findMostFrequentWord(text));
    }
}
