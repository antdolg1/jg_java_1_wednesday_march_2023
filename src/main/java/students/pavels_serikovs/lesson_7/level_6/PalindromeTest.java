package students.pavels_serikovs.lesson_7.level_6;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.shouldReturnTruePalindromeOne();
        test.shouldReturnFalsePalindrome();
        test.shouldReturnTruePalindromeTwo();
    }

    public void shouldReturnTruePalindromeOne() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("radar");
        testResult(true, actual, "shouldReturnTruePalindromeOne");
    }

    public void shouldReturnFalsePalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("Palindrome");
        testResult(false, actual, "shouldReturnFalsePalindrome");
    }

    public void shouldReturnTruePalindromeTwo() {
        Palindrome palindrome = new Palindrome();
        boolean actual = palindrome.isPalindrome("Too bad I hid a boot");
        testResult(true, actual, "shouldReturnTruePalindromeTwo");
    }

    public void testResult(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " Test passed");
        } else {
            System.out.println(testName + " Test failed");
        }
    }
}
