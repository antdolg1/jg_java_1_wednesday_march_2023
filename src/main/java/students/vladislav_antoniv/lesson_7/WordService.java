package students.vladislav_antoniv.lesson_7;

import java.util.Scanner;

class WordService {
    //чтение кода сверху вниз, в программе описаны функции в их порядке использования
    public static String getStringFromUser() {  //изначально название было getInput, было принято решение использовать более содержательное имя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        return text;
    }

    public static String findMostFrequentWordInString(String text) {
        int count = 0;
        int max = 0;
        String mostFrequentWordAndCount = "";
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                    //System.out.println(count);
                }
            }
            if (count > max) {
                max = count;
                mostFrequentWordAndCount = array[i] + ";" + max;
            }
        }
        return mostFrequentWordAndCount; //функция возвращает строку слово;количество раз
    }

    public static void printMostFrequentWordAndHowManyTimesItWasUsed(String mostFrequentWordAndCount) {
        //функция разделяет строку, этим удалось избежать увеличения передаваемых параметров, после печатает в консоль
        String[] array = mostFrequentWordAndCount.split(";");
        System.out.println("The most frequent word in your text is: " + array[0] + ", it is used " + array[1] + " times");
    }

    public static void main(String[] args) {
        printMostFrequentWordAndHowManyTimesItWasUsed(findMostFrequentWordInString(getStringFromUser()));
    }
}