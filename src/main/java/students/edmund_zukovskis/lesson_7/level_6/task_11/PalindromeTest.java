package students.edmund_zukovskis.lesson_7.level_6.task_11;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void isPalindromePositive() {
        Palindrome palindrome = new Palindrome();

        Assert.assertTrue(palindrome.isPalindrome("Was it a car or a cat I saw"));
        Assert.assertTrue(palindrome.isPalindrome("Never a foot too far even"));
    }

    @Test
    public void isPalindromeNegative() {
        Palindrome palindrome = new Palindrome();

        Assert.assertFalse(palindrome.isPalindrome("Some random text that is not palindrome"));
        Assert.assertFalse(palindrome.isPalindrome("Also not palindrome"));
    }
}
