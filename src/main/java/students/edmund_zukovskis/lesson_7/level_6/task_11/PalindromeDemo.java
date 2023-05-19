package students.edmund_zukovskis.lesson_7.level_6.task_11;

public class PalindromeDemo {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("level"));
        System.out.println(palindrome.isPalindrome("Test"));
        System.out.println(palindrome.isPalindrome("А роза упала на лапу Азора"));
    }
}
