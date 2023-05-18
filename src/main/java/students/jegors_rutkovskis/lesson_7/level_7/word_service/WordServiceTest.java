package students.jegors_rutkovskis.lesson_7.level_7.word_service;
class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.findMostFrequentWordTest2();
    }
    void findMostFrequentWordTest() {
        WordService victim = new WordService();
        String text = "One one two THREE three one";
        String expected = "one";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "find Most Frequent Word Test 1");
    }
    void findMostFrequentWordTest2() {
        WordService victim = new WordService();
        String text = "One, one two THREE three one";
        String expected = "one";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "find Most Frequent Word Test 2");
    }
    private void testResult(String expected,
                            String actual, String testName){
        if (expected.equals(actual)){
            System.out.println(testName + " TEST PASSED!");
        } else {
            System.err.println(testName + " TEST FAILED!");
        }
    }
}
