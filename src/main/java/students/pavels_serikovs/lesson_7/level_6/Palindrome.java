package students.pavels_serikovs.lesson_7.level_6;

public class Palindrome {
    public boolean isPalindrome(String text) {
        String processedText = text.replaceAll("\\s+", "").toLowerCase();
        char[] charArray = processedText.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
