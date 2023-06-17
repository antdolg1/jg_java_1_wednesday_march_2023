package students.pavels_serikovs.lesson_7.level_1;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWordTestDogCatPassed();
        test.findMostFrequentWordTestDogCatFailed();
    }

    void findMostFrequentWordTestDogCatPassed() {
        WordService test = new WordService();
        String actual = test.findMostFrequentWord("Dog Cat Dog Dog Cat");
        String expected = "Dog";
        testResult(expected, actual, "Test DogCatPassed");
    }

    void findMostFrequentWordTestDogCatFailed() {
        WordService test = new WordService();
        String actual = test.findMostFrequentWord("Dog Cat Dog Cat Cat");
        String expected = "Dog";
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
