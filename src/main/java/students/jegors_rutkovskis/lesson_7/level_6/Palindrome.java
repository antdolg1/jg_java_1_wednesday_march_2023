package students.jegors_rutkovskis.lesson_7.level_6;

class Palindrome {
    boolean isPalindrome(String text) {
        String[] charArray = extractLetters(text);
        int halfLength = charArray.length / 2;
        for (int i = 0; i < halfLength; i++) {
            if (!charArray[i].equals(charArray[charArray.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
    private String[] extractLetters(String text) {
        return text.replaceAll("[^a-zA-Zа-яА-Я]", "")
                .toLowerCase()
                .split("");
    }
}
