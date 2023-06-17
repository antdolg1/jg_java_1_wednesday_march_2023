package students.pavels_serikovs.lesson_7.level_7;

public class WordServiceTwoTest {
    public static void main(String[] args) {
        WordServiceTwoTest test = new WordServiceTwoTest();
        test.findMostFrequentWordTestDogCatPassed();
        test.findMostFrequentWordTestDogCatFailed();
    }

    void findMostFrequentWordTestDogCatPassed() {
        WordServiceTwo test = new WordServiceTwo();
        String actual = test.findMostFrequentWord("Funny black cat jumps over the black dog. The black cat is so quick");
        String expected = "black";
        testResult(expected, actual, "Test DogCatPassed");
    }

    void findMostFrequentWordTestDogCatFailed() {
        WordServiceTwo test = new WordServiceTwo();
        String actual = test.findMostFrequentWord("Funny black cat jumps over the black dog. The black cat is so quick");
        String expected = "dog";
        testResult(expected, actual, "Test DogCatFailed");
    }

    void testResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + "Test Passed");
        } else {
            System.out.println(testName + "Test Failed");
        }
    }
}
