package students.andrej_mihailicenko.lesson_7.level_1;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.mostFrequentWordAndrey();
        wordServiceTest.mostFrequentSameWords();
        wordServiceTest.mostFrequentRandomCase();
    }

    public void mostFrequentWordAndrey() {
        WordService detector = new WordService();
        String testString = "Andrey, Nikita, Vladimir, Andrey, Andrey";
        String expectedResult = "andrey";
        String actualResult = detector.findMostFrequentWord(testString);
        checkTestResult(actualResult.equals(expectedResult), "Two Andrey Test");
    }

    public void mostFrequentSameWords() {
        WordService detector = new WordService();
        String testString = "Two, Nikita, Vladimir,Andrey ,Two, Andrey";
        String expectedResult = "two";
        String actualResult = detector.findMostFrequentWord(testString);
        checkTestResult(actualResult.equals(expectedResult), "Identic word frequent Test");
    }

    public void mostFrequentRandomCase() {
        WordService detector = new WordService();
        String testString = "Two, NikIta, VlaDImir,Andrey ,TWo, Andrey, TWO";
        String expectedResult = "two";
        String actualResult = detector.findMostFrequentWord(testString);
        checkTestResult(actualResult.equals(expectedResult), "Random Case word frequent Test");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " FAIL!");
        }
    }
}
