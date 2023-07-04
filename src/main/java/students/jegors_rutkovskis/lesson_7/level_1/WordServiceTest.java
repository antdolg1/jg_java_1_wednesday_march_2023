package students.jegors_rutkovskis.lesson_7.level_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTest();
        test.findMostFrequentWordFinalTest();
        test.findMostFrequentWordFinalTest2();
    }
    void findMostFrequentWordFinalTest() {
        WordService victim = new WordService();
        String text = "Three, one, two, THREE and three, one! But one more one";
        String expected = "one";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "findMostFrequentWordFinalTest");
    }
    void findMostFrequentWordFinalTest2() {
        WordService victim = new WordService();
        String text = "One, four, one, four, one four";
        String expected = "one";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "findMostFrequentWord: Testing when two same words occur," +
                " but the method returns the first occurrence");
    }
    void findMostFrequentWordTest() {
        WordService victim = new WordService();
        String[] text = {"One", "two", "THREE", "three", "one"};
        String expected = "One";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "findMostFrequentWordTest");
    }
    private void testResult(String expected,
                        String actual, String testName){
        if (expected.equals(actual)){
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
        }
    }
}
