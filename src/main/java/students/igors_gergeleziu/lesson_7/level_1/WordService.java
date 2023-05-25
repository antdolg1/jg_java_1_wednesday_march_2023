package students.igors_gergeleziu.lesson_7.level_1;

class WordService {
    private String text;

    String getTextToLowerCase(String text) {
        return text.toLowerCase();
    }

    String getTextWithoutSymbols(String text) {
        return text.replaceAll("[@#$%-+^,!]*", "");
    }

    String[] getSplittedString(String text) {
        String[] stringsArray = text.split(" ");
        return stringsArray;
    }

    String findMostFrequentWord(String text) {
        String[] stringsArray = getSplittedString(text);//Fill array with splitted string, putting every word in array cell
        int countLinks[] = new int[]{-1, 0};//Array which will contain 'link' to a frequent word in array of strings and it's counter
        for (int i = 0; i < stringsArray.length; i++) {
            if (!stringsArray[countLinks[1]].equals(stringsArray[i]) || countLinks[0] < 0) {// Not equal to next word, or counter less than zero
                int counter = 1;
                for (int j = i + 1; j < stringsArray.length; j++) {
                    if (stringsArray[i].equals(stringsArray[j])) {//Seeking for next equal words in array
                        counter++;
                    }
                }
                if (countLinks[0] < counter) {//If word repeated more times than another
                    countLinks[0] = counter;  //We put number of times the word was found in array cell[0]
                    countLinks[1] = i;        //Link to a word will contain cell[1]
                }
            }
        }
        System.out.println("Most frequent word is: " + stringsArray[countLinks[1]] + " (found " + countLinks[0] + " times)");
        return stringsArray[countLinks[1]];//Return the most frequent word
    }
}
