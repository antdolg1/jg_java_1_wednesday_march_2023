package students.igors_gergeleziu.lesson_7.level_6.task_11;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.shouldBePalindromeTest1();
        test.shouldBePalindromeTest2();
        test.shouldBePalindromeTest3();
        test.shouldBePalindromeTest4();
        test.shouldNotBePalindromeTest1();
        test.shouldNotBePalindromeTest2();
        test.shouldNotBePalindromeTest3();
    }

    void shouldBePalindromeTest1() {
        Palindrome palindrome = new Palindrome();
        String text = "racecar";
        checkResult(palindrome.isPalindrome(text), "shouldBePalindromeTest1");
    }

    void shouldBePalindromeTest2() {
        Palindrome palindrome = new Palindrome();
        String text = "level";
        checkResult(palindrome.isPalindrome(text), "shouldBePalindromeTest2");
    }

    void shouldBePalindromeTest3() {
        Palindrome palindrome = new Palindrome();
        String text = "sum summus mus";
        checkResult(palindrome.isPalindrome(text), "shouldBePalindromeTest3");
    }

    void shouldBePalindromeTest4() {
        Palindrome palindrome = new Palindrome();
        String text = "А роза упала на лапу Азора";
        checkResult(palindrome.isPalindrome(text), "shouldBePalindromeTest4");
    }

    void shouldNotBePalindromeTest1() {
        Palindrome palindrome = new Palindrome();
        String text = "Hello World";
        checkResult(!palindrome.isPalindrome(text), "shouldNotBePalindromeTest1");
    }

    void shouldNotBePalindromeTest2() {
        Palindrome palindrome = new Palindrome();
        String text = "A";
        checkResult(!palindrome.isPalindrome(text), "shouldNotBePalindromeTest2");
    }

    void shouldNotBePalindromeTest3() {
        Palindrome palindrome = new Palindrome();
        String text = "AB";
        checkResult(!palindrome.isPalindrome(text), "shouldNotBePalindromeTest3");
    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
