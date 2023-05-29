package students.igors_gergeleziu.lesson_7.level_7.task_13;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.wordHelloShouldBeMostFrequent();
        test.wordHelloShouldBeFirstAndMostFrequentTest1();
        test.wordHelloShouldBeFirstAndMostFrequentTest2();

    }

    void wordHelloShouldBeMostFrequent() {
        WordService service = new WordService();
        String text = "hello world hello hello";
        checkResult(service.findMostFrequentWord(text).equals("hello"), "wordHelloShouldBeMostFrequent");
    }

    void wordHelloShouldBeFirstAndMostFrequentTest1() {
        WordService service = new WordService();
        String text = "hello world hello world hello world";
        checkResult(service.findMostFrequentWord(text).equals("hello"), "wordHelloShouldBeFirstAndMostFrequent");
    }

    void wordHelloShouldBeFirstAndMostFrequentTest2() {
        WordService service = new WordService();
        String text = "hello great world hello great world hello great world";
        checkResult(service.findMostFrequentWord(text).equals("hello"), "wordHelloShouldBeFirstAndMostFrequent");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
