package students.jegors_rutkovskis.lesson_13.level_5;

class StringCalculator {
    int add(String numbers) {
        if (numbers.isBlank()) {
            return 0;
        }
        String[] stringArr = numbers.split("[/;,\n]");
        int result = 0;
        for (String s : stringArr) {
            result += Integer.parseInt(s.trim());
        }
        return result;
    }
}
