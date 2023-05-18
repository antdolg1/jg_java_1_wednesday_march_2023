package students.jegors_rutkovskis.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.textToArrayTest();
        test.toLowerCaseTest();
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
        String text = "One, two, one, two, one two";
        String expected = "one";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "findMostFrequentWord Two same, but first occurrence");
    }
    void findMostFrequentWordTest() {
        WordService victim = new WordService();
        String[] text = {"One", "two", "THREE", "three", "one"};
        String expected = "One";
        String actual = victim.findMostFrequentWord(text);

        testResult(expected, actual, "findMostFrequentWordTest");
    }
    void toLowerCaseTest() {
        WordService victim = new WordService();
        String text = "One, two, THREE, three, one";
        String expected = "one, two, three, three, one";
        String actual = victim.toLowerCase(text);

        testResult(expected, actual, "toLowerCaseTest");
    }
    void textToArrayTest() {
        WordService victim = new WordService();
        String text = "One, two, THREE, three, one";
        String[] expected = {"One", "two", "THREE", "three", "one"};
        String[] actual = victim.textToArray(text);

        testResult(expected, actual, "textToArrayTest");
    }
    private void testResult(String expected,
                        String actual, String testName){
        if (expected.equals(actual)){
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
        }
    }
    private void testResult(String[] expected,
                            String[] actual, String testName){
        if (Arrays.equals(expected, actual)){
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
        }
    }
}
