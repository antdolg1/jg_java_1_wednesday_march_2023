package students.jegors_rutkovskis.lesson_7.level_6;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.shouldReturnTrueIfPalindrome();
        test.shouldReturnFalseIfNotPalindrome();
        test.shouldReturnFalseIfNotPalindrome2();
    }
    void shouldReturnTrueIfPalindrome() {
        Palindrome victim = new Palindrome();
        boolean actual = victim.isPalindrome("А роза, упала на лапу Азора");
        testResult(true, actual, "should Return True If Palindrome");

        boolean actual2 = victim.isPalindrome("RotOr");
        testResult(true, actual2, "should Return True If Palindrome");
    }
    void shouldReturnFalseIfNotPalindrome() {
        Palindrome victim = new Palindrome();
        boolean actual = victim.isPalindrome("Hello, world");
        testResult(false, actual, "shouldReturnFalseIfNotPalindrome");
    }
    void shouldReturnFalseIfNotPalindrome2() {
        Palindrome victim = new Palindrome();
        boolean actual = victim.isPalindrome("А роза, не является палиндромом лапу Азора");
        testResult(false, actual, "shouldReturnFalseIfNotPalindromeInTheMiddleOfText");
    }

    private void testResult(boolean expected,
                            boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " --> TEST PASSED!");
        } else {
            System.err.println(testName + " --> TEST FAILED!");
            System.err.println("Expected: " + expected + ", but actual is: " + actual);
        }
    }
}
