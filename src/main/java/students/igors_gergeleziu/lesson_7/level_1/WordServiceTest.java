package students.igors_gergeleziu.lesson_7.level_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldFormatTextToLowerCaseTest();
        test.shouldFormatTextDeletingSymbolsTest();
        test.shouldSplitStringOnCellsInArrayTest();
        test.shouldReturnWordHelloAsFrequentTest();
        test.shouldReturnWordHelloAsFirstFrequentTest();
        test.shouldReturnEmptySpaceTest();
    }

    void shouldFormatTextToLowerCaseTest() {
        WordService wordService = new WordService();
        String text = "HELLO WORLD! HELLO WORLD!";
        String result = "hello world! hello world!";
        checkResult(result.equals(wordService.getTextToLowerCase(text)), "shouldFormatTextToLowerCaseTest");
    }

    void shouldFormatTextDeletingSymbolsTest() {
        WordService wordService = new WordService();
        String text = "*!@#$%";
        checkResult(wordService.getTextWithoutSymbols(text).equals(""), "shouldFormatTextReplacingSymbolsWithEmptySpacesTest");
    }

    void shouldSplitStringOnCellsInArrayTest() {
        WordService wordService = new WordService();
        String text = "Hello world hello world";
        String[] array = wordService.getSplittedString(text);
        checkResult(array[0].equals("Hello"), "shouldSplitStringOnCellsInArrayTest");
    }

    void shouldReturnWordHelloAsFrequentTest() {
        WordService wordService = new WordService();
        String text = "Hello world, hello, hello world!";
        String textLowerCase = wordService.getTextToLowerCase(text);
        String textWithoutSymbols = wordService.getTextWithoutSymbols(textLowerCase);
        checkResult(wordService.findMostFrequentWord(textWithoutSymbols).equals("hello"), "shouldReturnWordHelloAsFrequentTest");
    }

    void shouldReturnWordHelloAsFirstFrequentTest() {
        WordService wordService = new WordService();
        String text = "Hello world, hello, hello world! World";
        String textLowerCase = wordService.getTextToLowerCase(text);
        String textWithoutSymbols = wordService.getTextWithoutSymbols(textLowerCase);
        checkResult(wordService.findMostFrequentWord(textWithoutSymbols).equals("hello"), "shouldReturnWordHelloAsFirstFrequentTest");
    }

    void shouldReturnEmptySpaceTest() {
        WordService wordService = new WordService();
        String text = "**!@#$%,";
        String textLowerCase = wordService.getTextToLowerCase(text);
        String textWithoutSymbols = wordService.getTextWithoutSymbols(textLowerCase);
        checkResult(wordService.findMostFrequentWord(textWithoutSymbols).equals(""), "shouldReturnEmptySpaceTest");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
