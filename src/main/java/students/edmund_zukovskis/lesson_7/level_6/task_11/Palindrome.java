package students.edmund_zukovskis.lesson_7.level_6.task_11;

public class Palindrome {
    public boolean isPalindrome(String text) {

        String cleanText = text.toLowerCase().replaceAll("\\s+", "");

        char[] charArray = cleanText.toCharArray();

        for (int i = 0, j = charArray.length - 1; i < charArray.length / 2; i++, j--) {
            if (charArray[i] != charArray[j]) {
                return false;
            }
        }

        return true;
    }

}
